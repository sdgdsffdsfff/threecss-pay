// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddNotify.proto

package protobuf.msg;

public final class AddNotifyOuterClass {
  private AddNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.msg.AddNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string orderRecordId = 1;</code>
     */
    java.lang.String getOrderRecordId();
    /**
     * <code>optional string orderRecordId = 1;</code>
     */
    com.google.protobuf.ByteString
        getOrderRecordIdBytes();
  }
  /**
   * Protobuf type {@code protobuf.msg.AddNotify}
   */
  public  static final class AddNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.msg.AddNotify)
      AddNotifyOrBuilder {
    // Use AddNotify.newBuilder() to construct.
    private AddNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddNotify() {
      orderRecordId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AddNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              orderRecordId_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.msg.AddNotifyOuterClass.internal_static_protobuf_msg_AddNotify_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.msg.AddNotifyOuterClass.internal_static_protobuf_msg_AddNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.msg.AddNotifyOuterClass.AddNotify.class, protobuf.msg.AddNotifyOuterClass.AddNotify.Builder.class);
    }

    public static final int ORDERRECORDID_FIELD_NUMBER = 1;
    private volatile java.lang.Object orderRecordId_;
    /**
     * <code>optional string orderRecordId = 1;</code>
     */
    public java.lang.String getOrderRecordId() {
      java.lang.Object ref = orderRecordId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderRecordId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string orderRecordId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderRecordIdBytes() {
      java.lang.Object ref = orderRecordId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderRecordId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getOrderRecordIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderRecordId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getOrderRecordIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderRecordId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protobuf.msg.AddNotifyOuterClass.AddNotify)) {
        return super.equals(obj);
      }
      protobuf.msg.AddNotifyOuterClass.AddNotify other = (protobuf.msg.AddNotifyOuterClass.AddNotify) obj;

      boolean result = true;
      result = result && getOrderRecordId()
          .equals(other.getOrderRecordId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ORDERRECORDID_FIELD_NUMBER;
      hash = (53 * hash) + getOrderRecordId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.msg.AddNotifyOuterClass.AddNotify parseFrom(
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
    public static Builder newBuilder(protobuf.msg.AddNotifyOuterClass.AddNotify prototype) {
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
     * Protobuf type {@code protobuf.msg.AddNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.msg.AddNotify)
        protobuf.msg.AddNotifyOuterClass.AddNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.msg.AddNotifyOuterClass.internal_static_protobuf_msg_AddNotify_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.msg.AddNotifyOuterClass.internal_static_protobuf_msg_AddNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.msg.AddNotifyOuterClass.AddNotify.class, protobuf.msg.AddNotifyOuterClass.AddNotify.Builder.class);
      }

      // Construct using protobuf.msg.AddNotifyOuterClass.AddNotify.newBuilder()
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
        orderRecordId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.msg.AddNotifyOuterClass.internal_static_protobuf_msg_AddNotify_descriptor;
      }

      public protobuf.msg.AddNotifyOuterClass.AddNotify getDefaultInstanceForType() {
        return protobuf.msg.AddNotifyOuterClass.AddNotify.getDefaultInstance();
      }

      public protobuf.msg.AddNotifyOuterClass.AddNotify build() {
        protobuf.msg.AddNotifyOuterClass.AddNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.msg.AddNotifyOuterClass.AddNotify buildPartial() {
        protobuf.msg.AddNotifyOuterClass.AddNotify result = new protobuf.msg.AddNotifyOuterClass.AddNotify(this);
        result.orderRecordId_ = orderRecordId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.msg.AddNotifyOuterClass.AddNotify) {
          return mergeFrom((protobuf.msg.AddNotifyOuterClass.AddNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.msg.AddNotifyOuterClass.AddNotify other) {
        if (other == protobuf.msg.AddNotifyOuterClass.AddNotify.getDefaultInstance()) return this;
        if (!other.getOrderRecordId().isEmpty()) {
          orderRecordId_ = other.orderRecordId_;
          onChanged();
        }
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
        protobuf.msg.AddNotifyOuterClass.AddNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.msg.AddNotifyOuterClass.AddNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object orderRecordId_ = "";
      /**
       * <code>optional string orderRecordId = 1;</code>
       */
      public java.lang.String getOrderRecordId() {
        java.lang.Object ref = orderRecordId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          orderRecordId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string orderRecordId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOrderRecordIdBytes() {
        java.lang.Object ref = orderRecordId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          orderRecordId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string orderRecordId = 1;</code>
       */
      public Builder setOrderRecordId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        orderRecordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string orderRecordId = 1;</code>
       */
      public Builder clearOrderRecordId() {
        
        orderRecordId_ = getDefaultInstance().getOrderRecordId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string orderRecordId = 1;</code>
       */
      public Builder setOrderRecordIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        orderRecordId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protobuf.msg.AddNotify)
    }

    // @@protoc_insertion_point(class_scope:protobuf.msg.AddNotify)
    private static final protobuf.msg.AddNotifyOuterClass.AddNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protobuf.msg.AddNotifyOuterClass.AddNotify();
    }

    public static protobuf.msg.AddNotifyOuterClass.AddNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddNotify>
        PARSER = new com.google.protobuf.AbstractParser<AddNotify>() {
      public AddNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddNotify> getParserForType() {
      return PARSER;
    }

    public protobuf.msg.AddNotifyOuterClass.AddNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_msg_AddNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_msg_AddNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017AddNotify.proto\022\014protobuf.msg\"\"\n\tAddNo" +
      "tify\022\025\n\rorderRecordId\030\001 \001(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protobuf_msg_AddNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_msg_AddNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_msg_AddNotify_descriptor,
        new java.lang.String[] { "OrderRecordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
