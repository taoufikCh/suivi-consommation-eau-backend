package com.service.compteurgrpcclient.stub;

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
  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
      com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllLocals",
      requestType = com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest.class,
      responseType = com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
      com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest, com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getGetAllLocalsMethod;
    if ((getGetAllLocalsMethod = LocalServiceGrpc.getGetAllLocalsMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetAllLocalsMethod = LocalServiceGrpc.getGetAllLocalsMethod) == null) {
          LocalServiceGrpc.getGetAllLocalsMethod = getGetAllLocalsMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest, com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "getAllLocals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("getAllLocals"))
                  .build();
          }
        }
     }
     return getGetAllLocalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
      com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocalById",
      requestType = com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest.class,
      responseType = com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
      com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest, com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getGetLocalByIdMethod;
    if ((getGetLocalByIdMethod = LocalServiceGrpc.getGetLocalByIdMethod) == null) {
      synchronized (LocalServiceGrpc.class) {
        if ((getGetLocalByIdMethod = LocalServiceGrpc.getGetLocalByIdMethod) == null) {
          LocalServiceGrpc.getGetLocalByIdMethod = getGetLocalByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest, com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LocalService", "getLocalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocalServiceMethodDescriptorSupplier("getLocalById"))
                  .build();
          }
        }
     }
     return getGetLocalByIdMethod;
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
    public void getAllLocals(com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllLocalsMethod(), responseObserver);
    }

    /**
     */
    public void getLocalById(com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocalByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllLocalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest,
                com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>(
                  this, METHODID_GET_ALL_LOCALS)))
          .addMethod(
            getGetLocalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest,
                com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>(
                  this, METHODID_GET_LOCAL_BY_ID)))
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
    public void getAllLocals(com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllLocalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalById(com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocalByIdMethod(), getCallOptions()), request, responseObserver);
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
    public com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse getAllLocals(com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllLocalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse getLocalById(com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocalByIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse> getAllLocals(
        com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllLocalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse> getLocalById(
        com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocalByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_LOCALS = 0;
  private static final int METHODID_GET_LOCAL_BY_ID = 1;

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
          serviceImpl.getAllLocals((com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetAllLocalsResponse>) responseObserver);
          break;
        case METHODID_GET_LOCAL_BY_ID:
          serviceImpl.getLocalById((com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcclient.stub.LocalOuterClass.GetLocalByIdResponse>) responseObserver);
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
      return com.service.compteurgrpcclient.stub.LocalOuterClass.getDescriptor();
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
              .addMethod(getGetLocalByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
