package com.service.report.controller;

import com.service.report.dto.*;
import com.service.report.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

@RestController
@RequestMapping("/api/v1/statistique")
@RequiredArgsConstructor
public class StatisticController {

    @Autowired
    private final WebClient.Builder webClient;
    //private StatisticService statisticService;


    @PostMapping("/statistiqueConsommation")
    public List<ConsumptionStatistics> getConsommationStatisticsLocal(@RequestBody FilterConsommationStatistic filterParam, @RequestHeader Map<String, String> headers) {
        System.out.println("test");
        System.out.println(filterParam);
        List<ConsumptionStatistics> statisticsList = new ArrayList<>();

        try {
            System.out.println(filterParam);
            /*for (Map.Entry<String, String> entry : headers.entrySet()) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                webClient.defaultHeader(entry.getKey(), entry.getValue());
            }*/
            System.out.println(filterParam);
            Flux<LocalDto> locauxFlux = webClient.build()
                    .get()
                    .uri("http://localhost:8011/api/v1/local/region/" + filterParam.getRegionId())
                    .retrieve()
                    .bodyToFlux(LocalDto.class);

            /*Mono<LocalDto[]> locaux = webClient.build()
                    .get()
                    .uri("http://localhost:8011/api/v1/local/region/" + filterParam.getRegionId())
                    //.body List.class)
                    .retrieve()
                    .bodyToMono(LocalDto[].class);
            System.out.println("locaux "+locaux);
            System.out.println(locaux);
            List<LocalDto> locauxList = locaux
                    .flatMapMany(Flux::fromArray) // Convert Mono<LocalDto[]> to Flux<LocalDto>
                    .collectList() // Collect all elements emitted by Flux into a List
                    .block(); // Block to wait for the result synchronously

            System.out.println(locauxList);

// Handle the list asynchronously*/


            List<LocalDto> locauxList = locauxFlux.collectList().block(); // Collect Flux into List synchronously
           System.out.println(locauxList);

            if (locauxList != null) {
                for (LocalDto local : locauxList) {
                   double totalAverageConsumption = 0.0;
                    Flux<CompteurDto> compteurFlux = webClient.build()
                            .get()
                            .uri("http://localhost:8013/api/v1/compteur/local/" + local.getId())
                            .retrieve()
                            .bodyToFlux(CompteurDto.class); // Convert to Flux<LocalDto>

                    List<CompteurDto> compteurDtoList = compteurFlux.collectList().block(); // Collect Flux into List synchronously
                    System.out.println(compteurDtoList);

                    if (compteurDtoList != null) {

                        double consumptionCompteur = 0.0;
                        for (CompteurDto compteur : compteurDtoList) {

                            System.out.println("local "+local);
                            Mono<ConsommationStatisticDto[]> consommationsFlux;

                            if (!filterParam.getDateDebut().isEmpty() && !filterParam.getDateFin().isEmpty()) {

                                List<Long> ids = new ArrayList<>();
                                ids.add(compteur.getId());
                                HashMap<String, Object> requestBody = new HashMap<>();
                                requestBody.put("compteurId", ids);
                                requestBody.put("dateDebut", filterParam.getDateDebut());
                                requestBody.put("dateFin", filterParam.getDateFin());
                                consommationsFlux = webClient.build()
                                        .post()
                                        .uri("http://localhost:8021/api/v1/consommation/filter")
                                        .body(BodyInserters.fromValue(requestBody))
                                        .retrieve()
                                        .bodyToMono(ConsommationStatisticDto[].class);


                            } else {
                                consommationsFlux = webClient.build()
                                        .get()
                                        .uri("http://localhost:8021/api/v1/consommation/compteur/"+compteur.getId())
                                        .retrieve()
                                        .bodyToMono(ConsommationStatisticDto[].class);
                            }
                            //List<ConsommationStatisticDto> consommationDtos = consommationsFlux.collectList().block();
                            List<ConsommationStatisticDto> consommationDtos = consommationsFlux
                                    .flatMapMany(Flux::fromArray) // Convert Mono<LocalDto[]> to Flux<LocalDto>
                                    .collectList() // Collect all elements emitted by Flux into a List
                                    .block();
                            System.out.println(consommationDtos);
                            if (consommationDtos != null) {
                              double  totalConsumption = 0.0;
                                for (ConsommationStatisticDto consommation : consommationDtos) {
                                    totalConsumption += consommation.getQuantite();
                                }
                                consumptionCompteur += (totalConsumption / consommationDtos.size());
                            }
                        }
                         totalAverageConsumption += (consumptionCompteur / compteurDtoList.size());


                    }
                    else{
                        totalAverageConsumption =0;
                    }
                    System.out.println("local.getCode() "+local.getCode()+" , totalAverageConsumption "+totalAverageConsumption);
                    statisticsList.add(new ConsumptionStatistics(local.getCode(), totalAverageConsumption));
                }
            }
        } catch (Exception e) {
            // Handle exceptions here (logging, throwing custom exceptions, etc.)
            System.out.println(""+e.getMessage());
            e.printStackTrace();
        }

        return statisticsList;
    }


