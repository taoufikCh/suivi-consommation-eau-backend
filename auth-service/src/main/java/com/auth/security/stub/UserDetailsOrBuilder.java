// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.auth.security.stub;

public interface UserDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>repeated string authorities = 2;</code>
   * @return A list containing the authorities.
   */
  java.util.List<java.lang.String>
      getAuthoritiesList();
  /**
   * <code>repeated string authorities = 2;</code>
   * @return The count of authorities.
   */
  int getAuthoritiesCount();
  /**
   * <code>repeated string authorities = 2;</code>
   * @param index The index of the element to return.
   * @return The authorities at the given index.
   */
  java.lang.String getAuthorities(int index);
  /**
   * <code>repeated string authorities = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the authorities at the given index.
   */
  com.google.protobuf.ByteString
      getAuthoritiesBytes(int index);

  /**
   * <code>bool account_non_expired = 3;</code>
   * @return The accountNonExpired.
   */
  boolean getAccountNonExpired();

  /**
   * <code>bool account_non_locked = 4;</code>
   * @return The accountNonLocked.
   */
  boolean getAccountNonLocked();

  /**
   * <code>bool credentials_non_expired = 5;</code>
   * @return The credentialsNonExpired.
   */
  boolean getCredentialsNonExpired();

  /**
   * <code>bool enabled = 6;</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
