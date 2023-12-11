package com.service.localgrpcclient.controllers;


import com.service.localgrpcclient.entities.NatureExercise;

import com.service.localgrpcclient.mapper.NatureExerciseMapper;
import com.service.localgrpcclient.stub.NatureExerciseOuterClass;
import com.service.localgrpcclient.stub.NatureExerciseServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/natureExercise")
@CrossOrigin
@RequiredArgsConstructor
public class NatureExerciseController {

    @Autowired
    private NatureExerciseMapper natureMapper;

    @GrpcClient(value = "localService")
    private NatureExerciseServiceGrpc.NatureExerciseServiceBlockingStub natureExerciseServiceBlockingStub;

    @GetMapping
    public List<NatureExercise> getAllRows(){
        NatureExerciseOuterClass.GetAllNatureExercisesRequest request =
                NatureExerciseOuterClass.GetAllNatureExercisesRequest.newBuilder().build();
        NatureExerciseOuterClass.GetAllNatureExercisesResponse response =
                natureExerciseServiceBlockingStub.getAllNatureExercises(request);
        List<NatureExerciseOuterClass.NatureExercise> dataList = response.getNatureExercisesList();
        List<NatureExercise> rows =
                dataList.stream().map(natureMapper::fromGrpcClass).collect(Collectors.toList());
        return rows;
    }

    @GetMapping("/{id}")
    public NatureExercise getDateById(@PathVariable Long id){
        NatureExerciseOuterClass.GetNatureExerciseByIdRequest request =
                NatureExerciseOuterClass.GetNatureExerciseByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        NatureExerciseOuterClass.GetNatureExerciseByIdResponse response =
                natureExerciseServiceBlockingStub.getNatureExerciseById(request);
        return natureMapper.fromGrpcClass(response.getNatureExercise());
    }

    @PostMapping
    public NatureExercise createData(@RequestBody NatureExercise natureExercise) {
        String designation = natureExercise.getDesignation();

        NatureExerciseOuterClass.SaveNatureExerciseRequest request = NatureExerciseOuterClass.SaveNatureExerciseRequest.newBuilder()
                .setDesignation(designation)
                .build();

        NatureExerciseOuterClass.SaveNatureExerciseResponse response = natureExerciseServiceBlockingStub.saveNatureExercise(request);
       return natureMapper.fromGrpcClass(response.getNatureExercise());
    }

    @PutMapping
    public ResponseEntity<NatureExercise> updateData(@RequestBody NatureExercise natureExercise) {
        try {
            NatureExerciseOuterClass.NatureExercise natureRequest = natureMapper.fromEntity(natureExercise);
           // String designation = natureExercise.getDesignation();
            NatureExerciseOuterClass.UpdateNatureExerciseRequest request = NatureExerciseOuterClass.UpdateNatureExerciseRequest.newBuilder()
                    .setNatureExercise(natureRequest)
                    .build();
            NatureExerciseOuterClass.UpdateNatureExerciseResponse response = natureExerciseServiceBlockingStub.updateNatureExercise(request);
            System.out.println("response "+response);

            return ResponseEntity.ok(natureMapper.fromGrpcClass(response.getNatureExercise()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable Long id) {
        try {
            NatureExerciseOuterClass.DeleteNatureExerciseRequest request = NatureExerciseOuterClass.DeleteNatureExerciseRequest.newBuilder()
                    .setId(id)
                    .build();
            System.out.println("request "+request);
            natureExerciseServiceBlockingStub.deleteNatureExercise(request);
        } catch (Exception e) {

        }
    }

    @PostMapping("/delete-rows")
    public void DeleteRows(@RequestBody List<NatureExercise> rows) {
        try {

            for (NatureExercise row : rows) {
                long id =  row.getId();
                this.deleteData(id);
            }
        } catch (Exception e) {
        }
    }

}