    @PostMapping("/statistiqueByLocal")
    public Map<String, Object> getStatisticsByLocal(@RequestBody Long id, @RequestHeader Map<String, String> headers) {

        System.out.println(id);
        //List<ConsumptionStatistics> statisticsList = new ArrayList<>();
        Map<String, Object> statisticsList = new HashMap<>();

        try {
            /*for (Map.Entry<String, String> entry : headers.entrySet()) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                webClient.defaultHeader(entry.getKey(), entry.getValue());
            }*/

                    double totalAverageConsumption = 0.0;
                    Flux<CompteurDto> compteurFlux = webClient.build()
                            .get()
                            .uri("http://localhost:8013/api/v1/compteur/local/" + id)
                            .retrieve()
                            .bodyToFlux(CompteurDto.class); // Convert to Flux<LocalDto>

                    List<CompteurDto> compteurDtoList = compteurFlux.collectList().block(); // Collect Flux into List synchronously
                    System.out.println(compteurDtoList);

                    if (compteurDtoList != null) {

                        double consumptionCompteur = 0.0;
                        for (CompteurDto compteur : compteurDtoList) {
                            Map<String, Double> localConsumptionMap = new HashMap<>();
                            System.out.println("compteur "+compteur);
                            Mono<ConsommationStatisticDto[]> consommationsFlux = webClient.build()
                                        .get()
                                        .uri("http://localhost:8021/api/v1/consommation/compteur/"+compteur.getId())
                                        .retrieve()
                                        .bodyToMono(ConsommationStatisticDto[].class);

                            //List<ConsommationStatisticDto> consommationDtos = consommationsFlux.collectList().block();
                            List<ConsommationStatisticDto> consommationDtos = consommationsFlux
                                    .flatMapMany(Flux::fromArray) // Convert Mono<LocalDto[]> to Flux<LocalDto>
                                    .collectList() // Collect all elements emitted by Flux into a List
                                    .block();
                            System.out.println(consommationDtos);
                            if (consommationDtos != null) {

                                for (ConsommationStatisticDto consommation : consommationDtos) {

                                    localConsumptionMap.put(consommation.getDateFin().toString(),
                                            consommation.getQuantite());
                                }

                            }
                            statisticsList.put(compteur.getRefCompteur(),localConsumptionMap);
                        }



                    }

        } catch (Exception e) {
            // Handle exceptions here (logging, throwing custom exceptions, etc.)
            System.out.println(""+e.getMessage());
            e.printStackTrace();
        }

        return statisticsList;
    }

