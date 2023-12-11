package com.service.report.controller;


import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/reports")
public class ReportController {


  /*  @PostMapping("/school")
    public String generateUserReport(HttpServletResponse response, @RequestBody List<School> schools) throws IOException, JRException {
       // List<User> users = getUsers(); // Replace with your logic to retrieve users
        System.out.println(schools);
        // Load the JasperReports template
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("list_schools.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
        //JasperReport jasperReport = JasperCompileManager.compileReport("resources/list_schools.jrxml");
        System.out.println(jasperReport);
        // Set up the data source with the list of users
        JRDataSource dataSource = new JRBeanCollectionDataSource(schools);
        System.out.println(dataSource);
        // Set up report parameters (if needed)
        // ...

        // Generate the report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
        System.out.println(jasperPrint);
        // Export the report to PDF and send it to the response output stream
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=user-report.pdf");

        OutputStream outputStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
        System.out.println("fin");
        return "Report generated successfully!";
    }*/
    /*// work !!
    @PostMapping("/schools/report")
    public ResponseEntity<String> generateReport(@RequestBody List<School> schools) throws FileNotFoundException, JRException {
         for (School school : schools) {
            System.out.println(school.toString());
        }
        String path = "D:\\report";
        File file = ResourceUtils.getFile("classpath:list_schools.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(schools);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("Created By ", "Taoufik chenini");
        JasperPrint print = JasperFillManager.fillReport(jasperReport,parameters,dataSource);
        JasperExportManager.exportReportToPdfFile(print, path+"\\list_schools.pdf");
        return ResponseEntity.ok("School report generated and printed.");
    }*/

   /* @PostMapping("/pdfSchools")
    public ResponseEntity<byte[]> generateSchoolReport(@RequestBody List<School> schools) throws FileNotFoundException, JRException {
        File file = ResourceUtils.getFile("classpath:list_schools.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        // Adding attribute names
        Map<String, Object> params = new HashMap<>();

        params.put("created by ", "taoufik chenini");

        // Fetching the student from the data database.
        final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(schools);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, source);

        // Export the JasperPrint to a byte array
        byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("inline", "SchoolList.pdf");
        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }*/
    

}
