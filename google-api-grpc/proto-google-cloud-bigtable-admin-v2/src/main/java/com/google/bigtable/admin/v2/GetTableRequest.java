// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * Request message for
 * [google.bigtable.admin.v2.BigtableTableAdmin.GetTable][google.bigtable.admin.v2.BigtableTableAdmin.GetTable]
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.GetTableRequest}
 */
public  final class GetTableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.GetTableRequest)
    GetTableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTableRequest.newBuilder() to construct.
  private GetTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTableRequest() {
    name_ = "";
    view_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTableRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            view_ = rawValue;
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
    return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_GetTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.GetTableRequest.class, com.google.bigtable.admin.v2.GetTableRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The unique name of the requested table.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name of the requested table.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_;
  /**
   * <pre>
   * The view to be applied to the returned table's fields.
   * Defaults to `SCHEMA_VIEW` if unspecified.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  public int getViewValue() {
    return view_;
  }
  /**
   * <pre>
   * The view to be applied to the returned table's fields.
   * Defaults to `SCHEMA_VIEW` if unspecified.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  public com.google.bigtable.admin.v2.Table.View getView() {
    com.google.bigtable.admin.v2.Table.View result = com.google.bigtable.admin.v2.Table.View.valueOf(view_);
    return result == null ? com.google.bigtable.admin.v2.Table.View.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (view_ != com.google.bigtable.admin.v2.Table.View.VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, view_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (view_ != com.google.bigtable.admin.v2.Table.View.VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, view_);
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
    if (!(obj instanceof com.google.bigtable.admin.v2.GetTableRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.GetTableRequest other = (com.google.bigtable.admin.v2.GetTableRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && view_ == other.view_;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.GetTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.GetTableRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Request message for
   * [google.bigtable.admin.v2.BigtableTableAdmin.GetTable][google.bigtable.admin.v2.BigtableTableAdmin.GetTable]
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.GetTableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.GetTableRequest)
      com.google.bigtable.admin.v2.GetTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_GetTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.GetTableRequest.class, com.google.bigtable.admin.v2.GetTableRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.GetTableRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      view_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor;
    }

    public com.google.bigtable.admin.v2.GetTableRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.GetTableRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.GetTableRequest build() {
      com.google.bigtable.admin.v2.GetTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.GetTableRequest buildPartial() {
      com.google.bigtable.admin.v2.GetTableRequest result = new com.google.bigtable.admin.v2.GetTableRequest(this);
      result.name_ = name_;
      result.view_ = view_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.GetTableRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.GetTableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.GetTableRequest other) {
      if (other == com.google.bigtable.admin.v2.GetTableRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.GetTableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.GetTableRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The unique name of the requested table.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the requested table.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the requested table.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the requested table.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the requested table.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     * <pre>
     * The view to be applied to the returned table's fields.
     * Defaults to `SCHEMA_VIEW` if unspecified.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
     */
    public int getViewValue() {
      return view_;
    }
    /**
     * <pre>
     * The view to be applied to the returned table's fields.
     * Defaults to `SCHEMA_VIEW` if unspecified.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
     */
    public Builder setViewValue(int value) {
      view_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The view to be applied to the returned table's fields.
     * Defaults to `SCHEMA_VIEW` if unspecified.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
     */
    public com.google.bigtable.admin.v2.Table.View getView() {
      com.google.bigtable.admin.v2.Table.View result = com.google.bigtable.admin.v2.Table.View.valueOf(view_);
      return result == null ? com.google.bigtable.admin.v2.Table.View.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The view to be applied to the returned table's fields.
     * Defaults to `SCHEMA_VIEW` if unspecified.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
     */
    public Builder setView(com.google.bigtable.admin.v2.Table.View value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The view to be applied to the returned table's fields.
     * Defaults to `SCHEMA_VIEW` if unspecified.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
     */
    public Builder clearView() {
      
      view_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.GetTableRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.GetTableRequest)
  private static final com.google.bigtable.admin.v2.GetTableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.GetTableRequest();
  }

  public static com.google.bigtable.admin.v2.GetTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTableRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTableRequest>() {
    public GetTableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTableRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTableRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.GetTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

