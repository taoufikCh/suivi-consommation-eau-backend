package com.service.compteurgrpcclient.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.compteurgrpcclient.dto.CompteurDto;
import com.service.compteurgrpcclient.dto.FilterCompteurParam;
import com.service.compteurgrpcclient.models.Compteur;
import com.service.compteurgrpcclient.models.Local;
import com.service.compteurgrpcclient.services.Compteurservice;
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

@RestController
@RequestMapping("/api/v1/compteur")
@CrossOrigin
@RequiredArgsConstructor
public class CompteurController {

    @Autowired
    private Compteurservice compteurservice;

    private final WebClient.Builder webClient;
    @Autowired
    private final ObjectMapper objectMapper;


    @GetMapping
    public List<Compteur> getAllCompteurs(){
        return compteurservice.getAllCompteur();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCompteurById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(compteurservice.getCompteurById(id));
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data with ID " + id + " not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PostMapping
    public ResponseEntity<Object> saveCompteur(@RequestBody Compteur compteur){
        try {
            return ResponseEntity.ok(compteurservice.createCompteur(compteur));
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Une erreur s'est produite";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCompteur(@RequestBody Compteur compteur){
         try {
                return ResponseEntity.ok(compteurservice.updateCompteur(compteur));
         } catch (Exception e) {
                // Handle the exception when the ID is not found
                String errorMessage = "Une erreur s'est produite";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
         }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompteur(@PathVariable Long id) {

            if(compteurservice.deleteCompteur(id))
                return ResponseEntity.ok("Data with ID " + id + " has been deleted");
            else
            // Handle the exception when the ID is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Data with ID " + id + " not found and could not be deleted");
    }
    @GetMapping("/local/{id}")
    public ResponseEntity<Object> getCompteursByLocal(@PathVariable Long id){
        try {
            return ResponseEntity.ok(compteurservice.getCompteurByLocal(id));

        }  catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Data with ID " + id + " not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }
    @PostMapping("/filter")
    public ResponseEntity<List<Compteur>> getCompteursByLocals(@RequestBody List<Local> locals){

            return  ResponseEntity.ok(compteurservice.getCompteursByLocals(locals));

    }
    @PostMapping("/delete-rows")
    public void DeleteRows(@RequestBody List<Compteur> compteurs) {
        try {

            System.out.println(compteurs);
            for (Compteur compteur : compteurs) {
                long compteurId =  compteur.getId();
                this.deleteCompteur(compteurId);
            }
        } catch (Exception e) {
        }
    }

    @PostMapping(value = "/compteur-list-report", produces = MediaType.APPLICATION_PDF_VALUE)
    public Mono<byte[]> generateConsommationsListReport(@RequestHeader Map<String, String> headers,
                                                        @RequestBody Map<String, Object> queryParams) {

        System.out.println("queryParams "+queryParams);


        try {

            String filterParamsJson = (String) queryParams.get("filterparams");
            System.out.println("filterParamsJson "+filterParamsJson);

            String compteurJson = (String) queryParams.get("compteurs");
            System.out.println("compteurJson "+compteurJson);

            FilterCompteurParam filterData = new FilterCompteurParam();

            List<CompteurDto> compteursList = objectMapper.readValue(
                    compteurJson,
                    new TypeReference<List<CompteurDto>>() {}
            );
            System.out.println(compteursList);
            if(filterParamsJson!=null){
                filterData = objectMapper.readValue(filterParamsJson, FilterCompteurParam.class);
            }
            System.out.println("filter data "+filterData);
            // Add the headers from the @RequestHeader to the WebClient
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                webClient.defaultHeader(entry.getKey(), entry.getValue());
            }

            HashMap<String, Object> requestBody = new HashMap<>();
            requestBody.put("compteurs", compteursList);
            requestBody.put("filterParam", filterData);

            return webClient.build()
                    .post()
                    .uri("http://localhost:8222/api/v1/reports/pdfListCompteurs")
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
