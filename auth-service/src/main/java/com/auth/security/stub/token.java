// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.auth.security.stub;

/**
 * Protobuf type {@code token}
 */
public  final class token extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:token)
    tokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use token.newBuilder() to construct.
  private token(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private token() {
    token_ = "";
    tokenType_ = "";
    revoked_ = "";
    expired_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new token();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private token(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            tokenType_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            revoked_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            expired_ = s;
            break;
          }
          case 50: {
            com.auth.security.stub.User.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.auth.security.stub.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.auth.security.stub.Auth.internal_static_token_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.auth.security.stub.Auth.internal_static_token_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.auth.security.stub.token.class, com.auth.security.stub.token.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 2;</code>
   * @return The token.
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 2;</code>
   * @return The bytes for token.
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKENTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object tokenType_;
  /**
   * <code>string tokenType = 3;</code>
   * @return The tokenType.
   */
  public java.lang.String getTokenType() {
    java.lang.Object ref = tokenType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenType_ = s;
      return s;
    }
  }
  /**
   * <code>string tokenType = 3;</code>
   * @return The bytes for tokenType.
   */
  public com.google.protobuf.ByteString
      getTokenTypeBytes() {
    java.lang.Object ref = tokenType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVOKED_FIELD_NUMBER = 4;
  private volatile java.lang.Object revoked_;
  /**
   * <code>string revoked = 4;</code>
   * @return The revoked.
   */
  public java.lang.String getRevoked() {
    java.lang.Object ref = revoked_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revoked_ = s;
      return s;
    }
  }
  /**
   * <code>string revoked = 4;</code>
   * @return The bytes for revoked.
   */
  public com.google.protobuf.ByteString
      getRevokedBytes() {
    java.lang.Object ref = revoked_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revoked_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRED_FIELD_NUMBER = 5;
  private volatile java.lang.Object expired_;
  /**
   * <code>string expired = 5;</code>
   * @return The expired.
   */
  public java.lang.String getExpired() {
    java.lang.Object ref = expired_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expired_ = s;
      return s;
    }
  }
  /**
   * <code>string expired = 5;</code>
   * @return The bytes for expired.
   */
  public com.google.protobuf.ByteString
      getExpiredBytes() {
    java.lang.Object ref = expired_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expired_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIELD_NUMBER = 6;
  private com.auth.security.stub.User user_;
  /**
   * <code>.User user = 6;</code>
   * @return Whether the user field is set.
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.User user = 6;</code>
   * @return The user.
   */
  public com.auth.security.stub.User getUser() {
    return user_ == null ? com.auth.security.stub.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.User user = 6;</code>
   */
  public com.auth.security.stub.UserOrBuilder getUserOrBuilder() {
    return getUser();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    if (!getTokenTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tokenType_);
    }
    if (!getRevokedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, revoked_);
    }
    if (!getExpiredBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, expired_);
    }
    if (user_ != null) {
      output.writeMessage(6, getUser());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
    }
    if (!getTokenTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tokenType_);
    }
    if (!getRevokedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, revoked_);
    }
    if (!getExpiredBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, expired_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getUser());
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
    if (!(obj instanceof com.auth.security.stub.token)) {
      return super.equals(obj);
    }
    com.auth.security.stub.token other = (com.auth.security.stub.token) obj;

    if (getId()
        != other.getId()) return false;
    if (!getToken()
        .equals(other.getToken())) return false;
    if (!getTokenType()
        .equals(other.getTokenType())) return false;
    if (!getRevoked()
        .equals(other.getRevoked())) return false;
    if (!getExpired()
        .equals(other.getExpired())) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + TOKENTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTokenType().hashCode();
    hash = (37 * hash) + REVOKED_FIELD_NUMBER;
    hash = (53 * hash) + getRevoked().hashCode();
    hash = (37 * hash) + EXPIRED_FIELD_NUMBER;
    hash = (53 * hash) + getExpired().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.auth.security.stub.token parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.token parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.token parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.token parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.token parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.token parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.token parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.token parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auth.security.stub.token parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.token parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auth.security.stub.token parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.token parseFrom(
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
  public static Builder newBuilder(com.auth.security.stub.token prototype) {
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
   * Protobuf type {@code token}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:token)
      com.auth.security.stub.tokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.auth.security.stub.Auth.internal_static_token_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.auth.security.stub.Auth.internal_static_token_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.auth.security.stub.token.class, com.auth.security.stub.token.Builder.class);
    }

    // Construct using com.auth.security.stub.token.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      token_ = "";

      tokenType_ = "";

      revoked_ = "";

      expired_ = "";

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.auth.security.stub.Auth.internal_static_token_descriptor;
    }

    @java.lang.Override
    public com.auth.security.stub.token getDefaultInstanceForType() {
      return com.auth.security.stub.token.getDefaultInstance();
    }

    @java.lang.Override
    public com.auth.security.stub.token build() {
      com.auth.security.stub.token result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.auth.security.stub.token buildPartial() {
      com.auth.security.stub.token result = new com.auth.security.stub.token(this);
      result.id_ = id_;
      result.token_ = token_;
      result.tokenType_ = tokenType_;
      result.revoked_ = revoked_;
      result.expired_ = expired_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
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
      if (other instanceof com.auth.security.stub.token) {
        return mergeFrom((com.auth.security.stub.token)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.auth.security.stub.token other) {
      if (other == com.auth.security.stub.token.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (!other.getTokenType().isEmpty()) {
        tokenType_ = other.tokenType_;
        onChanged();
      }
      if (!other.getRevoked().isEmpty()) {
        revoked_ = other.revoked_;
        onChanged();
      }
      if (!other.getExpired().isEmpty()) {
        expired_ = other.expired_;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
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
      com.auth.security.stub.token parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.auth.security.stub.token) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 2;</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 2;</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 2;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 2;</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tokenType_ = "";
    /**
     * <code>string tokenType = 3;</code>
     * @return The tokenType.
     */
    public java.lang.String getTokenType() {
      java.lang.Object ref = tokenType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tokenType = 3;</code>
     * @return The bytes for tokenType.
     */
    public com.google.protobuf.ByteString
        getTokenTypeBytes() {
      java.lang.Object ref = tokenType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tokenType = 3;</code>
     * @param value The tokenType to set.
     * @return This builder for chaining.
     */
    public Builder setTokenType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tokenType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tokenType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenType() {
      
      tokenType_ = getDefaultInstance().getTokenType();
      onChanged();
      return this;
    }
    /**
     * <code>string tokenType = 3;</code>
     * @param value The bytes for tokenType to set.
     * @return This builder for chaining.
     */
    public Builder setTokenTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tokenType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object revoked_ = "";
    /**
     * <code>string revoked = 4;</code>
     * @return The revoked.
     */
    public java.lang.String getRevoked() {
      java.lang.Object ref = revoked_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revoked_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string revoked = 4;</code>
     * @return The bytes for revoked.
     */
    public com.google.protobuf.ByteString
        getRevokedBytes() {
      java.lang.Object ref = revoked_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revoked_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string revoked = 4;</code>
     * @param value The revoked to set.
     * @return This builder for chaining.
     */
    public Builder setRevoked(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      revoked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string revoked = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRevoked() {
      
      revoked_ = getDefaultInstance().getRevoked();
      onChanged();
      return this;
    }
    /**
     * <code>string revoked = 4;</code>
     * @param value The bytes for revoked to set.
     * @return This builder for chaining.
     */
    public Builder setRevokedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      revoked_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expired_ = "";
    /**
     * <code>string expired = 5;</code>
     * @return The expired.
     */
    public java.lang.String getExpired() {
      java.lang.Object ref = expired_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expired_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expired = 5;</code>
     * @return The bytes for expired.
     */
    public com.google.protobuf.ByteString
        getExpiredBytes() {
      java.lang.Object ref = expired_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expired_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expired = 5;</code>
     * @param value The expired to set.
     * @return This builder for chaining.
     */
    public Builder setExpired(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expired = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpired() {
      
      expired_ = getDefaultInstance().getExpired();
      onChanged();
      return this;
    }
    /**
     * <code>string expired = 5;</code>
     * @param value The bytes for expired to set.
     * @return This builder for chaining.
     */
    public Builder setExpiredBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expired_ = value;
      onChanged();
      return this;
    }

    private com.auth.security.stub.User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.auth.security.stub.User, com.auth.security.stub.User.Builder, com.auth.security.stub.UserOrBuilder> userBuilder_;
    /**
     * <code>.User user = 6;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.User user = 6;</code>
     * @return The user.
     */
    public com.auth.security.stub.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.auth.security.stub.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.User user = 6;</code>
     */
    public Builder setUser(com.auth.security.stub.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.User user = 6;</code>
     */
    public Builder setUser(
        com.auth.security.stub.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.User user = 6;</code>
     */
    public Builder mergeUser(com.auth.security.stub.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.auth.security.stub.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.User user = 6;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.User user = 6;</code>
     */
    public com.auth.security.stub.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.User user = 6;</code>
     */
    public com.auth.security.stub.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.auth.security.stub.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.User user = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.auth.security.stub.User, com.auth.security.stub.User.Builder, com.auth.security.stub.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.auth.security.stub.User, com.auth.security.stub.User.Builder, com.auth.security.stub.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:token)
  }

  // @@protoc_insertion_point(class_scope:token)
  private static final com.auth.security.stub.token DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.auth.security.stub.token();
  }

  public static com.auth.security.stub.token getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<token>
      PARSER = new com.google.protobuf.AbstractParser<token>() {
    @java.lang.Override
    public token parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new token(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<token> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<token> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.auth.security.stub.token getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

