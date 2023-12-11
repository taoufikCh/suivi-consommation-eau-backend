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
    comments = "Source: NatureExercise.proto")
public final class NatureExerciseServiceGrpc {

  private NatureExerciseServiceGrpc() {}

  public static final String SERVICE_NAME = "NatureExerciseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> getGetAllNatureExercisesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllNatureExercises",
      requestType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest.class,
      responseType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> getGetAllNatureExercisesMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> getGetAllNatureExercisesMethod;
    if ((getGetAllNatureExercisesMethod = NatureExerciseServiceGrpc.getGetAllNatureExercisesMethod) == null) {
      synchronized (NatureExerciseServiceGrpc.class) {
        if ((getGetAllNatureExercisesMethod = NatureExerciseServiceGrpc.getGetAllNatureExercisesMethod) == null) {
          NatureExerciseServiceGrpc.getGetAllNatureExercisesMethod = getGetAllNatureExercisesMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NatureExerciseService", "getAllNatureExercises"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NatureExerciseServiceMethodDescriptorSupplier("getAllNatureExercises"))
                  .build();
          }
        }
     }
     return getGetAllNatureExercisesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> getGetNatureExerciseByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNatureExerciseById",
      requestType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest.class,
      responseType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> getGetNatureExerciseByIdMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> getGetNatureExerciseByIdMethod;
    if ((getGetNatureExerciseByIdMethod = NatureExerciseServiceGrpc.getGetNatureExerciseByIdMethod) == null) {
      synchronized (NatureExerciseServiceGrpc.class) {
        if ((getGetNatureExerciseByIdMethod = NatureExerciseServiceGrpc.getGetNatureExerciseByIdMethod) == null) {
          NatureExerciseServiceGrpc.getGetNatureExerciseByIdMethod = getGetNatureExerciseByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NatureExerciseService", "getNatureExerciseById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NatureExerciseServiceMethodDescriptorSupplier("getNatureExerciseById"))
                  .build();
          }
        }
     }
     return getGetNatureExerciseByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> getSaveNatureExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveNatureExercise",
      requestType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest.class,
      responseType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> getSaveNatureExerciseMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> getSaveNatureExerciseMethod;
    if ((getSaveNatureExerciseMethod = NatureExerciseServiceGrpc.getSaveNatureExerciseMethod) == null) {
      synchronized (NatureExerciseServiceGrpc.class) {
        if ((getSaveNatureExerciseMethod = NatureExerciseServiceGrpc.getSaveNatureExerciseMethod) == null) {
          NatureExerciseServiceGrpc.getSaveNatureExerciseMethod = getSaveNatureExerciseMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NatureExerciseService", "saveNatureExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NatureExerciseServiceMethodDescriptorSupplier("saveNatureExercise"))
                  .build();
          }
        }
     }
     return getSaveNatureExerciseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> getUpdateNatureExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateNatureExercise",
      requestType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest.class,
      responseType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> getUpdateNatureExerciseMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> getUpdateNatureExerciseMethod;
    if ((getUpdateNatureExerciseMethod = NatureExerciseServiceGrpc.getUpdateNatureExerciseMethod) == null) {
      synchronized (NatureExerciseServiceGrpc.class) {
        if ((getUpdateNatureExerciseMethod = NatureExerciseServiceGrpc.getUpdateNatureExerciseMethod) == null) {
          NatureExerciseServiceGrpc.getUpdateNatureExerciseMethod = getUpdateNatureExerciseMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NatureExerciseService", "updateNatureExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NatureExerciseServiceMethodDescriptorSupplier("updateNatureExercise"))
                  .build();
          }
        }
     }
     return getUpdateNatureExerciseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> getDeleteNatureExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNatureExercise",
      requestType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest.class,
      responseType = com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest,
      com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> getDeleteNatureExerciseMethod() {
    io.grpc.MethodDescriptor<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> getDeleteNatureExerciseMethod;
    if ((getDeleteNatureExerciseMethod = NatureExerciseServiceGrpc.getDeleteNatureExerciseMethod) == null) {
      synchronized (NatureExerciseServiceGrpc.class) {
        if ((getDeleteNatureExerciseMethod = NatureExerciseServiceGrpc.getDeleteNatureExerciseMethod) == null) {
          NatureExerciseServiceGrpc.getDeleteNatureExerciseMethod = getDeleteNatureExerciseMethod = 
              io.grpc.MethodDescriptor.<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest, com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NatureExerciseService", "DeleteNatureExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NatureExerciseServiceMethodDescriptorSupplier("DeleteNatureExercise"))
                  .build();
          }
        }
     }
     return getDeleteNatureExerciseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NatureExerciseServiceStub newStub(io.grpc.Channel channel) {
    return new NatureExerciseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NatureExerciseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NatureExerciseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NatureExerciseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NatureExerciseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NatureExerciseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllNatureExercises(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllNatureExercisesMethod(), responseObserver);
    }

    /**
     */
    public void getNatureExerciseById(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNatureExerciseByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveNatureExerciseMethod(), responseObserver);
    }

    /**
     */
    public void updateNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNatureExerciseMethod(), responseObserver);
    }

    /**
     */
    public void deleteNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNatureExerciseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllNatureExercisesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest,
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse>(
                  this, METHODID_GET_ALL_NATURE_EXERCISES)))
          .addMethod(
            getGetNatureExerciseByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest,
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse>(
                  this, METHODID_GET_NATURE_EXERCISE_BY_ID)))
          .addMethod(
            getSaveNatureExerciseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest,
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse>(
                  this, METHODID_SAVE_NATURE_EXERCISE)))
          .addMethod(
            getUpdateNatureExerciseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest,
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse>(
                  this, METHODID_UPDATE_NATURE_EXERCISE)))
          .addMethod(
            getDeleteNatureExerciseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest,
                com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse>(
                  this, METHODID_DELETE_NATURE_EXERCISE)))
          .build();
    }
  }

  /**
   */
  public static final class NatureExerciseServiceStub extends io.grpc.stub.AbstractStub<NatureExerciseServiceStub> {
    private NatureExerciseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NatureExerciseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NatureExerciseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NatureExerciseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllNatureExercises(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllNatureExercisesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNatureExerciseById(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNatureExerciseByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveNatureExerciseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNatureExerciseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest request,
        io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNatureExerciseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NatureExerciseServiceBlockingStub extends io.grpc.stub.AbstractStub<NatureExerciseServiceBlockingStub> {
    private NatureExerciseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NatureExerciseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NatureExerciseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NatureExerciseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse getAllNatureExercises(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllNatureExercisesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse getNatureExerciseById(com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNatureExerciseByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse saveNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveNatureExerciseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse updateNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNatureExerciseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse deleteNatureExercise(com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNatureExerciseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NatureExerciseServiceFutureStub extends io.grpc.stub.AbstractStub<NatureExerciseServiceFutureStub> {
    private NatureExerciseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NatureExerciseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NatureExerciseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NatureExerciseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse> getAllNatureExercises(
        com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllNatureExercisesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse> getNatureExerciseById(
        com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNatureExerciseByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse> saveNatureExercise(
        com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveNatureExerciseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse> updateNatureExercise(
        com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNatureExerciseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse> deleteNatureExercise(
        com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNatureExerciseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_NATURE_EXERCISES = 0;
  private static final int METHODID_GET_NATURE_EXERCISE_BY_ID = 1;
  private static final int METHODID_SAVE_NATURE_EXERCISE = 2;
  private static final int METHODID_UPDATE_NATURE_EXERCISE = 3;
  private static final int METHODID_DELETE_NATURE_EXERCISE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NatureExerciseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NatureExerciseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_NATURE_EXERCISES:
          serviceImpl.getAllNatureExercises((com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetAllNatureExercisesResponse>) responseObserver);
          break;
        case METHODID_GET_NATURE_EXERCISE_BY_ID:
          serviceImpl.getNatureExerciseById((com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.GetNatureExerciseByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_NATURE_EXERCISE:
          serviceImpl.saveNatureExercise((com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.SaveNatureExerciseResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NATURE_EXERCISE:
          serviceImpl.updateNatureExercise((com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.UpdateNatureExerciseResponse>) responseObserver);
          break;
        case METHODID_DELETE_NATURE_EXERCISE:
          serviceImpl.deleteNatureExercise((com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseRequest) request,
              (io.grpc.stub.StreamObserver<com.service.localgrpcserver.stub.NatureExerciseOuterClass.DeleteNatureExerciseResponse>) responseObserver);
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

  private static abstract class NatureExerciseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NatureExerciseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.localgrpcserver.stub.NatureExerciseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NatureExerciseService");
    }
  }

  private static final class NatureExerciseServiceFileDescriptorSupplier
      extends NatureExerciseServiceBaseDescriptorSupplier {
    NatureExerciseServiceFileDescriptorSupplier() {}
  }

  private static final class NatureExerciseServiceMethodDescriptorSupplier
      extends NatureExerciseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NatureExerciseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NatureExerciseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NatureExerciseServiceFileDescriptorSupplier())
              .addMethod(getGetAllNatureExercisesMethod())
              .addMethod(getGetNatureExerciseByIdMethod())
              .addMethod(getSaveNatureExerciseMethod())
              .addMethod(getUpdateNatureExerciseMethod())
              .addMethod(getDeleteNatureExerciseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
