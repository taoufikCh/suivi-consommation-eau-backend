package com.service.localgrpcclient.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Region.proto")
public final class RegionServiceGrpc {

  private RegionServiceGrpc() {}

  public static final String SERVICE_NAME = "RegionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> getGetAllRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRegions",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> getGetAllRegionsMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> getGetAllRegionsMethod;
    if ((getGetAllRegionsMethod = RegionServiceGrpc.getGetAllRegionsMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getGetAllRegionsMethod = RegionServiceGrpc.getGetAllRegionsMethod) == null) {
          RegionServiceGrpc.getGetAllRegionsMethod = getGetAllRegionsMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "getAllRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("getAllRegions"))
                  .build();
          }
        }
     }
     return getGetAllRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> getGetRegionsByDistrictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegionsByDistrict",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> getGetRegionsByDistrictMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> getGetRegionsByDistrictMethod;
    if ((getGetRegionsByDistrictMethod = RegionServiceGrpc.getGetRegionsByDistrictMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getGetRegionsByDistrictMethod = RegionServiceGrpc.getGetRegionsByDistrictMethod) == null) {
          RegionServiceGrpc.getGetRegionsByDistrictMethod = getGetRegionsByDistrictMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "getRegionsByDistrict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("getRegionsByDistrict"))
                  .build();
          }
        }
     }
     return getGetRegionsByDistrictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> getGetRegionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegionById",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> getGetRegionByIdMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> getGetRegionByIdMethod;
    if ((getGetRegionByIdMethod = RegionServiceGrpc.getGetRegionByIdMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getGetRegionByIdMethod = RegionServiceGrpc.getGetRegionByIdMethod) == null) {
          RegionServiceGrpc.getGetRegionByIdMethod = getGetRegionByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest, com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "getRegionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("getRegionById"))
                  .build();
          }
        }
     }
     return getGetRegionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> getSaveRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRegion",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> getSaveRegionMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> getSaveRegionMethod;
    if ((getSaveRegionMethod = RegionServiceGrpc.getSaveRegionMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getSaveRegionMethod = RegionServiceGrpc.getSaveRegionMethod) == null) {
          RegionServiceGrpc.getSaveRegionMethod = getSaveRegionMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "saveRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("saveRegion"))
                  .build();
          }
        }
     }
     return getSaveRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> getUpdateRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRegion",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> getUpdateRegionMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> getUpdateRegionMethod;
    if ((getUpdateRegionMethod = RegionServiceGrpc.getUpdateRegionMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getUpdateRegionMethod = RegionServiceGrpc.getUpdateRegionMethod) == null) {
          RegionServiceGrpc.getUpdateRegionMethod = getUpdateRegionMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "updateRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("updateRegion"))
                  .build();
          }
        }
     }
     return getUpdateRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> getDeleteRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRegion",
      requestType = com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest.class,
      responseType = com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest,
      com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> getDeleteRegionMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> getDeleteRegionMethod;
    if ((getDeleteRegionMethod = RegionServiceGrpc.getDeleteRegionMethod) == null) {
      synchronized (RegionServiceGrpc.class) {
        if ((getDeleteRegionMethod = RegionServiceGrpc.getDeleteRegionMethod) == null) {
          RegionServiceGrpc.getDeleteRegionMethod = getDeleteRegionMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest, com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegionService", "deleteRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegionServiceMethodDescriptorSupplier("deleteRegion"))
                  .build();
          }
        }
     }
     return getDeleteRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegionServiceStub newStub(io.grpc.Channel channel) {
    return new RegionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RegionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRegions(com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRegionsMethod(), responseObserver);
    }

    /**
     */
    public void getRegionsByDistrict(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRegionsByDistrictMethod(), responseObserver);
    }

    /**
     */
    public void getRegionById(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRegionByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveRegion(com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRegionMethod(), responseObserver);
    }

    /**
     */
    public void updateRegion(com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRegionMethod(), responseObserver);
    }

    /**
     */
    public void deleteRegion(com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRegionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRegionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse>(
                  this, METHODID_GET_ALL_REGIONS)))
          .addMethod(
            getGetRegionsByDistrictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse>(
                  this, METHODID_GET_REGIONS_BY_DISTRICT)))
          .addMethod(
            getGetRegionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse>(
                  this, METHODID_GET_REGION_BY_ID)))
          .addMethod(
            getSaveRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse>(
                  this, METHODID_SAVE_REGION)))
          .addMethod(
            getUpdateRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse>(
                  this, METHODID_UPDATE_REGION)))
          .addMethod(
            getDeleteRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest,
                com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse>(
                  this, METHODID_DELETE_REGION)))
          .build();
    }
  }

  /**
   */
  public static final class RegionServiceStub extends io.grpc.stub.AbstractStub<RegionServiceStub> {
    private RegionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllRegions(com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRegionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegionsByDistrict(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRegionsByDistrictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegionById(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRegionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRegion(com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegion(com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRegion(com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegionServiceBlockingStub extends io.grpc.stub.AbstractStub<RegionServiceBlockingStub> {
    private RegionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse getAllRegions(com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRegionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse getRegionsByDistrict(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRegionsByDistrictMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse getRegionById(com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRegionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse saveRegion(com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse updateRegion(com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse deleteRegion(com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegionServiceFutureStub extends io.grpc.stub.AbstractStub<RegionServiceFutureStub> {
    private RegionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse> getAllRegions(
        com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRegionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse> getRegionsByDistrict(
        com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRegionsByDistrictMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse> getRegionById(
        com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRegionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse> saveRegion(
        com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse> updateRegion(
        com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse> deleteRegion(
        com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_REGIONS = 0;
  private static final int METHODID_GET_REGIONS_BY_DISTRICT = 1;
  private static final int METHODID_GET_REGION_BY_ID = 2;
  private static final int METHODID_SAVE_REGION = 3;
  private static final int METHODID_UPDATE_REGION = 4;
  private static final int METHODID_DELETE_REGION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_REGIONS:
          serviceImpl.getAllRegions((com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetAllRegionsResponse>) responseObserver);
          break;
        case METHODID_GET_REGIONS_BY_DISTRICT:
          serviceImpl.getRegionsByDistrict((com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionsByDistrictResponse>) responseObserver);
          break;
        case METHODID_GET_REGION_BY_ID:
          serviceImpl.getRegionById((com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.GetRegionByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_REGION:
          serviceImpl.saveRegion((com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.SaveRegionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REGION:
          serviceImpl.updateRegion((com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.UpdateRegionResponse>) responseObserver);
          break;
        case METHODID_DELETE_REGION:
          serviceImpl.deleteRegion((com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.RegionOuterClass.DeleteRegionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RegionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.localgrpcclient.stub.RegionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegionService");
    }
  }

  private static final class RegionServiceFileDescriptorSupplier
      extends RegionServiceBaseDescriptorSupplier {
    RegionServiceFileDescriptorSupplier() {}
  }

  private static final class RegionServiceMethodDescriptorSupplier
      extends RegionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RegionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegionServiceFileDescriptorSupplier())
              .addMethod(getGetAllRegionsMethod())
              .addMethod(getGetRegionsByDistrictMethod())
              .addMethod(getGetRegionByIdMethod())
              .addMethod(getSaveRegionMethod())
              .addMethod(getUpdateRegionMethod())
              .addMethod(getDeleteRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
