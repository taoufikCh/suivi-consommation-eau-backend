package com.service.consommationgrpcserver.stub;

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
 * <pre>
 *import "Consommation.proto";
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Bordereau.proto")
public final class BordereauServiceGrpc {

  private BordereauServiceGrpc() {}

  public static final String SERVICE_NAME = "BordereauService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> getGetAllBordereausMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllBordereaus",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> getGetAllBordereausMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> getGetAllBordereausMethod;
    if ((getGetAllBordereausMethod = BordereauServiceGrpc.getGetAllBordereausMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getGetAllBordereausMethod = BordereauServiceGrpc.getGetAllBordereausMethod) == null) {
          BordereauServiceGrpc.getGetAllBordereausMethod = getGetAllBordereausMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "getAllBordereaus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("getAllBordereaus"))
                  .build();
          }
        }
     }
     return getGetAllBordereausMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> getGetBordereauByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBordereauById",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> getGetBordereauByIdMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> getGetBordereauByIdMethod;
    if ((getGetBordereauByIdMethod = BordereauServiceGrpc.getGetBordereauByIdMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getGetBordereauByIdMethod = BordereauServiceGrpc.getGetBordereauByIdMethod) == null) {
          BordereauServiceGrpc.getGetBordereauByIdMethod = getGetBordereauByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "getBordereauById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("getBordereauById"))
                  .build();
          }
        }
     }
     return getGetBordereauByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> getSaveBordereauMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveBordereau",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> getSaveBordereauMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> getSaveBordereauMethod;
    if ((getSaveBordereauMethod = BordereauServiceGrpc.getSaveBordereauMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getSaveBordereauMethod = BordereauServiceGrpc.getSaveBordereauMethod) == null) {
          BordereauServiceGrpc.getSaveBordereauMethod = getSaveBordereauMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "saveBordereau"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("saveBordereau"))
                  .build();
          }
        }
     }
     return getSaveBordereauMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> getUpdateBordereauMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBordereau",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> getUpdateBordereauMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> getUpdateBordereauMethod;
    if ((getUpdateBordereauMethod = BordereauServiceGrpc.getUpdateBordereauMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getUpdateBordereauMethod = BordereauServiceGrpc.getUpdateBordereauMethod) == null) {
          BordereauServiceGrpc.getUpdateBordereauMethod = getUpdateBordereauMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "updateBordereau"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("updateBordereau"))
                  .build();
          }
        }
     }
     return getUpdateBordereauMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> getDeleteBordereauMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBordereau",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> getDeleteBordereauMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> getDeleteBordereauMethod;
    if ((getDeleteBordereauMethod = BordereauServiceGrpc.getDeleteBordereauMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getDeleteBordereauMethod = BordereauServiceGrpc.getDeleteBordereauMethod) == null) {
          BordereauServiceGrpc.getDeleteBordereauMethod = getDeleteBordereauMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "DeleteBordereau"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("DeleteBordereau"))
                  .build();
          }
        }
     }
     return getDeleteBordereauMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> getAddFactureToBordereauMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFactureToBordereau",
      requestType = com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest.class,
      responseType = com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest,
      com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> getAddFactureToBordereauMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> getAddFactureToBordereauMethod;
    if ((getAddFactureToBordereauMethod = BordereauServiceGrpc.getAddFactureToBordereauMethod) == null) {
      synchronized (BordereauServiceGrpc.class) {
        if ((getAddFactureToBordereauMethod = BordereauServiceGrpc.getAddFactureToBordereauMethod) == null) {
          BordereauServiceGrpc.getAddFactureToBordereauMethod = getAddFactureToBordereauMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest, com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BordereauService", "AddFactureToBordereau"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BordereauServiceMethodDescriptorSupplier("AddFactureToBordereau"))
                  .build();
          }
        }
     }
     return getAddFactureToBordereauMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BordereauServiceStub newStub(io.grpc.Channel channel) {
    return new BordereauServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BordereauServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BordereauServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BordereauServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BordereauServiceFutureStub(channel);
  }

  /**
   * <pre>
   *import "Consommation.proto";
   * </pre>
   */
  public static abstract class BordereauServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllBordereaus(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllBordereausMethod(), responseObserver);
    }

    /**
     */
    public void getBordereauById(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBordereauByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveBordereauMethod(), responseObserver);
    }

    /**
     */
    public void updateBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBordereauMethod(), responseObserver);
    }

    /**
     */
    public void deleteBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBordereauMethod(), responseObserver);
    }

    /**
     */
    public void addFactureToBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFactureToBordereauMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllBordereausMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse>(
                  this, METHODID_GET_ALL_BORDEREAUS)))
          .addMethod(
            getGetBordereauByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse>(
                  this, METHODID_GET_BORDEREAU_BY_ID)))
          .addMethod(
            getSaveBordereauMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse>(
                  this, METHODID_SAVE_BORDEREAU)))
          .addMethod(
            getUpdateBordereauMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse>(
                  this, METHODID_UPDATE_BORDEREAU)))
          .addMethod(
            getDeleteBordereauMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse>(
                  this, METHODID_DELETE_BORDEREAU)))
          .addMethod(
            getAddFactureToBordereauMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest,
                com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse>(
                  this, METHODID_ADD_FACTURE_TO_BORDEREAU)))
          .build();
    }
  }

  /**
   * <pre>
   *import "Consommation.proto";
   * </pre>
   */
  public static final class BordereauServiceStub extends io.grpc.stub.AbstractStub<BordereauServiceStub> {
    private BordereauServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BordereauServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BordereauServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BordereauServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllBordereaus(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllBordereausMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBordereauById(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBordereauByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveBordereauMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBordereauMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBordereauMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addFactureToBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFactureToBordereauMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *import "Consommation.proto";
   * </pre>
   */
  public static final class BordereauServiceBlockingStub extends io.grpc.stub.AbstractStub<BordereauServiceBlockingStub> {
    private BordereauServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BordereauServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BordereauServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BordereauServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse getAllBordereaus(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllBordereausMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse getBordereauById(com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBordereauByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse saveBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveBordereauMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse updateBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBordereauMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse deleteBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBordereauMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse addFactureToBordereau(com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFactureToBordereauMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *import "Consommation.proto";
   * </pre>
   */
  public static final class BordereauServiceFutureStub extends io.grpc.stub.AbstractStub<BordereauServiceFutureStub> {
    private BordereauServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BordereauServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BordereauServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BordereauServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse> getAllBordereaus(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllBordereausMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse> getBordereauById(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBordereauByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse> saveBordereau(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveBordereauMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse> updateBordereau(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBordereauMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse> deleteBordereau(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBordereauMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse> addFactureToBordereau(
        com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFactureToBordereauMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_BORDEREAUS = 0;
  private static final int METHODID_GET_BORDEREAU_BY_ID = 1;
  private static final int METHODID_SAVE_BORDEREAU = 2;
  private static final int METHODID_UPDATE_BORDEREAU = 3;
  private static final int METHODID_DELETE_BORDEREAU = 4;
  private static final int METHODID_ADD_FACTURE_TO_BORDEREAU = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BordereauServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BordereauServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_BORDEREAUS:
          serviceImpl.getAllBordereaus((com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetAllBordereauxResponse>) responseObserver);
          break;
        case METHODID_GET_BORDEREAU_BY_ID:
          serviceImpl.getBordereauById((com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.GetBordereauByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_BORDEREAU:
          serviceImpl.saveBordereau((com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.SaveBordereauResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BORDEREAU:
          serviceImpl.updateBordereau((com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.UpdateBordereauResponse>) responseObserver);
          break;
        case METHODID_DELETE_BORDEREAU:
          serviceImpl.deleteBordereau((com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.DeleteBordereauResponse>) responseObserver);
          break;
        case METHODID_ADD_FACTURE_TO_BORDEREAU:
          serviceImpl.addFactureToBordereau((com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcserver.stub.BordereauOuterClass.AddFactureResponse>) responseObserver);
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

  private static abstract class BordereauServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BordereauServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.consommationgrpcserver.stub.BordereauOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BordereauService");
    }
  }

  private static final class BordereauServiceFileDescriptorSupplier
      extends BordereauServiceBaseDescriptorSupplier {
    BordereauServiceFileDescriptorSupplier() {}
  }

  private static final class BordereauServiceMethodDescriptorSupplier
      extends BordereauServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BordereauServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BordereauServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BordereauServiceFileDescriptorSupplier())
              .addMethod(getGetAllBordereausMethod())
              .addMethod(getGetBordereauByIdMethod())
              .addMethod(getSaveBordereauMethod())
              .addMethod(getUpdateBordereauMethod())
              .addMethod(getDeleteBordereauMethod())
              .addMethod(getAddFactureToBordereauMethod())
              .build();
        }
      }
    }
    return result;
  }
}
