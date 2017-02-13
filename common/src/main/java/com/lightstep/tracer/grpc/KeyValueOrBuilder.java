// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector.proto

package com.lightstep.tracer.grpc;

public interface KeyValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lightstep.collector.KeyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <code>optional string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Holds arbitrary string data; well-formed JSON strings should go in
   * json_value.
   * </pre>
   *
   * <code>optional string string_value = 2;</code>
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * Holds arbitrary string data; well-formed JSON strings should go in
   * json_value.
   * </pre>
   *
   * <code>optional string string_value = 2;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>optional int64 int_value = 3;</code>
   */
  long getIntValue();

  /**
   * <code>optional double double_value = 4;</code>
   */
  double getDoubleValue();

  /**
   * <code>optional bool bool_value = 5;</code>
   */
  boolean getBoolValue();

  /**
   * <pre>
   * Must be a well-formed JSON value. Truncated JSON should go in
   * string_value.
   * </pre>
   *
   * <code>optional string json_value = 6;</code>
   */
  java.lang.String getJsonValue();
  /**
   * <pre>
   * Must be a well-formed JSON value. Truncated JSON should go in
   * string_value.
   * </pre>
   *
   * <code>optional string json_value = 6;</code>
   */
  com.google.protobuf.ByteString
      getJsonValueBytes();

  public com.lightstep.tracer.grpc.KeyValue.ValueCase getValueCase();
}
