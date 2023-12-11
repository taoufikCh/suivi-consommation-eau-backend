package com.service.consommationgrpcclient.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.consommationgrpcclient.dto.ConsommationDto;
import com.service.consommationgrpcclient.dto.FilterParamsConsommation;
import com.service.consommationgrpcclient.dto.FilterRequest;
import com.service.consommationgrpcclient.models.Bordereau;
import com.service.consommationgrpcclient.models.Consommation;
import com.service.consommationgrpcclient.services.BordereauService;
import com.service.consommationgrpcclient.services.ConsommationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/consommation")
@CrossOrigin
@RequiredArgsConstructor
public class ConsommationController {

    @Autowired
    private ConsommationService consommationService;
    private final WebClient.Builder webClient;
    @Autowired
    private final ObjectMapper objectMapper;
    @Autowired
    private BordereauService bordereauService;

    @GetMapping
    public List<Consommation> getAllCompteurs(){
        return consommationService.getAllConsommations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getConsommationById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(consommationService.getConsommationById(id));
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data with ID " + id + " not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PostMapping
    public ResponseEntity<Object> saveCompteur(@RequestBody Consommation consommation){
        try {
            Consommation data = consommationService.createConsommation(consommation);
            return ResponseEntity.ok(data);
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Une erreur s'est produite";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCosommation(@RequestBody Consommation consommation){
        try {
            Consommation updateData = consommationService.updateConsommation(consommation);
            return ResponseEntity.ok(updateData);
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Une erreur s'est produite";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteConsommation(@PathVariable Long id) {

        if(consommationService.deleteConsommation(id))
            return ResponseEntity.ok("Data with ID " + id + " has been deleted");
        else
            // Handle the exception when the ID is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Data with ID " + id + " not found and could not be deleted");
    }
    @GetMapping("/compteur/{id}")
    public ResponseEntity<Object> getCosommationsByCompteur(@PathVariable Long id){
        try {
            return ResponseEntity.ok(consommationService.getCosommationsByCompteur(id));

        }  catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data with ID " + id + " not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PostMapping("/delete-rows")
    public void DeleteRows(@RequestBody List<Consommation> consommations) {
        try {

            System.out.println(consommations);
            for (Consommation consommation : consommations) {
                long consommationId =  consommation.getId();
                this.deleteConsommation(consommationId);
            }
        } catch (Exception e) {
        }
    }
    @PostMapping("/filter")
    public ResponseEntity<Object> getCosommationsByfilter(@RequestBody FilterRequest filterRequest){
        try {
            System.out.println("FilterRequest +"+filterRequest);
            return ResponseEntity.ok(consommationService.getCosommationsByFilters(filterRequest.getCompteurId(),
                    filterRequest.getDateDebut(), filterRequest.getDateFin()));

        }  catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @GetMapping("/filter/{id}/{date_debut}/{date_fin}")
    public ResponseEntity<Object> getCosommationsStatistique(@RequestParam List<Long> id, String date_debut,
                                                             String date_fin ){
        try {

            return ResponseEntity.ok(consommationService.getCosommationsByFilters(id,
                    date_debut, date_fin));

        }  catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @PostMapping(value = "/consommation-list-report", produces = MediaType.APPLICATION_PDF_VALUE)
    public Mono<byte[]> generateConsommationsListReport(@RequestHeader Map<String, String> headers,
                                                        //@RequestParam Map<String, String> queryParams,
                                                        @RequestBody Map<String, Object> queryParams) {

       // Object filterParamsJson = queryParams.get("filterparams");
        System.out.println("queryParams "+queryParams);
       // System.out.println("type "+queryParams.getClass());
        //Map<String, String> filterParamsMap = objectMapper.readValue(queryParams, Map.class);

        try {

            String filterParamsJson = (String) queryParams.get("filterparams");
            System.out.println("filterParamsJson " + filterParamsJson);

            //String filterParamsJson = queryParams.get("filterparams");
            //System.out.println("filterParamsJson "+filterParamsJson);


            String consommationsJson = (String) queryParams.get("consommations");
            System.out.println("consommationsFilterJson "+consommationsJson);

            FilterParamsConsommation filterData = new FilterParamsConsommation();

            // Convert JSON string to Consommation object
            List<ConsommationDto> consommationsList = objectMapper.readValue(
                    consommationsJson,
                    new TypeReference<List<ConsommationDto>>() {}
            );
            System.out.println(consommationsList);
            if(filterParamsJson!=null){
                filterData = objectMapper.readValue(filterParamsJson, FilterParamsConsommation.class);
            }
            System.out.println("filter data "+filterData);
            // Add the headers from the @RequestHeader to the WebClient
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            webClient.defaultHeader(entry.getKey(), entry.getValue());
        }

        HashMap<String, Object> requestBody = new HashMap<>();
        requestBody.put("consommations", consommationsList);
        requestBody.put("filterParam", filterData);
       /* return webClient.build()
                .get()
                .uri("http://localhost:8222/api/v1/reports/pdfListConsommations")
                .retrieve()
                .bodyToMono(byte[].class);*/

        return webClient.build()
                .post()
                .uri("http://localhost:8222/api/v1/reports/pdfListConsommations")
                .body(BodyInserters.fromValue(requestBody))
                .retrieve()
                .bodyToMono(byte[].class);
        } catch (Exception e) {
            // Handle JSON parsing exception
            e.printStackTrace();
            return Mono.error(e);
        }
    }



}
