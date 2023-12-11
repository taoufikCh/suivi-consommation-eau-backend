package com.service.report.controller;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.report.dto.CompteurDto;
import com.service.report.dto.ConsommationDto;
import com.service.report.dto.FilterCompteurParam;
import com.service.report.entity.Facture;
import com.service.report.dto.FilterParam;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/v1/reports")
@RequiredArgsConstructor
public class GrpcReportController {

    @Autowired
    private final ObjectMapper objectMapper;




    @PostMapping("/pdfListConsommations")
    public ResponseEntity<byte[]> generateConsommationsListReport(@RequestBody Map<String, Object> requestBody) throws FileNotFoundException, JRException {

        File file = ResourceUtils.getFile("classpath:list_consommations.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        try {
            List<ConsommationDto> consommations = (List<ConsommationDto>) requestBody.get("consommations");
        System.out.println(consommations);

        //FilterParam filterParam = (FilterParam) requestBody.get("filterData");
        // Retrieve the filterData as a Map
        Map<String, Object> filterDataMap = (Map<String, Object>) requestBody.get("filterParam");

        // Convert the Map to FilterParam class using ObjectMapper
        FilterParam filterParam = objectMapper.convertValue(filterDataMap, FilterParam.class);

        System.out.println("filterParam "+filterParam);
        System.out.println("consommations "+consommations);

        ArrayList<FilterParam> filterParams= new ArrayList<>();
        filterParams.add(filterParam);
        final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(filterParams);
        // Adding attribute names
        Map<String, Object> params = new HashMap<>();

        params.put("created by ", "Taoufik Chenini");
        params.put("FilterDataSet", source );
        params.put("FacturesReport", getFactureReport() );
        params.put("FacturesParameter", getFactureParameter(consommations) );

        // Fetching the student from the data database.

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());

        // Export the JasperPrint to a byte array
        byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("inline", "consommationsList.pdf");
        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
        } catch (Exception e) {
            // Handle JSON parsing exception
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/pdfListCompteurs")
    public ResponseEntity<byte[]> generateCompteursListReport(@RequestBody Map<String, Object> requestBody) throws FileNotFoundException, JRException {

        File file = ResourceUtils.getFile("classpath:list_compteurs.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        try {
            List<CompteurDto> compteurs = (List<CompteurDto>) requestBody.get("compteurs");
            System.out.println(compteurs);

            Map<String, Object> filterDataMap = (Map<String, Object>) requestBody.get("filterParam");

            // Convert the Map to FilterParam class using ObjectMapper
            FilterCompteurParam filterParam = objectMapper.convertValue(filterDataMap, FilterCompteurParam.class);

            System.out.println("filterParam "+filterParam);
            System.out.println("compteurs "+compteurs);

            ArrayList<FilterCompteurParam> filterParams= new ArrayList<>();
            filterParams.add(filterParam);
            final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(filterParams);
            // Adding attribute names
            Map<String, Object> params = new HashMap<>();

            params.put("created by ", "Taoufik Chenini");
            params.put("FilterDataSet", source );
            params.put("CompteursReport", getCompteurReport() );
            params.put("CompteursParameter", getCompteurParameter(compteurs) );

            // Fetching the student from the data database.

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());

            // Export the JasperPrint to a byte array
            byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("inline", "compteursList.pdf");
            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
        } catch (Exception e) {
            // Handle JSON parsing exception
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    private static JRBeanCollectionDataSource getFactureDataSource(List<ConsommationDto> consommationDtos){
       /* List<Facture> factureList = new ArrayList<>();
        factureList.add(new Facture("001","C001","","09/2022-12/2022","230",1500,"10/12/2022","oui"));
        factureList.add(new Facture("001","C001","","09/2022-12/2022","230",1000,"10/12/2022","oui"));
        factureList.add(new Facture("002","C001","","09/2022-12/2022","230",1200,"10/12/2022","oui"));
        factureList.add(new Facture("002","C001","","09/2022-12/2022","230",1100,"10/12/2022","oui"));
        */
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(consommationDtos);
        return  dataSource;
    }
    private  static Map getFactureParameter(List<ConsommationDto> consommationDtoList){
        Map<String, Object> factureParameter = new HashMap<>();
        factureParameter.put("FacturesDataSet",getFactureDataSource(consommationDtoList));
        return  factureParameter;
    }

    private static JasperReport getFactureReport()throws FileNotFoundException{
        File file = ResourceUtils.getFile("classpath:list_factures.jrxml");
        JasperReport jasperReport = null;
           try {
               jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
           } catch (JRException e){
               throw new RuntimeException(e);
           }
           return   jasperReport;

    }

    private static JRBeanCollectionDataSource getCompteurDataSource(List<CompteurDto> compteurDtos){

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(compteurDtos);
        return  dataSource;
    }
    private  static Map getCompteurParameter(List<CompteurDto> compteurDtoList){
        Map<String, Object> compteurParameter = new HashMap<>();
        compteurParameter.put("CompteursDataSet",getCompteurDataSource(compteurDtoList));
        return  compteurParameter;
    }

    private static JasperReport getCompteurReport()throws FileNotFoundException{
        File file = ResourceUtils.getFile("classpath:listCompteurs.jrxml");
        JasperReport jasperReport = null;
        try {
            jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
        } catch (JRException e){
            throw new RuntimeException(e);
        }
        return   jasperReport;

    }

}