    @PostMapping("/statistiqueTypeLocal")
    public Map<String, Object> getConsommationStatisticsTypeLocal(@RequestBody FilterConsommationStatistic filterParam, @RequestHeader Map<String, String> headers) {
        System.out.println(filterParam);
        //List<String, Double> statisticsList = new ArrayList<>();
        Map<String, Object> statisticsList = new HashMap<>();
        Map<String, Double> TypeLocalList = new HashMap<>();
        Map<String, Double> NatureLocalList = new HashMap<>();
        Map<String, Double> typeLocalConsumptionMap = new HashMap<>();
        Map<String, Double> natureExerciseConsumptionMap = new HashMap<>();


        try {
            System.out.println(filterParam);
            /*for (Map.Entry<String, String> entry : headers.entrySet()) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                webClient.defaultHeader(entry.getKey(), entry.getValue());
            }*/
            System.out.println(filterParam);
            Flux<LocalDtos> locauxFlux = webClient.build()
                    .get()
                    .uri("http://localhost:8011/api/v1/local/region/" + filterParam.getRegionId())
                    .retrieve()
                    .bodyToFlux(LocalDtos.class);

            List<LocalDtos> locauxList = locauxFlux.collectList().block(); // Collect Flux into List synchronously
            System.out.println(locauxList);

            if (locauxList != null) {
                for (LocalDtos local : locauxList) {
                    double totalAverageConsumption = 0.0;
                    Flux<CompteurDto> compteurFlux = webClient.build()
                            .get()
                            .uri("http://localhost:8013/api/v1/compteur/local/" + local.getId())
                            .retrieve()
                            .bodyToFlux(CompteurDto.class); // Convert to Flux<LocalDto>

                    List<CompteurDto> compteurDtoList = compteurFlux.collectList().block(); // Collect Flux into List synchronously
                    System.out.println(compteurDtoList);

                    if (compteurDtoList != null) {

                        double consumptionCompteur = 0.0;
                        for (CompteurDto compteur : compteurDtoList) {

                            System.out.println("local "+local);
                            Mono<ConsommationStatisticDto[]> consommationsFlux;

                            if (!filterParam.getDateDebut().isEmpty() && !filterParam.getDateFin().isEmpty()) {

                                List<Long> ids = new ArrayList<>();
                                ids.add(compteur.getId());
                                HashMap<String, Object> requestBody = new HashMap<>();
                                requestBody.put("compteurId", ids);
                                requestBody.put("dateDebut", filterParam.getDateDebut());
                                requestBody.put("dateFin", filterParam.getDateFin());
                                consommationsFlux = webClient.build()
                                        .post()
                                        .uri("http://localhost:8021/api/v1/consommation/filter")
                                        .body(BodyInserters.fromValue(requestBody))
                                        .retrieve()
                                        .bodyToMono(ConsommationStatisticDto[].class);


                            } else {
                                consommationsFlux = webClient.build()
                                        .get()
                                        .uri("http://localhost:8021/api/v1/consommation/compteur/"+compteur.getId())
                                        .retrieve()
                                        .bodyToMono(ConsommationStatisticDto[].class);
                            }
                            //List<ConsommationStatisticDto> consommationDtos = consommationsFlux.collectList().block();
                            List<ConsommationStatisticDto> consommationDtos = consommationsFlux
                                    .flatMapMany(Flux::fromArray) // Convert Mono<LocalDto[]> to Flux<LocalDto>
                                    .collectList() // Collect all elements emitted by Flux into a List
                                    .block();
                            System.out.println(consommationDtos);
                            if (consommationDtos != null) {
                                double  totalConsumption = 0.0;
                                for (ConsommationStatisticDto consommation : consommationDtos) {
                                    totalConsumption += consommation.getQuantite();

                                }
                                consumptionCompteur += (totalConsumption / consommationDtos.size());
                            }
                        }
                        totalAverageConsumption += (consumptionCompteur / compteurDtoList.size());


                    }
                    else{
                        totalAverageConsumption =0;
                    }

                    TypeLocal localType = local.getType_local();
                    String typeDesignation = localType.getDesignation();
                    double totalConsumptionForType = typeLocalConsumptionMap.getOrDefault(typeDesignation, 0.0);
                    totalConsumptionForType += totalAverageConsumption;
                    System.out.println("typeDesignation "+typeDesignation);
                    System.out.println("totalConsumptionForType "+totalConsumptionForType);
                    if(totalConsumptionForType>0.0){
                        typeLocalConsumptionMap.put(typeDesignation, totalConsumptionForType);
                        System.out.println(typeLocalConsumptionMap);
                    }

                    // Calculate the consumption for each NatureExercise and update the map
                    NatureExercise localNatureExercise = local.getNature_exercise(); // Assuming LocalDto has a method to get the nature of exercise
                    String natureExercice = localNatureExercise.getDesignation();
                    double totalConsumptionForExercise = natureExerciseConsumptionMap.getOrDefault(natureExercice, 0.0);
                    totalConsumptionForExercise += totalAverageConsumption;
                    if(totalConsumptionForExercise>0.0){
                        natureExerciseConsumptionMap.put(natureExercice, totalConsumptionForExercise);
                    }
                    else{
                        totalConsumptionForExercise = 0;

                        natureExerciseConsumptionMap.put(natureExercice, totalConsumptionForExercise);
                    }



                }

                typeLocalConsumptionMap.forEach((typeDesignation, consumption) -> {
                    System.out.println("typeDesignation "+typeDesignation);
                    System.out.println("consumption "+consumption);

                    TypeLocalList.put(typeDesignation, consumption);
                });

                // Convert the Map into a list of maps containing nature of exercise as keys
                List<Map<String, Object>> natureExerciseStatisticsList = new ArrayList<>();
                natureExerciseConsumptionMap.forEach((natureExercise, consumption) -> {
                    Map<String, Object> consumptionMap = new HashMap<>();
                    consumptionMap.put(natureExercise, consumption);
                    natureExerciseStatisticsList.add(consumptionMap);

                    NatureLocalList.put(natureExercise, consumption);


                });
            }
            statisticsList.put("typeLocal", TypeLocalList);
            statisticsList.put("natureExercise", NatureLocalList);
        } catch (Exception e) {
            // Handle exceptions here (logging, throwing custom exceptions, etc.)
            System.out.println(""+e.getMessage());
            e.printStackTrace();
        }

        return statisticsList;
    }





}
