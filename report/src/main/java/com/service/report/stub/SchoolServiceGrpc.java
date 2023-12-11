package com.service.report.stub;

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
    comments = "Source: SchoolService.proto")
public final class SchoolServiceGrpc {

  private SchoolServiceGrpc() {}

  public static final String SERVICE_NAME = "SchoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest,
      com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> getGetAllSchoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSchools",
      requestType = com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest,
      com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> getGetAllSchoolsMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest, com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> getGetAllSchoolsMethod;
    if ((getGetAllSchoolsMethod = SchoolServiceGrpc.getGetAllSchoolsMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getGetAllSchoolsMethod = SchoolServiceGrpc.getGetAllSchoolsMethod) == null) {
          SchoolServiceGrpc.getGetAllSchoolsMethod = getGetAllSchoolsMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest, com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "getAllSchools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("getAllSchools"))
                  .build();
          }
        }
     }
     return getGetAllSchoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest,
      com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> getGetSchoolByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSchoolById",
      requestType = com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest,
      com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> getGetSchoolByIdMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest, com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> getGetSchoolByIdMethod;
    if ((getGetSchoolByIdMethod = SchoolServiceGrpc.getGetSchoolByIdMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getGetSchoolByIdMethod = SchoolServiceGrpc.getGetSchoolByIdMethod) == null) {
          SchoolServiceGrpc.getGetSchoolByIdMethod = getGetSchoolByIdMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest, com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "getSchoolById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("getSchoolById"))
                  .build();
          }
        }
     }
     return getGetSchoolByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> getSaveSchoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveSchool",
      requestType = com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> getSaveSchoolMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> getSaveSchoolMethod;
    if ((getSaveSchoolMethod = SchoolServiceGrpc.getSaveSchoolMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getSaveSchoolMethod = SchoolServiceGrpc.getSaveSchoolMethod) == null) {
          SchoolServiceGrpc.getSaveSchoolMethod = getSaveSchoolMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "saveSchool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("saveSchool"))
                  .build();
          }
        }
     }
     return getSaveSchoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> getUpdateSchoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSchool",
      requestType = com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> getUpdateSchoolMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> getUpdateSchoolMethod;
    if ((getUpdateSchoolMethod = SchoolServiceGrpc.getUpdateSchoolMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getUpdateSchoolMethod = SchoolServiceGrpc.getUpdateSchoolMethod) == null) {
          SchoolServiceGrpc.getUpdateSchoolMethod = getUpdateSchoolMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "updateSchool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("updateSchool"))
                  .build();
          }
        }
     }
     return getUpdateSchoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> getDeleteSchoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSchool",
      requestType = com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest,
      com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> getDeleteSchoolMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> getDeleteSchoolMethod;
    if ((getDeleteSchoolMethod = SchoolServiceGrpc.getDeleteSchoolMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getDeleteSchoolMethod = SchoolServiceGrpc.getDeleteSchoolMethod) == null) {
          SchoolServiceGrpc.getDeleteSchoolMethod = getDeleteSchoolMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest, com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "DeleteSchool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("DeleteSchool"))
                  .build();
          }
        }
     }
     return getDeleteSchoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest,
      com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> getGenerateSchoolReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateSchoolReport",
      requestType = com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest.class,
      responseType = com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest,
      com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> getGenerateSchoolReportMethod() {
    io.grpc.MethodDescriptor<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest, com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> getGenerateSchoolReportMethod;
    if ((getGenerateSchoolReportMethod = SchoolServiceGrpc.getGenerateSchoolReportMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getGenerateSchoolReportMethod = SchoolServiceGrpc.getGenerateSchoolReportMethod) == null) {
          SchoolServiceGrpc.getGenerateSchoolReportMethod = getGenerateSchoolReportMethod = 
              io.grpc.MethodDescriptor.<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest, com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SchoolService", "GenerateSchoolReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("GenerateSchoolReport"))
                  .build();
          }
        }
     }
     return getGenerateSchoolReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchoolServiceStub newStub(io.grpc.Channel channel) {
    return new SchoolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SchoolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SchoolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SchoolServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllSchools(com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSchoolsMethod(), responseObserver);
    }

    /**
     */
    public void getSchoolById(com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSchoolByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveSchool(com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveSchoolMethod(), responseObserver);
    }

    /**
     */
    public void updateSchool(com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSchoolMethod(), responseObserver);
    }

    /**
     */
    public void deleteSchool(com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSchoolMethod(), responseObserver);
    }

    /**
     */
    public void generateSchoolReport(com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateSchoolReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllSchoolsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest,
                com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse>(
                  this, METHODID_GET_ALL_SCHOOLS)))
          .addMethod(
            getGetSchoolByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest,
                com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse>(
                  this, METHODID_GET_SCHOOL_BY_ID)))
          .addMethod(
            getSaveSchoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest,
                com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse>(
                  this, METHODID_SAVE_SCHOOL)))
          .addMethod(
            getUpdateSchoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest,
                com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse>(
                  this, METHODID_UPDATE_SCHOOL)))
          .addMethod(
            getDeleteSchoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest,
                com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse>(
                  this, METHODID_DELETE_SCHOOL)))
          .addMethod(
            getGenerateSchoolReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest,
                com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse>(
                  this, METHODID_GENERATE_SCHOOL_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class SchoolServiceStub extends io.grpc.stub.AbstractStub<SchoolServiceStub> {
    private SchoolServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllSchools(com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllSchoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchoolById(com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSchoolByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveSchool(com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveSchoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSchool(com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSchoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSchool(com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSchoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateSchoolReport(com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest request,
        io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateSchoolReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SchoolServiceBlockingStub extends io.grpc.stub.AbstractStub<SchoolServiceBlockingStub> {
    private SchoolServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse getAllSchools(com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllSchoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse getSchoolById(com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSchoolByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse saveSchool(com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveSchoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse updateSchool(com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSchoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse deleteSchool(com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSchoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse generateSchoolReport(com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateSchoolReportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SchoolServiceFutureStub extends io.grpc.stub.AbstractStub<SchoolServiceFutureStub> {
    private SchoolServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse> getAllSchools(
        com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllSchoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse> getSchoolById(
        com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSchoolByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse> saveSchool(
        com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveSchoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse> updateSchool(
        com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSchoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse> deleteSchool(
        com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSchoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse> generateSchoolReport(
        com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateSchoolReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_SCHOOLS = 0;
  private static final int METHODID_GET_SCHOOL_BY_ID = 1;
  private static final int METHODID_SAVE_SCHOOL = 2;
  private static final int METHODID_UPDATE_SCHOOL = 3;
  private static final int METHODID_DELETE_SCHOOL = 4;
  private static final int METHODID_GENERATE_SCHOOL_REPORT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SchoolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SchoolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_SCHOOLS:
          serviceImpl.getAllSchools((com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetAllSchoolsResponse>) responseObserver);
          break;
        case METHODID_GET_SCHOOL_BY_ID:
          serviceImpl.getSchoolById((com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GetSchoolByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_SCHOOL:
          serviceImpl.saveSchool((com.service.report.stub.SchoolServiceOuterClass.SaveSchoolRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.SaveSchoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCHOOL:
          serviceImpl.updateSchool((com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.UpdateSchoolResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCHOOL:
          serviceImpl.deleteSchool((com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.DeleteSchoolResponse>) responseObserver);
          break;
        case METHODID_GENERATE_SCHOOL_REPORT:
          serviceImpl.generateSchoolReport((com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportRequest) request,
              (io.grpc.stub.StreamObserver<com.service.report.stub.SchoolServiceOuterClass.GenerateSchoolReportResponse>) responseObserver);
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

  private static abstract class SchoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SchoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service.report.stub.SchoolServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SchoolService");
    }
  }

  private static final class SchoolServiceFileDescriptorSupplier
      extends SchoolServiceBaseDescriptorSupplier {
    SchoolServiceFileDescriptorSupplier() {}
  }

  private static final class SchoolServiceMethodDescriptorSupplier
      extends SchoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SchoolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SchoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchoolServiceFileDescriptorSupplier())
              .addMethod(getGetAllSchoolsMethod())
              .addMethod(getGetSchoolByIdMethod())
              .addMethod(getSaveSchoolMethod())
              .addMethod(getUpdateSchoolMethod())
              .addMethod(getDeleteSchoolMethod())
              .addMethod(getGenerateSchoolReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
