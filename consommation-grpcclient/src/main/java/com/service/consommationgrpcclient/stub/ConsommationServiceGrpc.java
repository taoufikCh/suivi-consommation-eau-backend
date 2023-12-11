package com.service.consommationgrpcclient.stub;

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
    comments = "Source: Consommation.proto")
public final class ConsommationServiceGrpc {

  private ConsommationServiceGrpc() {}

  public static final String SERVICE_NAME = "ConsommationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> getGetAllConsommationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllConsommations",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> getGetAllConsommationsMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> getGetAllConsommationsMethod;
    if ((getGetAllConsommationsMethod = ConsommationServiceGrpc.getGetAllConsommationsMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getGetAllConsommationsMethod = ConsommationServiceGrpc.getGetAllConsommationsMethod) == null) {
          ConsommationServiceGrpc.getGetAllConsommationsMethod = getGetAllConsommationsMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "getAllConsommations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("getAllConsommations"))
                  .build();
          }
        }
     }
     return getGetAllConsommationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> getGetConsommationsByCompteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConsommationsByCompteur",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> getGetConsommationsByCompteurMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> getGetConsommationsByCompteurMethod;
    if ((getGetConsommationsByCompteurMethod = ConsommationServiceGrpc.getGetConsommationsByCompteurMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getGetConsommationsByCompteurMethod = ConsommationServiceGrpc.getGetConsommationsByCompteurMethod) == null) {
          ConsommationServiceGrpc.getGetConsommationsByCompteurMethod = getGetConsommationsByCompteurMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "getConsommationsByCompteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("getConsommationsByCompteur"))
                  .build();
          }
        }
     }
     return getGetConsommationsByCompteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> getGetConsommationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConsommationById",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> getGetConsommationByIdMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> getGetConsommationByIdMethod;
    if ((getGetConsommationByIdMethod = ConsommationServiceGrpc.getGetConsommationByIdMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getGetConsommationByIdMethod = ConsommationServiceGrpc.getGetConsommationByIdMethod) == null) {
          ConsommationServiceGrpc.getGetConsommationByIdMethod = getGetConsommationByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "getConsommationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("getConsommationById"))
                  .build();
          }
        }
     }
     return getGetConsommationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> getSaveConsommationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveConsommation",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> getSaveConsommationMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> getSaveConsommationMethod;
    if ((getSaveConsommationMethod = ConsommationServiceGrpc.getSaveConsommationMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getSaveConsommationMethod = ConsommationServiceGrpc.getSaveConsommationMethod) == null) {
          ConsommationServiceGrpc.getSaveConsommationMethod = getSaveConsommationMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "saveConsommation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("saveConsommation"))
                  .build();
          }
        }
     }
     return getSaveConsommationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> getUpdateConsommationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateConsommation",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> getUpdateConsommationMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> getUpdateConsommationMethod;
    if ((getUpdateConsommationMethod = ConsommationServiceGrpc.getUpdateConsommationMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getUpdateConsommationMethod = ConsommationServiceGrpc.getUpdateConsommationMethod) == null) {
          ConsommationServiceGrpc.getUpdateConsommationMethod = getUpdateConsommationMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "updateConsommation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("updateConsommation"))
                  .build();
          }
        }
     }
     return getUpdateConsommationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> getDeleteConsommationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConsommation",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> getDeleteConsommationMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> getDeleteConsommationMethod;
    if ((getDeleteConsommationMethod = ConsommationServiceGrpc.getDeleteConsommationMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getDeleteConsommationMethod = ConsommationServiceGrpc.getDeleteConsommationMethod) == null) {
          ConsommationServiceGrpc.getDeleteConsommationMethod = getDeleteConsommationMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "DeleteConsommation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("DeleteConsommation"))
                  .build();
          }
        }
     }
     return getDeleteConsommationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> getGetConsommationByCompteursAndPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsommationByCompteursAndPeriod",
      requestType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest.class,
      responseType = com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest,
      com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> getGetConsommationByCompteursAndPeriodMethod() {
    io.grpc.MethodDescriptor<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> getGetConsommationByCompteursAndPeriodMethod;
    if ((getGetConsommationByCompteursAndPeriodMethod = ConsommationServiceGrpc.getGetConsommationByCompteursAndPeriodMethod) == null) {
      synchronized (ConsommationServiceGrpc.class) {
        if ((getGetConsommationByCompteursAndPeriodMethod = ConsommationServiceGrpc.getGetConsommationByCompteursAndPeriodMethod) == null) {
          ConsommationServiceGrpc.getGetConsommationByCompteursAndPeriodMethod = getGetConsommationByCompteursAndPeriodMethod = 
              io.grpc.MethodDescriptor.<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest, com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConsommationService", "GetConsommationByCompteursAndPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsommationServiceMethodDescriptorSupplier("GetConsommationByCompteursAndPeriod"))
                  .build();
          }
        }
     }
     return getGetConsommationByCompteursAndPeriodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsommationServiceStub newStub(io.grpc.Channel channel) {
    return new ConsommationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsommationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConsommationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsommationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConsommationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ConsommationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllConsommations(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllConsommationsMethod(), responseObserver);
    }

    /**
     */
    public void getConsommationsByCompteur(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsommationsByCompteurMethod(), responseObserver);
    }

    /**
     */
    public void getConsommationById(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsommationByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveConsommationMethod(), responseObserver);
    }

    /**
     */
    public void updateConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateConsommationMethod(), responseObserver);
    }

    /**
     */
    public void deleteConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteConsommationMethod(), responseObserver);
    }

    /**
     */
    public void getConsommationByCompteursAndPeriod(com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsommationByCompteursAndPeriodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllConsommationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse>(
                  this, METHODID_GET_ALL_CONSOMMATIONS)))
          .addMethod(
            getGetConsommationsByCompteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse>(
                  this, METHODID_GET_CONSOMMATIONS_BY_COMPTEUR)))
          .addMethod(
            getGetConsommationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse>(
                  this, METHODID_GET_CONSOMMATION_BY_ID)))
          .addMethod(
            getSaveConsommationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse>(
                  this, METHODID_SAVE_CONSOMMATION)))
          .addMethod(
            getUpdateConsommationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse>(
                  this, METHODID_UPDATE_CONSOMMATION)))
          .addMethod(
            getDeleteConsommationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse>(
                  this, METHODID_DELETE_CONSOMMATION)))
          .addMethod(
            getGetConsommationByCompteursAndPeriodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest,
                com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse>(
                  this, METHODID_GET_CONSOMMATION_BY_COMPTEURS_AND_PERIOD)))
          .build();
    }
  }

  /**
   */
  public static final class ConsommationServiceStub extends io.grpc.stub.AbstractStub<ConsommationServiceStub> {
    private ConsommationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsommationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsommationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsommationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllConsommations(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllConsommationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConsommationsByCompteur(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsommationsByCompteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConsommationById(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsommationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveConsommationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateConsommationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteConsommationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConsommationByCompteursAndPeriod(com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest request,
        io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsommationByCompteursAndPeriodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConsommationServiceBlockingStub extends io.grpc.stub.AbstractStub<ConsommationServiceBlockingStub> {
    private ConsommationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsommationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsommationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsommationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse getAllConsommations(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllConsommationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse getConsommationsByCompteur(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConsommationsByCompteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse getConsommationById(com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConsommationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse saveConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveConsommationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse updateConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateConsommationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse deleteConsommation(com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteConsommationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse getConsommationByCompteursAndPeriod(com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConsommationByCompteursAndPeriodMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConsommationServiceFutureStub extends io.grpc.stub.AbstractStub<ConsommationServiceFutureStub> {
    private ConsommationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsommationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsommationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsommationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse> getAllConsommations(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllConsommationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse> getConsommationsByCompteur(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsommationsByCompteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse> getConsommationById(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsommationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse> saveConsommation(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveConsommationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse> updateConsommation(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateConsommationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse> deleteConsommation(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteConsommationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse> getConsommationByCompteursAndPeriod(
        com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsommationByCompteursAndPeriodMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CONSOMMATIONS = 0;
  private static final int METHODID_GET_CONSOMMATIONS_BY_COMPTEUR = 1;
  private static final int METHODID_GET_CONSOMMATION_BY_ID = 2;
  private static final int METHODID_SAVE_CONSOMMATION = 3;
  private static final int METHODID_UPDATE_CONSOMMATION = 4;
  private static final int METHODID_DELETE_CONSOMMATION = 5;
  private static final int METHODID_GET_CONSOMMATION_BY_COMPTEURS_AND_PERIOD = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsommationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsommationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CONSOMMATIONS:
          serviceImpl.getAllConsommations((com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetAllConsommationsResponse>) responseObserver);
          break;
        case METHODID_GET_CONSOMMATIONS_BY_COMPTEUR:
          serviceImpl.getConsommationsByCompteur((com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationsByCompteurResponse>) responseObserver);
          break;
        case METHODID_GET_CONSOMMATION_BY_ID:
          serviceImpl.getConsommationById((com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.GetConsommationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CONSOMMATION:
          serviceImpl.saveConsommation((com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.SaveConsommationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONSOMMATION:
          serviceImpl.updateConsommation((com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.UpdateConsommationResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONSOMMATION:
          serviceImpl.deleteConsommation((com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.DeleteConsommationResponse>) responseObserver);
          break;
        case METHODID_GET_CONSOMMATION_BY_COMPTEURS_AND_PERIOD:
          serviceImpl.getConsommationByCompteursAndPeriod((com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.service.consommationgrpcclient.stub.ConsommationOuterClass.ConsommationResponse>) responseObserver);
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

  private static abstract class ConsommationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsommationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.consommationgrpcclient.stub.ConsommationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsommationService");
    }
  }

  private static final class ConsommationServiceFileDescriptorSupplier
      extends ConsommationServiceBaseDescriptorSupplier {
    ConsommationServiceFileDescriptorSupplier() {}
  }

  private static final class ConsommationServiceMethodDescriptorSupplier
      extends ConsommationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsommationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConsommationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsommationServiceFileDescriptorSupplier())
              .addMethod(getGetAllConsommationsMethod())
              .addMethod(getGetConsommationsByCompteurMethod())
              .addMethod(getGetConsommationByIdMethod())
              .addMethod(getSaveConsommationMethod())
              .addMethod(getUpdateConsommationMethod())
              .addMethod(getDeleteConsommationMethod())
              .addMethod(getGetConsommationByCompteursAndPeriodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
