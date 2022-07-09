package br.com.macielgoncalves.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: produto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProdutoServiceGrpc {

  private ProdutoServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.macielgoncalves.grpc.ProdutoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.ProductResquet,
      br.com.macielgoncalves.grpc.ProductResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = br.com.macielgoncalves.grpc.ProductResquet.class,
      responseType = br.com.macielgoncalves.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.ProductResquet,
      br.com.macielgoncalves.grpc.ProductResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.ProductResquet, br.com.macielgoncalves.grpc.ProductResponse> getCreateMethod;
    if ((getCreateMethod = ProdutoServiceGrpc.getCreateMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getCreateMethod = ProdutoServiceGrpc.getCreateMethod) == null) {
          ProdutoServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<br.com.macielgoncalves.grpc.ProductResquet, br.com.macielgoncalves.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.ProductResquet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById,
      br.com.macielgoncalves.grpc.ProductResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = br.com.macielgoncalves.grpc.RequestById.class,
      responseType = br.com.macielgoncalves.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById,
      br.com.macielgoncalves.grpc.ProductResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById, br.com.macielgoncalves.grpc.ProductResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ProdutoServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getFindByIdMethod = ProdutoServiceGrpc.getFindByIdMethod) == null) {
          ProdutoServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<br.com.macielgoncalves.grpc.RequestById, br.com.macielgoncalves.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.RequestById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById,
      br.com.macielgoncalves.grpc.ProductResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = br.com.macielgoncalves.grpc.RequestById.class,
      responseType = br.com.macielgoncalves.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById,
      br.com.macielgoncalves.grpc.ProductResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.RequestById, br.com.macielgoncalves.grpc.ProductResponse> getDeleteMethod;
    if ((getDeleteMethod = ProdutoServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getDeleteMethod = ProdutoServiceGrpc.getDeleteMethod) == null) {
          ProdutoServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<br.com.macielgoncalves.grpc.RequestById, br.com.macielgoncalves.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.RequestById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.EmptyRequesty,
      br.com.macielgoncalves.grpc.ProductResponseList> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = br.com.macielgoncalves.grpc.EmptyRequesty.class,
      responseType = br.com.macielgoncalves.grpc.ProductResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.EmptyRequesty,
      br.com.macielgoncalves.grpc.ProductResponseList> getFindAllMethod() {
    io.grpc.MethodDescriptor<br.com.macielgoncalves.grpc.EmptyRequesty, br.com.macielgoncalves.grpc.ProductResponseList> getFindAllMethod;
    if ((getFindAllMethod = ProdutoServiceGrpc.getFindAllMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getFindAllMethod = ProdutoServiceGrpc.getFindAllMethod) == null) {
          ProdutoServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<br.com.macielgoncalves.grpc.EmptyRequesty, br.com.macielgoncalves.grpc.ProductResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.EmptyRequesty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.macielgoncalves.grpc.ProductResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProdutoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceStub>() {
        @java.lang.Override
        public ProdutoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceStub(channel, callOptions);
        }
      };
    return ProdutoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProdutoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceBlockingStub>() {
        @java.lang.Override
        public ProdutoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceBlockingStub(channel, callOptions);
        }
      };
    return ProdutoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProdutoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceFutureStub>() {
        @java.lang.Override
        public ProdutoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceFutureStub(channel, callOptions);
        }
      };
    return ProdutoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProdutoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(br.com.macielgoncalves.grpc.ProductResquet request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findById(br.com.macielgoncalves.grpc.RequestById request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void delete(br.com.macielgoncalves.grpc.RequestById request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findAll(br.com.macielgoncalves.grpc.EmptyRequesty request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.macielgoncalves.grpc.ProductResquet,
                br.com.macielgoncalves.grpc.ProductResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.macielgoncalves.grpc.RequestById,
                br.com.macielgoncalves.grpc.ProductResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.macielgoncalves.grpc.RequestById,
                br.com.macielgoncalves.grpc.ProductResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.macielgoncalves.grpc.EmptyRequesty,
                br.com.macielgoncalves.grpc.ProductResponseList>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ProdutoServiceStub extends io.grpc.stub.AbstractAsyncStub<ProdutoServiceStub> {
    private ProdutoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(br.com.macielgoncalves.grpc.ProductResquet request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(br.com.macielgoncalves.grpc.RequestById request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(br.com.macielgoncalves.grpc.RequestById request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(br.com.macielgoncalves.grpc.EmptyRequesty request,
        io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProdutoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProdutoServiceBlockingStub> {
    private ProdutoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.macielgoncalves.grpc.ProductResponse create(br.com.macielgoncalves.grpc.ProductResquet request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.macielgoncalves.grpc.ProductResponse findById(br.com.macielgoncalves.grpc.RequestById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.macielgoncalves.grpc.ProductResponse delete(br.com.macielgoncalves.grpc.RequestById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.macielgoncalves.grpc.ProductResponseList findAll(br.com.macielgoncalves.grpc.EmptyRequesty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProdutoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProdutoServiceFutureStub> {
    private ProdutoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.macielgoncalves.grpc.ProductResponse> create(
        br.com.macielgoncalves.grpc.ProductResquet request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.macielgoncalves.grpc.ProductResponse> findById(
        br.com.macielgoncalves.grpc.RequestById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.macielgoncalves.grpc.ProductResponse> delete(
        br.com.macielgoncalves.grpc.RequestById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.macielgoncalves.grpc.ProductResponseList> findAll(
        br.com.macielgoncalves.grpc.EmptyRequesty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_FIND_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProdutoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProdutoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((br.com.macielgoncalves.grpc.ProductResquet) request,
              (io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((br.com.macielgoncalves.grpc.RequestById) request,
              (io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((br.com.macielgoncalves.grpc.RequestById) request,
              (io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((br.com.macielgoncalves.grpc.EmptyRequesty) request,
              (io.grpc.stub.StreamObserver<br.com.macielgoncalves.grpc.ProductResponseList>) responseObserver);
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

  private static abstract class ProdutoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProdutoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.macielgoncalves.grpc.Produto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProdutoService");
    }
  }

  private static final class ProdutoServiceFileDescriptorSupplier
      extends ProdutoServiceBaseDescriptorSupplier {
    ProdutoServiceFileDescriptorSupplier() {}
  }

  private static final class ProdutoServiceMethodDescriptorSupplier
      extends ProdutoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProdutoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProdutoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProdutoServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
