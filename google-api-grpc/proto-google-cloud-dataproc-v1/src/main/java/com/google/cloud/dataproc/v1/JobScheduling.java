// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Job scheduling options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.JobScheduling}
 */
public  final class JobScheduling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.JobScheduling)
    JobSchedulingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobScheduling.newBuilder() to construct.
  private JobScheduling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobScheduling() {
    maxFailuresPerHour_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobScheduling(
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
          case 8: {

            maxFailuresPerHour_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_JobScheduling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_JobScheduling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.JobScheduling.class, com.google.cloud.dataproc.v1.JobScheduling.Builder.class);
  }

  public static final int MAX_FAILURES_PER_HOUR_FIELD_NUMBER = 1;
  private int maxFailuresPerHour_;
  /**
   * <pre>
   * Optional. Maximum number of times per hour a driver may be restarted as
   * a result of driver terminating with non-zero code before job is
   * reported failed.
   * A job may be reported as thrashing if driver exits with non-zero code
   * 4 times within 10 minute window.
   * Maximum value is 10.
   * </pre>
   *
   * <code>int32 max_failures_per_hour = 1;</code>
   */
  public int getMaxFailuresPerHour() {
    return maxFailuresPerHour_;
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
    if (maxFailuresPerHour_ != 0) {
      output.writeInt32(1, maxFailuresPerHour_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxFailuresPerHour_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxFailuresPerHour_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.JobScheduling)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.JobScheduling other = (com.google.cloud.dataproc.v1.JobScheduling) obj;

    boolean result = true;
    result = result && (getMaxFailuresPerHour()
        == other.getMaxFailuresPerHour());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MAX_FAILURES_PER_HOUR_FIELD_NUMBER;
    hash = (53 * hash) + getMaxFailuresPerHour();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.JobScheduling parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.JobScheduling prototype) {
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
   * <pre>
   * Job scheduling options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.JobScheduling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.JobScheduling)
      com.google.cloud.dataproc.v1.JobSchedulingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_JobScheduling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_JobScheduling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.JobScheduling.class, com.google.cloud.dataproc.v1.JobScheduling.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.JobScheduling.newBuilder()
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
      maxFailuresPerHour_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_JobScheduling_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JobScheduling getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.JobScheduling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JobScheduling build() {
      com.google.cloud.dataproc.v1.JobScheduling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JobScheduling buildPartial() {
      com.google.cloud.dataproc.v1.JobScheduling result = new com.google.cloud.dataproc.v1.JobScheduling(this);
      result.maxFailuresPerHour_ = maxFailuresPerHour_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.JobScheduling) {
        return mergeFrom((com.google.cloud.dataproc.v1.JobScheduling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.JobScheduling other) {
      if (other == com.google.cloud.dataproc.v1.JobScheduling.getDefaultInstance()) return this;
      if (other.getMaxFailuresPerHour() != 0) {
        setMaxFailuresPerHour(other.getMaxFailuresPerHour());
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
      com.google.cloud.dataproc.v1.JobScheduling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.JobScheduling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxFailuresPerHour_ ;
    /**
     * <pre>
     * Optional. Maximum number of times per hour a driver may be restarted as
     * a result of driver terminating with non-zero code before job is
     * reported failed.
     * A job may be reported as thrashing if driver exits with non-zero code
     * 4 times within 10 minute window.
     * Maximum value is 10.
     * </pre>
     *
     * <code>int32 max_failures_per_hour = 1;</code>
     */
    public int getMaxFailuresPerHour() {
      return maxFailuresPerHour_;
    }
    /**
     * <pre>
     * Optional. Maximum number of times per hour a driver may be restarted as
     * a result of driver terminating with non-zero code before job is
     * reported failed.
     * A job may be reported as thrashing if driver exits with non-zero code
     * 4 times within 10 minute window.
     * Maximum value is 10.
     * </pre>
     *
     * <code>int32 max_failures_per_hour = 1;</code>
     */
    public Builder setMaxFailuresPerHour(int value) {
      
      maxFailuresPerHour_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Maximum number of times per hour a driver may be restarted as
     * a result of driver terminating with non-zero code before job is
     * reported failed.
     * A job may be reported as thrashing if driver exits with non-zero code
     * 4 times within 10 minute window.
     * Maximum value is 10.
     * </pre>
     *
     * <code>int32 max_failures_per_hour = 1;</code>
     */
    public Builder clearMaxFailuresPerHour() {
      
      maxFailuresPerHour_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.JobScheduling)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.JobScheduling)
  private static final com.google.cloud.dataproc.v1.JobScheduling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.JobScheduling();
  }

  public static com.google.cloud.dataproc.v1.JobScheduling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobScheduling>
      PARSER = new com.google.protobuf.AbstractParser<JobScheduling>() {
    @java.lang.Override
    public JobScheduling parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobScheduling(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobScheduling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobScheduling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.JobScheduling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
