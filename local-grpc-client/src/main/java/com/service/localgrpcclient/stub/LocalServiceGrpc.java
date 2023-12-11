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
    comments = "Source: Local.proto")
public final class LocalServiceGrpc {

  private LocalServiceGrpc() {}

  public static final String SERVICE_NAME = "LocalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllLocals",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod;
    if ((getGetAllLocalsMethod = LocalServiceGrpc.getGetAllLocalsMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetAllLocalsMethod = LocalServiceGrpc.getGetAllLocalsMethod) == null) {
          LocalServiceGrpc.getGetAllLocalsMethod = getGetAllLocalsMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "getAllLocals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("getAllLocals"))
                  .build();
          }
        }
     }
     return getGetAllLocalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> getGetLocalsByRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocalsByRegion",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> getGetLocalsByRegionMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> getGetLocalsByRegionMethod;
    if ((getGetLocalsByRegionMethod = LocalServiceGrpc.getGetLocalsByRegionMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetLocalsByRegionMethod = LocalServiceGrpc.getGetLocalsByRegionMethod) == null) {
          LocalServiceGrpc.getGetLocalsByRegionMethod = getGetLocalsByRegionMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "getLocalsByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("getLocalsByRegion"))
                  .build();
          }
        }
     }
     return getGetLocalsByRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocalById",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod;
    if ((getGetLocalByIdMethod = LocalServiceGrpc.getGetLocalByIdMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetLocalByIdMethod = LocalServiceGrpc.getGetLocalByIdMethod) == null) {
          LocalServiceGrpc.getGetLocalByIdMethod = getGetLocalByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest, com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "getLocalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("getLocalById"))
                  .build();
          }
        }
     }
     return getGetLocalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> getSaveLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveLocal",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> getSaveLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> getSaveLocalMethod;
    if ((getSaveLocalMethod = LocalServiceGrpc.getSaveLocalMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getSaveLocalMethod = LocalServiceGrpc.getSaveLocalMethod) == null) {
          LocalServiceGrpc.getSaveLocalMethod = getSaveLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "saveLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("saveLocal"))
                  .build();
          }
        }
     }
     return getSaveLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> getUpdateLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLocal",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> getUpdateLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> getUpdateLocalMethod;
    if ((getUpdateLocalMethod = LocalServiceGrpc.getUpdateLocalMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getUpdateLocalMethod = LocalServiceGrpc.getUpdateLocalMethod) == null) {
          LocalServiceGrpc.getUpdateLocalMethod = getUpdateLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "updateLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("updateLocal"))
                  .build();
          }
        }
     }
     return getUpdateLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> getDeleteLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocal",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> getDeleteLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> getDeleteLocalMethod;
    if ((getDeleteLocalMethod = LocalServiceGrpc.getDeleteLocalMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getDeleteLocalMethod = LocalServiceGrpc.getDeleteLocalMethod) == null) {
          LocalServiceGrpc.getDeleteLocalMethod = getDeleteLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest, com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "DeleteLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("DeleteLocal"))
                  .build();
          }
        }
     }
     return getDeleteLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> getGetLocalsByFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocalsByFilters",
      requestType = com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest.class,
      responseType = com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest,
      com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> getGetLocalsByFiltersMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest, com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> getGetLocalsByFiltersMethod;
    if ((getGetLocalsByFiltersMethod = LocalServiceGrpc.getGetLocalsByFiltersMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetLocalsByFiltersMethod = LocalServiceGrpc.getGetLocalsByFiltersMethod) == null) {
          LocalServiceGrpc.getGetLocalsByFiltersMethod = getGetLocalsByFiltersMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest, com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "GetLocalsByFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("GetLocalsByFilters"))
                  .build();
          }
        }
     }
     return getGetLocalsByFiltersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocalServiceStub newStub(io.grpc.Channel channel) {
    return new LocalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LocalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllLocals(com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllLocalsMethod(), responseObserver);
    }

    /**
     */
    public void getLocalsByRegion(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocalsByRegionMethod(), responseObserver);
    }

    /**
     */
    public void getLocalById(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocalByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveLocal(com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveLocalMethod(), responseObserver);
    }

    /**
     */
    public void updateLocal(com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocalMethod(), responseObserver);
    }

    /**
     */
    public void deleteLocal(com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLocalMethod(), responseObserver);
    }

    /**
     */
    public void getLocalsByFilters(com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocalsByFiltersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllLocalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>(
                  this, METHODID_GET_ALL_LOCALS)))
          .addMethod(
            getGetLocalsByRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse>(
                  this, METHODID_GET_LOCALS_BY_REGION)))
          .addMethod(
            getGetLocalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>(
                  this, METHODID_GET_LOCAL_BY_ID)))
          .addMethod(
            getSaveLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse>(
                  this, METHODID_SAVE_LOCAL)))
          .addMethod(
            getUpdateLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse>(
                  this, METHODID_UPDATE_LOCAL)))
          .addMethod(
            getDeleteLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse>(
                  this, METHODID_DELETE_LOCAL)))
          .addMethod(
            getGetLocalsByFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest,
                com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse>(
                  this, METHODID_GET_LOCALS_BY_FILTERS)))
          .build();
    }
  }

  /**
   */
  public static final class LocalServiceStub extends io.grpc.stub.AbstractStub<LocalServiceStub> {
    private LocalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocalServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllLocals(com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllLocalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalsByRegion(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocalsByRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalById(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveLocal(com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocal(com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocal(com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalsByFilters(com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocalsByFiltersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocalServiceBlockingStub extends io.grpc.stub.AbstractStub<LocalServiceBlockingStub> {
    private LocalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse getAllLocals(com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllLocalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse getLocalsByRegion(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocalsByRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse getLocalById(com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse saveLocal(com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse updateLocal(com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse deleteLocal(com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse getLocalsByFilters(com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocalsByFiltersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocalServiceFutureStub extends io.grpc.stub.AbstractStub<LocalServiceFutureStub> {
    private LocalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getAllLocals(
        com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllLocalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse> getLocalsByRegion(
        com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocalsByRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getLocalById(
        com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse> saveLocal(
        com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse> updateLocal(
        com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse> deleteLocal(
        com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse> getLocalsByFilters(
        com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocalsByFiltersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_LOCALS = 0;
  private static final int METHODID_GET_LOCALS_BY_REGION = 1;
  private static final int METHODID_GET_LOCAL_BY_ID = 2;
  private static final int METHODID_SAVE_LOCAL = 3;
  private static final int METHODID_UPDATE_LOCAL = 4;
  private static final int METHODID_DELETE_LOCAL = 5;
  private static final int METHODID_GET_LOCALS_BY_FILTERS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_LOCALS:
          serviceImpl.getAllLocals((com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>) responseObserver);
          break;
        case METHODID_GET_LOCALS_BY_REGION:
          serviceImpl.getLocalsByRegion((com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalsByRegionResponse>) responseObserver);
          break;
        case METHODID_GET_LOCAL_BY_ID:
          serviceImpl.getLocalById((com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_LOCAL:
          serviceImpl.saveLocal((com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.SaveLocalResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCAL:
          serviceImpl.updateLocal((com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.UpdateLocalResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCAL:
          serviceImpl.deleteLocal((com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.DeleteLocalResponse>) responseObserver);
          break;
        case METHODID_GET_LOCALS_BY_FILTERS:
          serviceImpl.getLocalsByFilters((com.service.localgrpcclient.stub.LocalOuterClass.FilterRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.LocalOuterClass.LocalsResponse>) responseObserver);
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

  private static abstract class LocalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.localgrpcclient.stub.LocalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocalService");
    }
  }

  private static final class LocalServiceFileDescriptorSupplier
      extends LocalServiceBaseDescriptorSupplier {
    LocalServiceFileDescriptorSupplier() {}
  }

  private static final class LocalServiceMethodDescriptorSupplier
      extends LocalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocalServiceFileDescriptorSupplier())
              .addMethod(getGetAllLocalsMethod())
              .addMethod(getGetLocalsByRegionMethod())
              .addMethod(getGetLocalByIdMethod())
              .addMethod(getSaveLocalMethod())
              .addMethod(getUpdateLocalMethod())
              .addMethod(getDeleteLocalMethod())
              .addMethod(getGetLocalsByFiltersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
