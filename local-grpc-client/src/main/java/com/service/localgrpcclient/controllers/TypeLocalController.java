package com.service.localgrpcclient.controllers;


import com.service.localgrpcclient.entities.TypeLocal;
import com.service.localgrpcclient.mapper.TypeLocalMapper;
import com.service.localgrpcclient.stub.TypeLocalOuterClass;
import com.service.localgrpcclient.stub.TypeLocalServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/typeLocal")
@CrossOrigin
@RequiredArgsConstructor
public class TypeLocalController {

    @Autowired
    private TypeLocalMapper typeLocalMapper;

    @GrpcClient(value = "localService")
    private TypeLocalServiceGrpc.TypeLocalServiceBlockingStub typeLocalServiceBlockingStub;

    @GetMapping
    public List<TypeLocal> getAllRows(){
        TypeLocalOuterClass.GetAllTypeLocalsRequest request =
                TypeLocalOuterClass.GetAllTypeLocalsRequest.newBuilder().build();
        TypeLocalOuterClass.GetAllTypeLocalsResponse response =
                typeLocalServiceBlockingStub.getAllTypeLocals(request);
        List<TypeLocalOuterClass.TypeLocal> dataList = response.getTypeLocalList();
        List<TypeLocal> rows =
                dataList.stream().map(typeLocalMapper::fromGrpcClass).collect(Collectors.toList());
        return rows;
    }

    @GetMapping("/{id}")
    public TypeLocal getDateById(@PathVariable Long id){
        TypeLocalOuterClass.GetTypeLocalByIdRequest request =
                TypeLocalOuterClass.GetTypeLocalByIdRequest.newBuilder()
                        .setId(id)
                        .build();
        TypeLocalOuterClass.GetTypeLocalByIdResponse response =
                typeLocalServiceBlockingStub.getTypeLocalById(request);
        return typeLocalMapper.fromGrpcClass(response.getTypeLocal());
    }

    @PostMapping
    public TypeLocal createData(@RequestBody TypeLocal typeLocal) {
        String designation = typeLocal.getDesignation();

        TypeLocalOuterClass.SaveTypeLocalRequest request = TypeLocalOuterClass.SaveTypeLocalRequest.newBuilder()
                .setDesignation(designation)
                .build();

        TypeLocalOuterClass.SaveTypeLocalResponse response = typeLocalServiceBlockingStub.saveTypeLocal(request);
       return typeLocalMapper.fromGrpcClass(response.getTypeLocal());
    }

    @PutMapping
    public ResponseEntity<TypeLocal> updateData(@RequestBody TypeLocal typeLocal) {
        try {
            TypeLocalOuterClass.TypeLocal typeLocalRequest = typeLocalMapper.fromEntity(typeLocal);
            TypeLocalOuterClass.UpdateTypeLocalRequest request = TypeLocalOuterClass.UpdateTypeLocalRequest.newBuilder()
                    .setTypeLocal(typeLocalRequest)
                    .build();
            TypeLocalOuterClass.UpdateTypeLocalResponse response = typeLocalServiceBlockingStub.updateTypeLocal(request);
            System.out.println("response "+response);

            return ResponseEntity.ok(typeLocalMapper.fromGrpcClass(response.getTypeLocal()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable Long id) {
        try {
            TypeLocalOuterClass.DeleteTypeLocalRequest request = TypeLocalOuterClass.DeleteTypeLocalRequest.newBuilder()
                    .setId(id)
                    .build();
            System.out.println("request "+request);
            typeLocalServiceBlockingStub.deleteTypeLocal(request);
        } catch (Exception e) {

        }
    }

    @PostMapping("/delete-rows")
    public void DeleteRows(@RequestBody List<TypeLocal> rows) {
        try {

            for (TypeLocal row : rows) {
                long id =  row.getId();
                this.deleteData(id);
            }
        } catch (Exception e) {
        }
    }

}
