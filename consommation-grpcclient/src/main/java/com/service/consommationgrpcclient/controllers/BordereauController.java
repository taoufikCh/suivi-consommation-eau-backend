package com.service.consommationgrpcclient.controllers;

import com.service.consommationgrpcclient.models.Bordereau;
import com.service.consommationgrpcclient.models.Consommation;
import com.service.consommationgrpcclient.services.BordereauService;
import com.service.consommationgrpcclient.services.ConsommationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bordereau")
@CrossOrigin
@RequiredArgsConstructor
public class BordereauController {

        @Autowired
        private BordereauService bordereauService;


        @GetMapping
        public List<Bordereau> getAllBordereaux(){
            return bordereauService.getAllBordereaux();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Object> getBordereauById(@PathVariable Long id) {
            try {
                return ResponseEntity.ok(bordereauService.getBordereauById(id));
            } catch (Exception e) {
                // Handle the exception when the ID is not found
                String errorMessage = "Data with ID " + id + " not found";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
            }
        }
        @PostMapping
        public ResponseEntity<Object> saveBordereau(@RequestBody Bordereau bordereau){
            try {

                //bordereau.setCode(bordereauService.getCurrentTimestamp().toString());
                bordereau.setDateGeneration(bordereauService.getCurrentDate());
                return ResponseEntity.ok(bordereauService.createBordereau(bordereau));
            } catch (Exception e) {
                // Handle the exception when the ID is not found
                String errorMessage = "Une erreur s'est produite";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
            }
        }
       /* @PutMapping("/{id}")
        public ResponseEntity<Object> updateBordereau(@RequestBody Bordereau bordereau){
            try {


                Bordereau bordereau = Bordereau.builder()
                        .code(bordereauService.getCurrentTimestamp().toString())
                        .dateGeneration(bordereauService.getCurrentDate().toString())
                        .consommation(updateData)
                        .build();
                bordereauService.createBordereau(bordereau);

                return ResponseEntity.ok(updateData);
            } catch (Exception e) {
                // Handle the exception when the ID is not found
                String errorMessage = "Une erreur s'est produite";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
            }
        }*/

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteBordereau(@PathVariable Long id) {

            if(bordereauService.deleteBordereau(id))
                return ResponseEntity.ok("Data with ID " + id + " has been deleted");
            else
                // Handle the exception when the ID is not found
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Data with ID " + id + " not found and could not be deleted");
        }
   /* @PutMapping("/facture/{id}")
    public ResponseEntity<Object> addFactureToBordereau(@PathVariable Long id, @RequestBody Consommation consommation){
        try {
            bordereauService.addFactureToBordereau(id, consommation);
            return ResponseEntity.ok("Add success");
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Une erreur s'est produite";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }*/


}
