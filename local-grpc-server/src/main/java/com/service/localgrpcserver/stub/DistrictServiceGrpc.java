package com.service.localgrpcserver.stub;

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
    comments = "Source: District.proto")
public final class DistrictServiceGrpc {

  private DistrictServiceGrpc() {}

  public static final String SERVICE_NAME = "DistrictService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> getGetAllDistrictsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllDistricts",
      requestType = com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest.class,
      responseType = com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> getGetAllDistrictsMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest, com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> getGetAllDistrictsMethod;
    if ((getGetAllDistrictsMethod = DistrictServiceGrpc.getGetAllDistrictsMethod) == null) {
      synchronized (DistrictServiceGrpc.class) {
        if ((getGetAllDistrictsMethod = DistrictServiceGrpc.getGetAllDistrictsMethod) == null) {
          DistrictServiceGrpc.getGetAllDistrictsMethod = getGetAllDistrictsMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest, com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DistrictService", "getAllDistricts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrictServiceMethodDescriptorSupplier("getAllDistricts"))
                  .build();
          }
        }
     }
     return getGetAllDistrictsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> getGetDistrictByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDistrictById",
      requestType = com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest.class,
      responseType = com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> getGetDistrictByIdMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest, com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> getGetDistrictByIdMethod;
    if ((getGetDistrictByIdMethod = DistrictServiceGrpc.getGetDistrictByIdMethod) == null) {
      synchronized (DistrictServiceGrpc.class) {
        if ((getGetDistrictByIdMethod = DistrictServiceGrpc.getGetDistrictByIdMethod) == null) {
          DistrictServiceGrpc.getGetDistrictByIdMethod = getGetDistrictByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest, com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DistrictService", "getDistrictById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrictServiceMethodDescriptorSupplier("getDistrictById"))
                  .build();
          }
        }
     }
     return getGetDistrictByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> getSaveDistrictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveDistrict",
      requestType = com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest.class,
      responseType = com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> getSaveDistrictMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> getSaveDistrictMethod;
    if ((getSaveDistrictMethod = DistrictServiceGrpc.getSaveDistrictMethod) == null) {
      synchronized (DistrictServiceGrpc.class) {
        if ((getSaveDistrictMethod = DistrictServiceGrpc.getSaveDistrictMethod) == null) {
          DistrictServiceGrpc.getSaveDistrictMethod = getSaveDistrictMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DistrictService", "saveDistrict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrictServiceMethodDescriptorSupplier("saveDistrict"))
                  .build();
          }
        }
     }
     return getSaveDistrictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> getUpdateDistrictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDistrict",
      requestType = com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest.class,
      responseType = com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> getUpdateDistrictMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> getUpdateDistrictMethod;
    if ((getUpdateDistrictMethod = DistrictServiceGrpc.getUpdateDistrictMethod) == null) {
      synchronized (DistrictServiceGrpc.class) {
        if ((getUpdateDistrictMethod = DistrictServiceGrpc.getUpdateDistrictMethod) == null) {
          DistrictServiceGrpc.getUpdateDistrictMethod = getUpdateDistrictMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DistrictService", "updateDistrict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrictServiceMethodDescriptorSupplier("updateDistrict"))
                  .build();
          }
        }
     }
     return getUpdateDistrictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> getDeleteDistrictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDistrict",
      requestType = com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest.class,
      responseType = com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest,
      com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> getDeleteDistrictMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> getDeleteDistrictMethod;
    if ((getDeleteDistrictMethod = DistrictServiceGrpc.getDeleteDistrictMethod) == null) {
      synchronized (DistrictServiceGrpc.class) {
        if ((getDeleteDistrictMethod = DistrictServiceGrpc.getDeleteDistrictMethod) == null) {
          DistrictServiceGrpc.getDeleteDistrictMethod = getDeleteDistrictMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest, com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DistrictService", "DeleteDistrict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrictServiceMethodDescriptorSupplier("DeleteDistrict"))
                  .build();
          }
        }
     }
     return getDeleteDistrictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistrictServiceStub newStub(io.grpc.Channel channel) {
    return new DistrictServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistrictServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DistrictServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistrictServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DistrictServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DistrictServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllDistricts(com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllDistrictsMethod(), responseObserver);
    }

    /**
     */
    public void getDistrictById(com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDistrictByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveDistrictMethod(), responseObserver);
    }

    /**
     */
    public void updateDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDistrictMethod(), responseObserver);
    }

    /**
     */
    public void deleteDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDistrictMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllDistrictsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest,
                com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse>(
                  this, METHODID_GET_ALL_DISTRICTS)))
          .addMethod(
            getGetDistrictByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest,
                com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse>(
                  this, METHODID_GET_DISTRICT_BY_ID)))
          .addMethod(
            getSaveDistrictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest,
                com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse>(
                  this, METHODID_SAVE_DISTRICT)))
          .addMethod(
            getUpdateDistrictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest,
                com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse>(
                  this, METHODID_UPDATE_DISTRICT)))
          .addMethod(
            getDeleteDistrictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest,
                com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse>(
                  this, METHODID_DELETE_DISTRICT)))
          .build();
    }
  }

  /**
   */
  public static final class DistrictServiceStub extends io.grpc.stub.AbstractStub<DistrictServiceStub> {
    private DistrictServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrictServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrictServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrictServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllDistricts(com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllDistrictsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDistrictById(com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDistrictByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveDistrictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDistrictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDistrictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DistrictServiceBlockingStub extends io.grpc.stub.AbstractStub<DistrictServiceBlockingStub> {
    private DistrictServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrictServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrictServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrictServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse getAllDistricts(com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllDistrictsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse getDistrictById(com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDistrictByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse saveDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveDistrictMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse updateDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDistrictMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse deleteDistrict(com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDistrictMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DistrictServiceFutureStub extends io.grpc.stub.AbstractStub<DistrictServiceFutureStub> {
    private DistrictServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrictServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrictServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrictServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse> getAllDistricts(
        com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllDistrictsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse> getDistrictById(
        com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDistrictByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse> saveDistrict(
        com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveDistrictMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse> updateDistrict(
        com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDistrictMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse> deleteDistrict(
        com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDistrictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_DISTRICTS = 0;
  private static final int METHODID_GET_DISTRICT_BY_ID = 1;
  private static final int METHODID_SAVE_DISTRICT = 2;
  private static final int METHODID_UPDATE_DISTRICT = 3;
  private static final int METHODID_DELETE_DISTRICT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DistrictServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DistrictServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_DISTRICTS:
          serviceImpl.getAllDistricts((com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetAllDistrictsResponse>) responseObserver);
          break;
        case METHODID_GET_DISTRICT_BY_ID:
          serviceImpl.getDistrictById((com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.GetDistrictByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_DISTRICT:
          serviceImpl.saveDistrict((com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.SaveDistrictResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DISTRICT:
          serviceImpl.updateDistrict((com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.UpdateDistrictResponse>) responseObserver);
          break;
        case METHODID_DELETE_DISTRICT:
          serviceImpl.deleteDistrict((com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.DistrictOuterClass.DeleteDistrictResponse>) responseObserver);
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

  private static abstract class DistrictServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DistrictServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.localgrpcserver.stub.DistrictOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DistrictService");
    }
  }

  private static final class DistrictServiceFileDescriptorSupplier
      extends DistrictServiceBaseDescriptorSupplier {
    DistrictServiceFileDescriptorSupplier() {}
  }

  private static final class DistrictServiceMethodDescriptorSupplier
      extends DistrictServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DistrictServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DistrictServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DistrictServiceFileDescriptorSupplier())
              .addMethod(getGetAllDistrictsMethod())
              .addMethod(getGetDistrictByIdMethod())
              .addMethod(getSaveDistrictMethod())
              .addMethod(getUpdateDistrictMethod())
              .addMethod(getDeleteDistrictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
