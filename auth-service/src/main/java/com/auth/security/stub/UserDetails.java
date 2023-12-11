// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.auth.security.stub;

/**
 * Protobuf type {@code UserDetails}
 */
public  final class UserDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserDetails)
    UserDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserDetails.newBuilder() to construct.
  private UserDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserDetails() {
    username_ = "";
    authorities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserDetails(
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
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              authorities_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            authorities_.add(s);
            break;
          }
          case 24: {

            accountNonExpired_ = input.readBool();
            break;
          }
          case 32: {

            accountNonLocked_ = input.readBool();
            break;
          }
          case 40: {

            credentialsNonExpired_ = input.readBool();
            break;
          }
          case 48: {

            enabled_ = input.readBool();
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
        authorities_ = authorities_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.auth.security.stub.Auth.internal_static_UserDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.auth.security.stub.Auth.internal_static_UserDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.auth.security.stub.UserDetails.class, com.auth.security.stub.UserDetails.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORITIES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList authorities_;
  /**
   * <code>repeated string authorities = 2;</code>
   * @return A list containing the authorities.
   */
  public com.google.protobuf.ProtocolStringList
      getAuthoritiesList() {
    return authorities_;
  }
  /**
   * <code>repeated string authorities = 2;</code>
   * @return The count of authorities.
   */
  public int getAuthoritiesCount() {
    return authorities_.size();
  }
  /**
   * <code>repeated string authorities = 2;</code>
   * @param index The index of the element to return.
   * @return The authorities at the given index.
   */
  public java.lang.String getAuthorities(int index) {
    return authorities_.get(index);
  }
  /**
   * <code>repeated string authorities = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the authorities at the given index.
   */
  public com.google.protobuf.ByteString
      getAuthoritiesBytes(int index) {
    return authorities_.getByteString(index);
  }

  public static final int ACCOUNT_NON_EXPIRED_FIELD_NUMBER = 3;
  private boolean accountNonExpired_;
  /**
   * <code>bool account_non_expired = 3;</code>
   * @return The accountNonExpired.
   */
  public boolean getAccountNonExpired() {
    return accountNonExpired_;
  }

  public static final int ACCOUNT_NON_LOCKED_FIELD_NUMBER = 4;
  private boolean accountNonLocked_;
  /**
   * <code>bool account_non_locked = 4;</code>
   * @return The accountNonLocked.
   */
  public boolean getAccountNonLocked() {
    return accountNonLocked_;
  }

  public static final int CREDENTIALS_NON_EXPIRED_FIELD_NUMBER = 5;
  private boolean credentialsNonExpired_;
  /**
   * <code>bool credentials_non_expired = 5;</code>
   * @return The credentialsNonExpired.
   */
  public boolean getCredentialsNonExpired() {
    return credentialsNonExpired_;
  }

  public static final int ENABLED_FIELD_NUMBER = 6;
  private boolean enabled_;
  /**
   * <code>bool enabled = 6;</code>
   * @return The enabled.
   */
  public boolean getEnabled() {
    return enabled_;
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
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    for (int i = 0; i < authorities_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authorities_.getRaw(i));
    }
    if (accountNonExpired_ != false) {
      output.writeBool(3, accountNonExpired_);
    }
    if (accountNonLocked_ != false) {
      output.writeBool(4, accountNonLocked_);
    }
    if (credentialsNonExpired_ != false) {
      output.writeBool(5, credentialsNonExpired_);
    }
    if (enabled_ != false) {
      output.writeBool(6, enabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < authorities_.size(); i++) {
        dataSize += computeStringSizeNoTag(authorities_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAuthoritiesList().size();
    }
    if (accountNonExpired_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, accountNonExpired_);
    }
    if (accountNonLocked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, accountNonLocked_);
    }
    if (credentialsNonExpired_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, credentialsNonExpired_);
    }
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enabled_);
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
    if (!(obj instanceof com.auth.security.stub.UserDetails)) {
      return super.equals(obj);
    }
    com.auth.security.stub.UserDetails other = (com.auth.security.stub.UserDetails) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getAuthoritiesList()
        .equals(other.getAuthoritiesList())) return false;
    if (getAccountNonExpired()
        != other.getAccountNonExpired()) return false;
    if (getAccountNonLocked()
        != other.getAccountNonLocked()) return false;
    if (getCredentialsNonExpired()
        != other.getCredentialsNonExpired()) return false;
    if (getEnabled()
        != other.getEnabled()) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    if (getAuthoritiesCount() > 0) {
      hash = (37 * hash) + AUTHORITIES_FIELD_NUMBER;
      hash = (53 * hash) + getAuthoritiesList().hashCode();
    }
    hash = (37 * hash) + ACCOUNT_NON_EXPIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAccountNonExpired());
    hash = (37 * hash) + ACCOUNT_NON_LOCKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAccountNonLocked());
    hash = (37 * hash) + CREDENTIALS_NON_EXPIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCredentialsNonExpired());
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.auth.security.stub.UserDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.UserDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auth.security.stub.UserDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auth.security.stub.UserDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.UserDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auth.security.stub.UserDetails parseFrom(
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
  public static Builder newBuilder(com.auth.security.stub.UserDetails prototype) {
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
   * Protobuf type {@code UserDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserDetails)
      com.auth.security.stub.UserDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.auth.security.stub.Auth.internal_static_UserDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.auth.security.stub.Auth.internal_static_UserDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.auth.security.stub.UserDetails.class, com.auth.security.stub.UserDetails.Builder.class);
    }

    // Construct using com.auth.security.stub.UserDetails.newBuilder()
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
      username_ = "";

      authorities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      accountNonExpired_ = false;

      accountNonLocked_ = false;

      credentialsNonExpired_ = false;

      enabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.auth.security.stub.Auth.internal_static_UserDetails_descriptor;
    }

    @java.lang.Override
    public com.auth.security.stub.UserDetails getDefaultInstanceForType() {
      return com.auth.security.stub.UserDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.auth.security.stub.UserDetails build() {
      com.auth.security.stub.UserDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.auth.security.stub.UserDetails buildPartial() {
      com.auth.security.stub.UserDetails result = new com.auth.security.stub.UserDetails(this);
      int from_bitField0_ = bitField0_;
      result.username_ = username_;
      if (((bitField0_ & 0x00000001) != 0)) {
        authorities_ = authorities_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.authorities_ = authorities_;
      result.accountNonExpired_ = accountNonExpired_;
      result.accountNonLocked_ = accountNonLocked_;
      result.credentialsNonExpired_ = credentialsNonExpired_;
      result.enabled_ = enabled_;
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
      if (other instanceof com.auth.security.stub.UserDetails) {
        return mergeFrom((com.auth.security.stub.UserDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.auth.security.stub.UserDetails other) {
      if (other == com.auth.security.stub.UserDetails.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.authorities_.isEmpty()) {
        if (authorities_.isEmpty()) {
          authorities_ = other.authorities_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAuthoritiesIsMutable();
          authorities_.addAll(other.authorities_);
        }
        onChanged();
      }
      if (other.getAccountNonExpired() != false) {
        setAccountNonExpired(other.getAccountNonExpired());
      }
      if (other.getAccountNonLocked() != false) {
        setAccountNonLocked(other.getAccountNonLocked());
      }
      if (other.getCredentialsNonExpired() != false) {
        setCredentialsNonExpired(other.getCredentialsNonExpired());
      }
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
      com.auth.security.stub.UserDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.auth.security.stub.UserDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList authorities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAuthoritiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        authorities_ = new com.google.protobuf.LazyStringArrayList(authorities_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @return A list containing the authorities.
     */
    public com.google.protobuf.ProtocolStringList
        getAuthoritiesList() {
      return authorities_.getUnmodifiableView();
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @return The count of authorities.
     */
    public int getAuthoritiesCount() {
      return authorities_.size();
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param index The index of the element to return.
     * @return The authorities at the given index.
     */
    public java.lang.String getAuthorities(int index) {
      return authorities_.get(index);
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the authorities at the given index.
     */
    public com.google.protobuf.ByteString
        getAuthoritiesBytes(int index) {
      return authorities_.getByteString(index);
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param index The index to set the value at.
     * @param value The authorities to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorities(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAuthoritiesIsMutable();
      authorities_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param value The authorities to add.
     * @return This builder for chaining.
     */
    public Builder addAuthorities(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAuthoritiesIsMutable();
      authorities_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param values The authorities to add.
     * @return This builder for chaining.
     */
    public Builder addAllAuthorities(
        java.lang.Iterable<java.lang.String> values) {
      ensureAuthoritiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, authorities_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorities() {
      authorities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authorities = 2;</code>
     * @param value The bytes of the authorities to add.
     * @return This builder for chaining.
     */
    public Builder addAuthoritiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAuthoritiesIsMutable();
      authorities_.add(value);
      onChanged();
      return this;
    }

    private boolean accountNonExpired_ ;
    /**
     * <code>bool account_non_expired = 3;</code>
     * @return The accountNonExpired.
     */
    public boolean getAccountNonExpired() {
      return accountNonExpired_;
    }
    /**
     * <code>bool account_non_expired = 3;</code>
     * @param value The accountNonExpired to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNonExpired(boolean value) {
      
      accountNonExpired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool account_non_expired = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNonExpired() {
      
      accountNonExpired_ = false;
      onChanged();
      return this;
    }

    private boolean accountNonLocked_ ;
    /**
     * <code>bool account_non_locked = 4;</code>
     * @return The accountNonLocked.
     */
    public boolean getAccountNonLocked() {
      return accountNonLocked_;
    }
    /**
     * <code>bool account_non_locked = 4;</code>
     * @param value The accountNonLocked to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNonLocked(boolean value) {
      
      accountNonLocked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool account_non_locked = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNonLocked() {
      
      accountNonLocked_ = false;
      onChanged();
      return this;
    }

    private boolean credentialsNonExpired_ ;
    /**
     * <code>bool credentials_non_expired = 5;</code>
     * @return The credentialsNonExpired.
     */
    public boolean getCredentialsNonExpired() {
      return credentialsNonExpired_;
    }
    /**
     * <code>bool credentials_non_expired = 5;</code>
     * @param value The credentialsNonExpired to set.
     * @return This builder for chaining.
     */
    public Builder setCredentialsNonExpired(boolean value) {
      
      credentialsNonExpired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool credentials_non_expired = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCredentialsNonExpired() {
      
      credentialsNonExpired_ = false;
      onChanged();
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>bool enabled = 6;</code>
     * @return The enabled.
     */
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>bool enabled = 6;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:UserDetails)
  }

  // @@protoc_insertion_point(class_scope:UserDetails)
  private static final com.auth.security.stub.UserDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.auth.security.stub.UserDetails();
  }

  public static com.auth.security.stub.UserDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserDetails>
      PARSER = new com.google.protobuf.AbstractParser<UserDetails>() {
    @java.lang.Override
    public UserDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.auth.security.stub.UserDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

