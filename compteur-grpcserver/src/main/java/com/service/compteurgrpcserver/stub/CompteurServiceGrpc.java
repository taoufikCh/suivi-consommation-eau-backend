package com.service.compteurgrpcserver.stub;

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
    comments = "Source: Compteur.proto")
public final class CompteurServiceGrpc {

  private CompteurServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteurService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> getGetAllCompteursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCompteurs",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> getGetAllCompteursMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> getGetAllCompteursMethod;
    if ((getGetAllCompteursMethod = CompteurServiceGrpc.getGetAllCompteursMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getGetAllCompteursMethod = CompteurServiceGrpc.getGetAllCompteursMethod) == null) {
          CompteurServiceGrpc.getGetAllCompteursMethod = getGetAllCompteursMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "getAllCompteurs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("getAllCompteurs"))
                  .build();
          }
        }
     }
     return getGetAllCompteursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> getGetCompteursByLocalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompteursByLocal",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> getGetCompteursByLocalMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> getGetCompteursByLocalMethod;
    if ((getGetCompteursByLocalMethod = CompteurServiceGrpc.getGetCompteursByLocalMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getGetCompteursByLocalMethod = CompteurServiceGrpc.getGetCompteursByLocalMethod) == null) {
          CompteurServiceGrpc.getGetCompteursByLocalMethod = getGetCompteursByLocalMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "getCompteursByLocal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("getCompteursByLocal"))
                  .build();
          }
        }
     }
     return getGetCompteursByLocalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> getGetCompteurByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompteurById",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> getGetCompteurByIdMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> getGetCompteurByIdMethod;
    if ((getGetCompteurByIdMethod = CompteurServiceGrpc.getGetCompteurByIdMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getGetCompteurByIdMethod = CompteurServiceGrpc.getGetCompteurByIdMethod) == null) {
          CompteurServiceGrpc.getGetCompteurByIdMethod = getGetCompteurByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "getCompteurById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("getCompteurById"))
                  .build();
          }
        }
     }
     return getGetCompteurByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> getSaveCompteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCompteur",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> getSaveCompteurMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> getSaveCompteurMethod;
    if ((getSaveCompteurMethod = CompteurServiceGrpc.getSaveCompteurMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getSaveCompteurMethod = CompteurServiceGrpc.getSaveCompteurMethod) == null) {
          CompteurServiceGrpc.getSaveCompteurMethod = getSaveCompteurMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "saveCompteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("saveCompteur"))
                  .build();
          }
        }
     }
     return getSaveCompteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> getUpdateCompteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCompteur",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> getUpdateCompteurMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> getUpdateCompteurMethod;
    if ((getUpdateCompteurMethod = CompteurServiceGrpc.getUpdateCompteurMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getUpdateCompteurMethod = CompteurServiceGrpc.getUpdateCompteurMethod) == null) {
          CompteurServiceGrpc.getUpdateCompteurMethod = getUpdateCompteurMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "updateCompteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("updateCompteur"))
                  .build();
          }
        }
     }
     return getUpdateCompteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> getDeleteCompteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompteur",
      requestType = com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest.class,
      responseType = com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest,
      com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> getDeleteCompteurMethod() {
    io.grpc.MethodDescriptor<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> getDeleteCompteurMethod;
    if ((getDeleteCompteurMethod = CompteurServiceGrpc.getDeleteCompteurMethod) == null) {
      synchronized (CompteurServiceGrpc.class) {
        if ((getDeleteCompteurMethod = CompteurServiceGrpc.getDeleteCompteurMethod) == null) {
          CompteurServiceGrpc.getDeleteCompteurMethod = getDeleteCompteurMethod = 
              io.grpc.MethodDescriptor.<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest, com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteurService", "DeleteCompteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteurServiceMethodDescriptorSupplier("DeleteCompteur"))
                  .build();
          }
        }
     }
     return getDeleteCompteurMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteurServiceStub newStub(io.grpc.Channel channel) {
    return new CompteurServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteurServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteurServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteurServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteurServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompteurServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCompteurs(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCompteursMethod(), responseObserver);
    }

    /**
     */
    public void getCompteursByLocal(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompteursByLocalMethod(), responseObserver);
    }

    /**
     */
    public void getCompteurById(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompteurByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteurMethod(), responseObserver);
    }

    /**
     */
    public void updateCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompteurMethod(), responseObserver);
    }

    /**
     */
    public void deleteCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteurMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCompteursMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse>(
                  this, METHODID_GET_ALL_COMPTEURS)))
          .addMethod(
            getGetCompteursByLocalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse>(
                  this, METHODID_GET_COMPTEURS_BY_LOCAL)))
          .addMethod(
            getGetCompteurByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse>(
                  this, METHODID_GET_COMPTEUR_BY_ID)))
          .addMethod(
            getSaveCompteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse>(
                  this, METHODID_SAVE_COMPTEUR)))
          .addMethod(
            getUpdateCompteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse>(
                  this, METHODID_UPDATE_COMPTEUR)))
          .addMethod(
            getDeleteCompteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest,
                com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse>(
                  this, METHODID_DELETE_COMPTEUR)))
          .build();
    }
  }

  /**
   */
  public static final class CompteurServiceStub extends io.grpc.stub.AbstractStub<CompteurServiceStub> {
    private CompteurServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteurServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteurServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteurServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCompteurs(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCompteursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompteursByLocal(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompteursByLocalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompteurById(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompteurByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteurMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompteurServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteurServiceBlockingStub> {
    private CompteurServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteurServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteurServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteurServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse getAllCompteurs(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCompteursMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse getCompteursByLocal(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompteursByLocalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse getCompteurById(com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompteurByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse saveCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse updateCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse deleteCompteur(com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteurMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompteurServiceFutureStub extends io.grpc.stub.AbstractStub<CompteurServiceFutureStub> {
    private CompteurServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteurServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteurServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteurServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse> getAllCompteurs(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCompteursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse> getCompteursByLocal(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompteursByLocalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse> getCompteurById(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompteurByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse> saveCompteur(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse> updateCompteur(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse> deleteCompteur(
        com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteurMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_COMPTEURS = 0;
  private static final int METHODID_GET_COMPTEURS_BY_LOCAL = 1;
  private static final int METHODID_GET_COMPTEUR_BY_ID = 2;
  private static final int METHODID_SAVE_COMPTEUR = 3;
  private static final int METHODID_UPDATE_COMPTEUR = 4;
  private static final int METHODID_DELETE_COMPTEUR = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteurServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteurServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_COMPTEURS:
          serviceImpl.getAllCompteurs((com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetAllCompteursResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTEURS_BY_LOCAL:
          serviceImpl.getCompteursByLocal((com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteursByLocalResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTEUR_BY_ID:
          serviceImpl.getCompteurById((com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.GetCompteurByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTEUR:
          serviceImpl.saveCompteur((com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.SaveCompteurResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPTEUR:
          serviceImpl.updateCompteur((com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.UpdateCompteurResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTEUR:
          serviceImpl.deleteCompteur((com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurRequest) request,
              (io.grpc.stub.StreamObserver<com.service.compteurgrpcserver.stub.CompteurOuterClass.DeleteCompteurResponse>) responseObserver);
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

  private static abstract class CompteurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteurServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.compteurgrpcserver.stub.CompteurOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteurService");
    }
  }

  private static final class CompteurServiceFileDescriptorSupplier
      extends CompteurServiceBaseDescriptorSupplier {
    CompteurServiceFileDescriptorSupplier() {}
  }

  private static final class CompteurServiceMethodDescriptorSupplier
      extends CompteurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteurServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompteurServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteurServiceFileDescriptorSupplier())
              .addMethod(getGetAllCompteursMethod())
              .addMethod(getGetCompteursByLocalMethod())
              .addMethod(getGetCompteurByIdMethod())
              .addMethod(getSaveCompteurMethod())
              .addMethod(getUpdateCompteurMethod())
              .addMethod(getDeleteCompteurMethod())
              .build();
        }
      }
    }
    return result;
  }
}
