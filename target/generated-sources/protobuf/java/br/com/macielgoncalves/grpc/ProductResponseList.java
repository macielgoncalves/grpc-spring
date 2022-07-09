// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: produto.proto

package br.com.macielgoncalves.grpc;

/**
 * Protobuf type {@code br.com.macielgoncalves.grpc.ProductResponseList}
 */
public final class ProductResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.macielgoncalves.grpc.ProductResponseList)
    ProductResponseListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductResponseList.newBuilder() to construct.
  private ProductResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductResponseList() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductResponseList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductResponseList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              products_ = new java.util.ArrayList<br.com.macielgoncalves.grpc.ProductResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(br.com.macielgoncalves.grpc.ProductResponse.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.macielgoncalves.grpc.Produto.internal_static_br_com_macielgoncalves_grpc_ProductResponseList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.macielgoncalves.grpc.Produto.internal_static_br_com_macielgoncalves_grpc_ProductResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.macielgoncalves.grpc.ProductResponseList.class, br.com.macielgoncalves.grpc.ProductResponseList.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<br.com.macielgoncalves.grpc.ProductResponse> products_;
  /**
   * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.macielgoncalves.grpc.ProductResponse> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.macielgoncalves.grpc.ProductResponseOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
   */
  @java.lang.Override
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
   */
  @java.lang.Override
  public br.com.macielgoncalves.grpc.ProductResponse getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
   */
  @java.lang.Override
  public br.com.macielgoncalves.grpc.ProductResponseOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.macielgoncalves.grpc.ProductResponseList)) {
      return super.equals(obj);
    }
    br.com.macielgoncalves.grpc.ProductResponseList other = (br.com.macielgoncalves.grpc.ProductResponseList) obj;

    if (!getProductsList()
        .equals(other.getProductsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.macielgoncalves.grpc.ProductResponseList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.macielgoncalves.grpc.ProductResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code br.com.macielgoncalves.grpc.ProductResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.macielgoncalves.grpc.ProductResponseList)
      br.com.macielgoncalves.grpc.ProductResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.macielgoncalves.grpc.Produto.internal_static_br_com_macielgoncalves_grpc_ProductResponseList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.macielgoncalves.grpc.Produto.internal_static_br_com_macielgoncalves_grpc_ProductResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.macielgoncalves.grpc.ProductResponseList.class, br.com.macielgoncalves.grpc.ProductResponseList.Builder.class);
    }

    // Construct using br.com.macielgoncalves.grpc.ProductResponseList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.macielgoncalves.grpc.Produto.internal_static_br_com_macielgoncalves_grpc_ProductResponseList_descriptor;
    }

    @java.lang.Override
    public br.com.macielgoncalves.grpc.ProductResponseList getDefaultInstanceForType() {
      return br.com.macielgoncalves.grpc.ProductResponseList.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.macielgoncalves.grpc.ProductResponseList build() {
      br.com.macielgoncalves.grpc.ProductResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.macielgoncalves.grpc.ProductResponseList buildPartial() {
      br.com.macielgoncalves.grpc.ProductResponseList result = new br.com.macielgoncalves.grpc.ProductResponseList(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.macielgoncalves.grpc.ProductResponseList) {
        return mergeFrom((br.com.macielgoncalves.grpc.ProductResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.macielgoncalves.grpc.ProductResponseList other) {
      if (other == br.com.macielgoncalves.grpc.ProductResponseList.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.macielgoncalves.grpc.ProductResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.macielgoncalves.grpc.ProductResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.macielgoncalves.grpc.ProductResponse> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ = new java.util.ArrayList<br.com.macielgoncalves.grpc.ProductResponse>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.macielgoncalves.grpc.ProductResponse, br.com.macielgoncalves.grpc.ProductResponse.Builder, br.com.macielgoncalves.grpc.ProductResponseOrBuilder> productsBuilder_;

    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public java.util.List<br.com.macielgoncalves.grpc.ProductResponse> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public br.com.macielgoncalves.grpc.ProductResponse getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder setProducts(
        int index, br.com.macielgoncalves.grpc.ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder setProducts(
        int index, br.com.macielgoncalves.grpc.ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder addProducts(br.com.macielgoncalves.grpc.ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        int index, br.com.macielgoncalves.grpc.ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        br.com.macielgoncalves.grpc.ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        int index, br.com.macielgoncalves.grpc.ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends br.com.macielgoncalves.grpc.ProductResponse> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public br.com.macielgoncalves.grpc.ProductResponse.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public br.com.macielgoncalves.grpc.ProductResponseOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public java.util.List<? extends br.com.macielgoncalves.grpc.ProductResponseOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public br.com.macielgoncalves.grpc.ProductResponse.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          br.com.macielgoncalves.grpc.ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public br.com.macielgoncalves.grpc.ProductResponse.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, br.com.macielgoncalves.grpc.ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .br.com.macielgoncalves.grpc.ProductResponse products = 1;</code>
     */
    public java.util.List<br.com.macielgoncalves.grpc.ProductResponse.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.macielgoncalves.grpc.ProductResponse, br.com.macielgoncalves.grpc.ProductResponse.Builder, br.com.macielgoncalves.grpc.ProductResponseOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.macielgoncalves.grpc.ProductResponse, br.com.macielgoncalves.grpc.ProductResponse.Builder, br.com.macielgoncalves.grpc.ProductResponseOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:br.com.macielgoncalves.grpc.ProductResponseList)
  }

  // @@protoc_insertion_point(class_scope:br.com.macielgoncalves.grpc.ProductResponseList)
  private static final br.com.macielgoncalves.grpc.ProductResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.macielgoncalves.grpc.ProductResponseList();
  }

  public static br.com.macielgoncalves.grpc.ProductResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductResponseList>
      PARSER = new com.google.protobuf.AbstractParser<ProductResponseList>() {
    @java.lang.Override
    public ProductResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductResponseList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.macielgoncalves.grpc.ProductResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

