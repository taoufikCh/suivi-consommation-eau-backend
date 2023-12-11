package com.service.report.service.gRPC;

import com.service.report.stub.SchoolServiceGrpc;
import com.service.report.stub.SchoolServiceOuterClass;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    @GrpcClient("schoolService")
    private SchoolServiceGrpc.SchoolServiceBlockingStub schoolServiceStub;

    public byte[] generateReportForSchools(List<SchoolServiceOuterClass.School> schools) {


        // Extract the PDF report data from the response
        byte[] pdfReportData = generatePdfReport(schools);

        // Process the PDF report data as needed in the Report Microservice
        return pdfReportData;
    }

    // Replace this method with your actual report generation logic
    private byte[] generatePdfReport(List<SchoolServiceOuterClass.School>schools) {
        // Implement your PDF report generation logic here
        // Return the generated PDF report as a byte array
        return new byte[0]; // Replace with actual PDF data
    }
}
