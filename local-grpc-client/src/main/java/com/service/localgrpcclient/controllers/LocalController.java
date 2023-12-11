package com.service.localgrpcclient.controllers;

import com.flickr4java.flickr.FlickrException;
import com.service.localgrpcclient.dto.FilterRequest;
import com.service.localgrpcclient.dto.LocalDto;
import com.service.localgrpcclient.entities.*;
import com.service.localgrpcclient.mapper.LocalMapper;
import com.service.localgrpcclient.mapper.NatureExerciseMapper;
import com.service.localgrpcclient.mapper.RegionMapper;
import com.service.localgrpcclient.mapper.TypeLocalMapper;
import com.service.localgrpcclient.services.FlickrServiceImp;
import com.service.localgrpcclient.services.RegionService;
import com.service.localgrpcclient.stub.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/local")
@CrossOrigin
@RequiredArgsConstructor
public class LocalController {

    @Autowired
    private LocalMapper localMapper;
    @Autowired
    private RegionMapper regionMapper;
    @Autowired
    private NatureExerciseMapper natureExerciseMapper;
    @Autowired
    private TypeLocalMapper typeLocalMapper;
    @Autowired
    private RegionService regionService;

    @Autowired
    private FlickrServiceImp flickrService;

    @GrpcClient(value = "localService")
    private LocalServiceGrpc.LocalServiceBlockingStub localServiceBlockingStub;

    @GrpcClient(value = "localService")
    private RegionServiceGrpc.RegionServiceBlockingStub regionServiceBlockingStub;

    @GetMapping
    public List<Local> getAllLocals(){
        LocalOuterClass.GetAllLocalsRequest request =
                LocalOuterClass.GetAllLocalsRequest.newBuilder().build();
        System.out.println("request get all "+request);
        LocalOuterClass.GetAllLocalsResponse response =
                localServiceBlockingStub.getAllLocals(request);
        System.out.println("response get all "+response);
        List<LocalOuterClass.Local> localList = response.getLocalsList();
        System.out.println("response get all "+response);
        List<Local> locals =
                localList.stream().map(localMapper::fromGrpcLocal).collect(Collectors.toList());
        System.out.println("locals get all "+locals);
        return locals;
    }

