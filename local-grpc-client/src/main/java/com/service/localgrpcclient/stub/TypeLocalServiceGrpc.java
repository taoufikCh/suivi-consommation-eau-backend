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
    comments = "Source: TypeLocal.proto")
public final class TypeLocalServiceGrpc {

  private TypeLocalServiceGrpc() {}

  public static final String SERVICE_NAME = "TypeLocalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> getGetAllTypeLocalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTypeLocals",
      requestType = com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest.class,
      responseType = com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> getGetAllTypeLocalsMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> getGetAllTypeLocalsMethod;
    if ((getGetAllTypeLocalsMethod = TypeLocalServiceGrpc.getGetAllTypeLocalsMethod) == null) {
      synchronized (TypeLocalServiceGrpc.class) {
        if ((getGetAllTypeLocalsMethod = TypeLocalServiceGrpc.getGetAllTypeLocalsMethod) == null) {
          TypeLocalServiceGrpc.getGetAllTypeLocalsMethod = getGetAllTypeLocalsMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TypeLocalService", "getAllTypeLocals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeLocalServiceMethodDescriptorSupplier("getAllTypeLocals"))
                  .build();
          }
        }
     }
     return getGetAllTypeLocalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> getGetTypeLocalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTypeLocalById",
      requestType = com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest.class,
      responseType = com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> getGetTypeLocalByIdMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> getGetTypeLocalByIdMethod;
    if ((getGetTypeLocalByIdMethod = TypeLocalServiceGrpc.getGetTypeLocalByIdMethod) == null) {
      synchronized (TypeLocalServiceGrpc.class) {
        if ((getGetTypeLocalByIdMethod = TypeLocalServiceGrpc.getGetTypeLocalByIdMethod) == null) {
          TypeLocalServiceGrpc.getGetTypeLocalByIdMethod = getGetTypeLocalByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TypeLocalService", "getTypeLocalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeLocalServiceMethodDescriptorSupplier("getTypeLocalById"))
                  .build();
          }
        }
     }
     return getGetTypeLocalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> getSaveTypeLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveTypeLocal",
      requestType = com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> getSaveTypeLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> getSaveTypeLocalMethod;
    if ((getSaveTypeLocalMethod = TypeLocalServiceGrpc.getSaveTypeLocalMethod) == null) {
      synchronized (TypeLocalServiceGrpc.class) {
        if ((getSaveTypeLocalMethod = TypeLocalServiceGrpc.getSaveTypeLocalMethod) == null) {
          TypeLocalServiceGrpc.getSaveTypeLocalMethod = getSaveTypeLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TypeLocalService", "saveTypeLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeLocalServiceMethodDescriptorSupplier("saveTypeLocal"))
                  .build();
          }
        }
     }
     return getSaveTypeLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> getUpdateTypeLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTypeLocal",
      requestType = com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> getUpdateTypeLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> getUpdateTypeLocalMethod;
    if ((getUpdateTypeLocalMethod = TypeLocalServiceGrpc.getUpdateTypeLocalMethod) == null) {
      synchronized (TypeLocalServiceGrpc.class) {
        if ((getUpdateTypeLocalMethod = TypeLocalServiceGrpc.getUpdateTypeLocalMethod) == null) {
          TypeLocalServiceGrpc.getUpdateTypeLocalMethod = getUpdateTypeLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TypeLocalService", "updateTypeLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeLocalServiceMethodDescriptorSupplier("updateTypeLocal"))
                  .build();
          }
        }
     }
     return getUpdateTypeLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> getDeleteTypeLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTypeLocal",
      requestType = com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest.class,
      responseType = com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest,
      com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> getDeleteTypeLocalMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> getDeleteTypeLocalMethod;
    if ((getDeleteTypeLocalMethod = TypeLocalServiceGrpc.getDeleteTypeLocalMethod) == null) {
      synchronized (TypeLocalServiceGrpc.class) {
        if ((getDeleteTypeLocalMethod = TypeLocalServiceGrpc.getDeleteTypeLocalMethod) == null) {
          TypeLocalServiceGrpc.getDeleteTypeLocalMethod = getDeleteTypeLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest, com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TypeLocalService", "DeleteTypeLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeLocalServiceMethodDescriptorSupplier("DeleteTypeLocal"))
                  .build();
          }
        }
     }
     return getDeleteTypeLocalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TypeLocalServiceStub newStub(io.grpc.Channel channel) {
    return new TypeLocalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TypeLocalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TypeLocalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TypeLocalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TypeLocalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TypeLocalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllTypeLocals(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTypeLocalsMethod(), responseObserver);
    }

    /**
     */
    public void getTypeLocalById(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTypeLocalByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveTypeLocalMethod(), responseObserver);
    }

    /**
     */
    public void updateTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTypeLocalMethod(), responseObserver);
    }

    /**
     */
    public void deleteTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTypeLocalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllTypeLocalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest,
                com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse>(
                  this, METHODID_GET_ALL_TYPE_LOCALS)))
          .addMethod(
            getGetTypeLocalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest,
                com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse>(
                  this, METHODID_GET_TYPE_LOCAL_BY_ID)))
          .addMethod(
            getSaveTypeLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest,
                com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse>(
                  this, METHODID_SAVE_TYPE_LOCAL)))
          .addMethod(
            getUpdateTypeLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest,
                com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse>(
                  this, METHODID_UPDATE_TYPE_LOCAL)))
          .addMethod(
            getDeleteTypeLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest,
                com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse>(
                  this, METHODID_DELETE_TYPE_LOCAL)))
          .build();
    }
  }

  /**
   */
  public static final class TypeLocalServiceStub extends io.grpc.stub.AbstractStub<TypeLocalServiceStub> {
    private TypeLocalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeLocalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeLocalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeLocalServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllTypeLocals(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTypeLocalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTypeLocalById(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTypeLocalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveTypeLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTypeLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTypeLocalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TypeLocalServiceBlockingStub extends io.grpc.stub.AbstractStub<TypeLocalServiceBlockingStub> {
    private TypeLocalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeLocalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeLocalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeLocalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse getAllTypeLocals(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTypeLocalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse getTypeLocalById(com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTypeLocalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse saveTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveTypeLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse updateTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTypeLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse deleteTypeLocal(com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTypeLocalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TypeLocalServiceFutureStub extends io.grpc.stub.AbstractStub<TypeLocalServiceFutureStub> {
    private TypeLocalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeLocalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeLocalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeLocalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse> getAllTypeLocals(
        com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTypeLocalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse> getTypeLocalById(
        com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTypeLocalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse> saveTypeLocal(
        com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveTypeLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse> updateTypeLocal(
        com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTypeLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse> deleteTypeLocal(
        com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTypeLocalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_TYPE_LOCALS = 0;
  private static final int METHODID_GET_TYPE_LOCAL_BY_ID = 1;
  private static final int METHODID_SAVE_TYPE_LOCAL = 2;
  private static final int METHODID_UPDATE_TYPE_LOCAL = 3;
  private static final int METHODID_DELETE_TYPE_LOCAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TypeLocalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TypeLocalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_TYPE_LOCALS:
          serviceImpl.getAllTypeLocals((com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetAllTypeLocalsResponse>) responseObserver);
          break;
        case METHODID_GET_TYPE_LOCAL_BY_ID:
          serviceImpl.getTypeLocalById((com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.GetTypeLocalByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_TYPE_LOCAL:
          serviceImpl.saveTypeLocal((com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.SaveTypeLocalResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TYPE_LOCAL:
          serviceImpl.updateTypeLocal((com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.UpdateTypeLocalResponse>) responseObserver);
          break;
        case METHODID_DELETE_TYPE_LOCAL:
          serviceImpl.deleteTypeLocal((com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcclient.stub.TypeLocalOuterClass.DeleteTypeLocalResponse>) responseObserver);
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

  private static abstract class TypeLocalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TypeLocalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.localgrpcclient.stub.TypeLocalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TypeLocalService");
    }
  }

  private static final class TypeLocalServiceFileDescriptorSupplier
      extends TypeLocalServiceBaseDescriptorSupplier {
    TypeLocalServiceFileDescriptorSupplier() {}
  }

  private static final class TypeLocalServiceMethodDescriptorSupplier
      extends TypeLocalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TypeLocalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TypeLocalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TypeLocalServiceFileDescriptorSupplier())
              .addMethod(getGetAllTypeLocalsMethod())
              .addMethod(getGetTypeLocalByIdMethod())
              .addMethod(getSaveTypeLocalMethod())
              .addMethod(getUpdateTypeLocalMethod())
              .addMethod(getDeleteTypeLocalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
