// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/User.proto

package dalalstreet.socketapi.models;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.models.User)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional string email = 2;</code>
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 2;</code>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional uint32 cash = 4;</code>
     */
    int getCash();

    /**
     * <code>optional int32 total = 5;</code>
     */
    int getTotal();

    /**
     * <code>optional string created_at = 6;</code>
     */
    java.lang.String getCreatedAt();
    /**
     * <code>optional string created_at = 6;</code>
     */
    com.google.protobuf.ByteString
        getCreatedAtBytes();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.models.User}
   */
  public  static final class User extends
      com.google.protobuf.GeneratedMessageLite<
          User, User.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.models.User)
      UserOrBuilder {
    private User() {
      email_ = "";
      name_ = "";
      createdAt_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int EMAIL_FIELD_NUMBER = 2;
    private java.lang.String email_;
    /**
     * <code>optional string email = 2;</code>
     */
    public java.lang.String getEmail() {
      return email_;
    }
    /**
     * <code>optional string email = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(email_);
    }
    /**
     * <code>optional string email = 2;</code>
     */
    private void setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
    }
    /**
     * <code>optional string email = 2;</code>
     */
    private void clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
    }
    /**
     * <code>optional string email = 2;</code>
     */
    private void setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value.toStringUtf8();
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.String name_;
    /**
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value.toStringUtf8();
    }

    public static final int CASH_FIELD_NUMBER = 4;
    private int cash_;
    /**
     * <code>optional uint32 cash = 4;</code>
     */
    public int getCash() {
      return cash_;
    }
    /**
     * <code>optional uint32 cash = 4;</code>
     */
    private void setCash(int value) {
      
      cash_ = value;
    }
    /**
     * <code>optional uint32 cash = 4;</code>
     */
    private void clearCash() {
      
      cash_ = 0;
    }

    public static final int TOTAL_FIELD_NUMBER = 5;
    private int total_;
    /**
     * <code>optional int32 total = 5;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>optional int32 total = 5;</code>
     */
    private void setTotal(int value) {
      
      total_ = value;
    }
    /**
     * <code>optional int32 total = 5;</code>
     */
    private void clearTotal() {
      
      total_ = 0;
    }

    public static final int CREATED_AT_FIELD_NUMBER = 6;
    private java.lang.String createdAt_;
    /**
     * <code>optional string created_at = 6;</code>
     */
    public java.lang.String getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedAtBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(createdAt_);
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    private void setCreatedAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdAt_ = value;
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    private void clearCreatedAt() {
      
      createdAt_ = getDefaultInstance().getCreatedAt();
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    private void setCreatedAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdAt_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (!email_.isEmpty()) {
        output.writeString(2, getEmail());
      }
      if (!name_.isEmpty()) {
        output.writeString(3, getName());
      }
      if (cash_ != 0) {
        output.writeUInt32(4, cash_);
      }
      if (total_ != 0) {
        output.writeInt32(5, total_);
      }
      if (!createdAt_.isEmpty()) {
        output.writeString(6, getCreatedAt());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (!email_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getEmail());
      }
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getName());
      }
      if (cash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cash_);
      }
      if (total_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, total_);
      }
      if (!createdAt_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getCreatedAt());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.UserOuterClass.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.models.UserOuterClass.User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.models.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.models.UserOuterClass.User, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.models.User)
        dalalstreet.socketapi.models.UserOuterClass.UserOrBuilder {
      // Construct using dalalstreet.socketapi.models.UserOuterClass.User.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional uint32 id = 1;</code>
       */
      public int getId() {
        return instance.getId();
      }
      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>optional uint32 id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>optional string email = 2;</code>
       */
      public java.lang.String getEmail() {
        return instance.getEmail();
      }
      /**
       * <code>optional string email = 2;</code>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        return instance.getEmailBytes();
      }
      /**
       * <code>optional string email = 2;</code>
       */
      public Builder setEmail(
          java.lang.String value) {
        copyOnWrite();
        instance.setEmail(value);
        return this;
      }
      /**
       * <code>optional string email = 2;</code>
       */
      public Builder clearEmail() {
        copyOnWrite();
        instance.clearEmail();
        return this;
      }
      /**
       * <code>optional string email = 2;</code>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setEmailBytes(value);
        return this;
      }

      /**
       * <code>optional string name = 3;</code>
       */
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <code>optional uint32 cash = 4;</code>
       */
      public int getCash() {
        return instance.getCash();
      }
      /**
       * <code>optional uint32 cash = 4;</code>
       */
      public Builder setCash(int value) {
        copyOnWrite();
        instance.setCash(value);
        return this;
      }
      /**
       * <code>optional uint32 cash = 4;</code>
       */
      public Builder clearCash() {
        copyOnWrite();
        instance.clearCash();
        return this;
      }

      /**
       * <code>optional int32 total = 5;</code>
       */
      public int getTotal() {
        return instance.getTotal();
      }
      /**
       * <code>optional int32 total = 5;</code>
       */
      public Builder setTotal(int value) {
        copyOnWrite();
        instance.setTotal(value);
        return this;
      }
      /**
       * <code>optional int32 total = 5;</code>
       */
      public Builder clearTotal() {
        copyOnWrite();
        instance.clearTotal();
        return this;
      }

      /**
       * <code>optional string created_at = 6;</code>
       */
      public java.lang.String getCreatedAt() {
        return instance.getCreatedAt();
      }
      /**
       * <code>optional string created_at = 6;</code>
       */
      public com.google.protobuf.ByteString
          getCreatedAtBytes() {
        return instance.getCreatedAtBytes();
      }
      /**
       * <code>optional string created_at = 6;</code>
       */
      public Builder setCreatedAt(
          java.lang.String value) {
        copyOnWrite();
        instance.setCreatedAt(value);
        return this;
      }
      /**
       * <code>optional string created_at = 6;</code>
       */
      public Builder clearCreatedAt() {
        copyOnWrite();
        instance.clearCreatedAt();
        return this;
      }
      /**
       * <code>optional string created_at = 6;</code>
       */
      public Builder setCreatedAtBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCreatedAtBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.models.User)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.models.UserOuterClass.User();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          dalalstreet.socketapi.models.UserOuterClass.User other = (dalalstreet.socketapi.models.UserOuterClass.User) arg1;
          id_ = visitor.visitInt(id_ != 0, id_,
              other.id_ != 0, other.id_);
          email_ = visitor.visitString(!email_.isEmpty(), email_,
              !other.email_.isEmpty(), other.email_);
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
          cash_ = visitor.visitInt(cash_ != 0, cash_,
              other.cash_ != 0, other.cash_);
          total_ = visitor.visitInt(total_ != 0, total_,
              other.total_ != 0, other.total_);
          createdAt_ = visitor.visitString(!createdAt_.isEmpty(), createdAt_,
              !other.createdAt_.isEmpty(), other.createdAt_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 8: {

                  id_ = input.readUInt32();
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  email_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  name_ = s;
                  break;
                }
                case 32: {

                  cash_ = input.readUInt32();
                  break;
                }
                case 40: {

                  total_ = input.readInt32();
                  break;
                }
                case 50: {
                  String s = input.readStringRequireUtf8();

                  createdAt_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.models.UserOuterClass.User.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.models.User)
    private static final dalalstreet.socketapi.models.UserOuterClass.User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new User();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.models.UserOuterClass.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<User> PARSER;

    public static com.google.protobuf.Parser<User> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