    /*@GetMapping("/{id}")
    public Local localById(@PathVariable Long id){
        LocalOuterClass.GetLocalByIdRequest request =
                LocalOuterClass.GetLocalByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        LocalOuterClass.GetLocalByIdResponse response =
                localServiceBlockingStub.getLocalById(request);
        return localMapper.fromGrpcLocal(response.getLocal());
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<Object> localById(@PathVariable Long id) {
        LocalOuterClass.GetLocalByIdRequest request =
                LocalOuterClass.GetLocalByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        try {
            LocalOuterClass.GetLocalByIdResponse response =
                    localServiceBlockingStub.getLocalById(request);
            Local local = localMapper.fromGrpcLocal(response.getLocal());
            return ResponseEntity.ok(local);
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            String errorMessage = "Local with ID " + id + " not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @PostMapping
    public Local createLocal(@RequestBody Local local) {
        System.out.println("local in controller "+local);
        Region region = local.getRegion();
        System.out.println("region in controller : "+region);
        RegionOuterClass.Region r = regionMapper.fromEntity(region);
        System.out.println("region grpc : "+r);

        NatureExercise natureExercise = local.getNature_exercise();
        System.out.println("natureExercise in controller : "+natureExercise);
        NatureExerciseOuterClass.NatureExercise n = natureExerciseMapper.fromEntity(natureExercise);
        System.out.println("n in controller : "+n);

        TypeLocal typeLocal=local.getType_local();
        TypeLocalOuterClass.TypeLocal t = typeLocalMapper.fromEntity(typeLocal);

        // Create a SaveLocalRequest using the LocalRequest
        LocalOuterClass.SaveLocalRequest request = LocalOuterClass.SaveLocalRequest.newBuilder()
                .setCode(local.getCode())
                .setAdresse(local.getAdresse())
                .setRegion(r)
                .setDesignation(local.getDesignation())
                .setEtat(LocalOuterClass.LocalStatus.valueOf(local.getEtat().name()))
                .setLongitude(local.getLongitude())
                .setLatitude(local.getLatitude())
                .setImage(local.getImage())
                .setNatureExercise(n)
                .setTypeLocal(t)
                .build();
        System.out.println("request  in controller "+request);
        // Make a gRPC call to save the local
        LocalOuterClass.SaveLocalResponse response = localServiceBlockingStub.saveLocal(request);
        System.out.println("response  in controller "+response);
        // Map the gRPC response to a Local entity and return it
        return localMapper.fromGrpcLocal(response.getLocal());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Local> updateLocal(@PathVariable Long id, @RequestBody Local updateLocal) {
        try {
            // Map the incoming Local to the gRPC message LocalRequest
            System.out.println("local "+updateLocal);
            LocalOuterClass.Local localRequest = localMapper.fromLocal(updateLocal);
            System.out.println("localRequest "+localRequest);
            // Create a SaveLocalRequest using the LocalRequest
            LocalOuterClass.UpdateLocalRequest request = LocalOuterClass.UpdateLocalRequest.newBuilder()
                    .setLocal(localRequest)
                    .build();
            System.out.println("request "+request);
            // Make a gRPC call to save the local
            LocalOuterClass.UpdateLocalResponse response = localServiceBlockingStub.updateLocal(request);
            System.out.println("response "+response);

            return ResponseEntity.ok(localMapper.fromGrpcLocal(response.getLocal()));
        } catch (Exception e) {
            // Handle exceptions and return an error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    /*@DeleteMapping("/{id}")
    public void deleteLocal(@PathVariable Long id) {
        try {
            // Create a DeleteLocalRequest with the ID of the local to delete
            LocalOuterClass.DeleteLocalRequest request = LocalOuterClass.DeleteLocalRequest.newBuilder()
                    .setId(id)
                    .build();
            System.out.println("request "+request);
            // Make a gRPC call to delete the local
            localServiceBlockingStub.deleteLocal(request);

            // The local is successfully deleted; you can handle the response as needed
        } catch (Exception e) {

        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLocal(@PathVariable Long id) {
        try {
            // Create a DeleteLocalRequest with the ID of the local to delete
            LocalOuterClass.DeleteLocalRequest request = LocalOuterClass.DeleteLocalRequest.newBuilder()
                    .setId(id)
                    .build();
            System.out.println("request " + request);

            // Make a gRPC call to delete the local
            localServiceBlockingStub.deleteLocal(request);

            // The local is successfully deleted; you can handle the response as needed
            return ResponseEntity.ok("Local with ID " + id + " has been deleted");
        } catch (Exception e) {
            // Handle the exception when the ID is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Local with ID " + id + " not found and could not be deleted");
        }
    }

    @PostMapping("/delete-rows")
    public void DeleteRows(@RequestBody List<Local> locals) {
        try {

            System.out.println(locals);
            for (Local local : locals) {
                long localId =  local.getId();
                this.deleteLocal(localId);
            }
        } catch (Exception e) {
        }
    }

    @GetMapping("/region/{id}")
    public List<LocalDto> getLocalsByRegion(@PathVariable Long id){

        RegionOuterClass.Region region = regionService.regionById(id);
        System.out.println("region "+region);

        LocalOuterClass.GetLocalsByRegionRequest localRequest =
                LocalOuterClass.GetLocalsByRegionRequest.newBuilder()
                        .setRegion(region)
                        .build();
        System.out.println("localRequest in client  "+localRequest);
        LocalOuterClass.GetLocalsByRegionResponse response =
                localServiceBlockingStub.getLocalsByRegion(localRequest);
        System.out.println("response in client  "+response);
        List<LocalOuterClass.Local> localList = response.getLocalsList();
        System.out.println("localList "+localList);
        List<LocalDto> locals =
                localList.stream().map(localMapper::fromGrpcLocalDto).collect(Collectors.toList());
        System.out.println("locals "+locals);
        return locals;
    }
    @PostMapping("/filter")
    public List<LocalDto> getLocalsByFilters(@RequestBody FilterRequest filterRequest) {
        // Extract parameters from FilterRequestDto
        System.out.println("FilterRequest in filter : "+filterRequest);
        RegionOuterClass.Region region = null;
        if (filterRequest.getRegion() != null && filterRequest.getRegion().getLibille() != null) {
            region = regionMapper.fromEntity(filterRequest.getRegion());
            System.out.println("region in filter : "+region);
        }
        NatureExerciseOuterClass.NatureExercise natureExercise = null;
        if (filterRequest.getNature_exercise() != null && filterRequest.getNature_exercise().getDesignation() != null) {
            natureExercise = natureExerciseMapper.fromEntity(filterRequest.getNature_exercise());
            System.out.println("natureExercise in filter : " + natureExercise);
        }
        TypeLocalOuterClass.TypeLocal typeLocal = null;
        if(filterRequest.getType_local()!= null && filterRequest.getType_local().getDesignation() != null){
            typeLocal = typeLocalMapper.fromEntity(filterRequest.getType_local());
            System.out.println("typeLocal in filter : "+typeLocal);
        }

        // Prepare gRPC request
        LocalOuterClass.FilterRequest.Builder grpcRequest = LocalOuterClass.FilterRequest.newBuilder();
                //.build();
        if (region != null) {
            grpcRequest.setRegion(region);
        }
        if (natureExercise != null) {
            grpcRequest.setNatureExercise(natureExercise);
        }
        if (typeLocal != null) {
            grpcRequest.setTypeLocal(typeLocal);
        }
        // Call the gRPC service method to get filtered locals
        LocalOuterClass.LocalsResponse grpcResponse = localServiceBlockingStub.getLocalsByFilters(grpcRequest.build());
        List<LocalOuterClass.Local> localList = grpcResponse.getLocalsList();
        // Convert gRPC response to List<LocalDto>
        List<LocalDto> locals = localList.stream().map(localMapper::fromGrpcLocalDto).collect(Collectors.toList());

        return locals;
    }

    /*@PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file, @RequestBody Long id) {

        try {
            String fileName = file.getOriginalFilename();

            byte[] imageBytes = file.getBytes();
            flickrService.savePhoto(imageBytes);

            LocalOuterClass.GetLocalByIdRequest request =
                    LocalOuterClass.GetLocalByIdRequest.newBuilder()
                            .setId(id)
                            .build();
            // Map the incoming Local to the gRPC message LocalRequest
            System.out.println("local "+request);
            LocalOuterClass.Local localRequest = localMapper.fromLocal(request);
            System.out.println("localRequest "+localRequest);
            // Create a SaveLocalRequest using the LocalRequest
            LocalOuterClass.UpdateLocalRequest request = LocalOuterClass.UpdateLocalRequest.newBuilder()
                    .setLocal(localRequest)
                    .build();
            System.out.println("request "+request);
            // Make a gRPC call to save the local
            LocalOuterClass.UpdateLocalResponse response = localServiceBlockingStub.updateLocal(request);
            System.out.println("response "+response);

            return ResponseEntity.ok(localMapper.fromGrpcLocal(response.getLocal()));

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/



}
