// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/Ask.proto

package dalalstreet.socketapi.models;

public final class AskOuterClass {
  private AskOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface AskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.models.Ask)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional int32 user_id = 2;</code>
     */
    int getUserId();

    /**
     * <code>optional int32 stock_id = 3;</code>
     */
    int getStockId();

    /**
     * <code>optional int32 price = 4;</code>
     */
    int getPrice();

    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    int getOrderTypeValue();
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType getOrderType();

    /**
     * <code>optional int32 stock_quantity = 6;</code>
     */
    int getStockQuantity();

    /**
     * <code>optional bool is_closed = 7;</code>
     */
    boolean getIsClosed();

    /**
     * <code>optional string created_at = 8;</code>
     */
    java.lang.String getCreatedAt();
    /**
     * <code>optional string created_at = 8;</code>
     */
    com.google.protobuf.ByteString
        getCreatedAtBytes();

    /**
     * <code>optional string updated_at = 9;</code>
     */
    java.lang.String getUpdatedAt();
    /**
     * <code>optional string updated_at = 9;</code>
     */
    com.google.protobuf.ByteString
        getUpdatedAtBytes();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.models.Ask}
   */
  public  static final class Ask extends
      com.google.protobuf.GeneratedMessageLite<
          Ask, Ask.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.models.Ask)
      AskOrBuilder {
    private Ask() {
      createdAt_ = "";
      updatedAt_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int USER_ID_FIELD_NUMBER = 2;
    private int userId_;
    /**
     * <code>optional int32 user_id = 2;</code>
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>optional int32 user_id = 2;</code>
     */
    private void setUserId(int value) {
      
      userId_ = value;
    }
    /**
     * <code>optional int32 user_id = 2;</code>
     */
    private void clearUserId() {
      
      userId_ = 0;
    }

    public static final int STOCK_ID_FIELD_NUMBER = 3;
    private int stockId_;
    /**
     * <code>optional int32 stock_id = 3;</code>
     */
    public int getStockId() {
      return stockId_;
    }
    /**
     * <code>optional int32 stock_id = 3;</code>
     */
    private void setStockId(int value) {
      
      stockId_ = value;
    }
    /**
     * <code>optional int32 stock_id = 3;</code>
     */
    private void clearStockId() {
      
      stockId_ = 0;
    }

    public static final int PRICE_FIELD_NUMBER = 4;
    private int price_;
    /**
     * <code>optional int32 price = 4;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>optional int32 price = 4;</code>
     */
    private void setPrice(int value) {
      
      price_ = value;
    }
    /**
     * <code>optional int32 price = 4;</code>
     */
    private void clearPrice() {
      
      price_ = 0;
    }

    public static final int ORDER_TYPE_FIELD_NUMBER = 5;
    private int orderType_;
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    public dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType getOrderType() {
      dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType result = dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType.forNumber(orderType_);
      return result == null ? dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    private void setOrderTypeValue(int value) {
        orderType_ = value;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    private void setOrderType(dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orderType_ = value.getNumber();
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
     */
    private void clearOrderType() {
      
      orderType_ = 0;
    }

    public static final int STOCK_QUANTITY_FIELD_NUMBER = 6;
    private int stockQuantity_;
    /**
     * <code>optional int32 stock_quantity = 6;</code>
     */
    public int getStockQuantity() {
      return stockQuantity_;
    }
    /**
     * <code>optional int32 stock_quantity = 6;</code>
     */
    private void setStockQuantity(int value) {
      
      stockQuantity_ = value;
    }
    /**
     * <code>optional int32 stock_quantity = 6;</code>
     */
    private void clearStockQuantity() {
      
      stockQuantity_ = 0;
    }

    public static final int IS_CLOSED_FIELD_NUMBER = 7;
    private boolean isClosed_;
    /**
     * <code>optional bool is_closed = 7;</code>
     */
    public boolean getIsClosed() {
      return isClosed_;
    }
    /**
     * <code>optional bool is_closed = 7;</code>
     */
    private void setIsClosed(boolean value) {
      
      isClosed_ = value;
    }
    /**
     * <code>optional bool is_closed = 7;</code>
     */
    private void clearIsClosed() {
      
      isClosed_ = false;
    }

    public static final int CREATED_AT_FIELD_NUMBER = 8;
    private java.lang.String createdAt_;
    /**
     * <code>optional string created_at = 8;</code>
     */
    public java.lang.String getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>optional string created_at = 8;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedAtBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(createdAt_);
    }
    /**
     * <code>optional string created_at = 8;</code>
     */
    private void setCreatedAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdAt_ = value;
    }
    /**
     * <code>optional string created_at = 8;</code>
     */
    private void clearCreatedAt() {
      
      createdAt_ = getDefaultInstance().getCreatedAt();
    }
    /**
     * <code>optional string created_at = 8;</code>
     */
    private void setCreatedAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdAt_ = value.toStringUtf8();
    }

    public static final int UPDATED_AT_FIELD_NUMBER = 9;
    private java.lang.String updatedAt_;
    /**
     * <code>optional string updated_at = 9;</code>
     */
    public java.lang.String getUpdatedAt() {
      return updatedAt_;
    }
    /**
     * <code>optional string updated_at = 9;</code>
     */
    public com.google.protobuf.ByteString
        getUpdatedAtBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(updatedAt_);
    }
    /**
     * <code>optional string updated_at = 9;</code>
     */
    private void setUpdatedAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      updatedAt_ = value;
    }
    /**
     * <code>optional string updated_at = 9;</code>
     */
    private void clearUpdatedAt() {
      
      updatedAt_ = getDefaultInstance().getUpdatedAt();
    }
    /**
     * <code>optional string updated_at = 9;</code>
     */
    private void setUpdatedAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      updatedAt_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (userId_ != 0) {
        output.writeInt32(2, userId_);
      }
      if (stockId_ != 0) {
        output.writeInt32(3, stockId_);
      }
      if (price_ != 0) {
        output.writeInt32(4, price_);
      }
      if (orderType_ != dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType.LIMIT.getNumber()) {
        output.writeEnum(5, orderType_);
      }
      if (stockQuantity_ != 0) {
        output.writeInt32(6, stockQuantity_);
      }
      if (isClosed_ != false) {
        output.writeBool(7, isClosed_);
      }
      if (!createdAt_.isEmpty()) {
        output.writeString(8, getCreatedAt());
      }
      if (!updatedAt_.isEmpty()) {
        output.writeString(9, getUpdatedAt());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, userId_);
      }
      if (stockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, stockId_);
      }
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, price_);
      }
      if (orderType_ != dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType.LIMIT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, orderType_);
      }
      if (stockQuantity_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, stockQuantity_);
      }
      if (isClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isClosed_);
      }
      if (!createdAt_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getCreatedAt());
      }
      if (!updatedAt_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(9, getUpdatedAt());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.AskOuterClass.Ask parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.models.AskOuterClass.Ask prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.models.Ask}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.models.AskOuterClass.Ask, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.models.Ask)
        dalalstreet.socketapi.models.AskOuterClass.AskOrBuilder {
      // Construct using dalalstreet.socketapi.models.AskOuterClass.Ask.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional int32 id = 1;</code>
       */
      public int getId() {
        return instance.getId();
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>optional int32 user_id = 2;</code>
       */
      public int getUserId() {
        return instance.getUserId();
      }
      /**
       * <code>optional int32 user_id = 2;</code>
       */
      public Builder setUserId(int value) {
        copyOnWrite();
        instance.setUserId(value);
        return this;
      }
      /**
       * <code>optional int32 user_id = 2;</code>
       */
      public Builder clearUserId() {
        copyOnWrite();
        instance.clearUserId();
        return this;
      }

      /**
       * <code>optional int32 stock_id = 3;</code>
       */
      public int getStockId() {
        return instance.getStockId();
      }
      /**
       * <code>optional int32 stock_id = 3;</code>
       */
      public Builder setStockId(int value) {
        copyOnWrite();
        instance.setStockId(value);
        return this;
      }
      /**
       * <code>optional int32 stock_id = 3;</code>
       */
      public Builder clearStockId() {
        copyOnWrite();
        instance.clearStockId();
        return this;
      }

      /**
       * <code>optional int32 price = 4;</code>
       */
      public int getPrice() {
        return instance.getPrice();
      }
      /**
       * <code>optional int32 price = 4;</code>
       */
      public Builder setPrice(int value) {
        copyOnWrite();
        instance.setPrice(value);
        return this;
      }
      /**
       * <code>optional int32 price = 4;</code>
       */
      public Builder clearPrice() {
        copyOnWrite();
        instance.clearPrice();
        return this;
      }

      /**
       * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
       */
      public int getOrderTypeValue() {
        return instance.getOrderTypeValue();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
       */
      public Builder setOrderTypeValue(int value) {
        copyOnWrite();
        instance.setOrderTypeValue(value);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
       */
      public dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType getOrderType() {
        return instance.getOrderType();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
       */
      public Builder setOrderType(dalalstreet.socketapi.models.OrderTypeOuterClass.OrderType value) {
        copyOnWrite();
        instance.setOrderType(value);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.OrderType order_type = 5;</code>
       */
      public Builder clearOrderType() {
        copyOnWrite();
        instance.clearOrderType();
        return this;
      }

      /**
       * <code>optional int32 stock_quantity = 6;</code>
       */
      public int getStockQuantity() {
        return instance.getStockQuantity();
      }
      /**
       * <code>optional int32 stock_quantity = 6;</code>
       */
      public Builder setStockQuantity(int value) {
        copyOnWrite();
        instance.setStockQuantity(value);
        return this;
      }
      /**
       * <code>optional int32 stock_quantity = 6;</code>
       */
      public Builder clearStockQuantity() {
        copyOnWrite();
        instance.clearStockQuantity();
        return this;
      }

      /**
       * <code>optional bool is_closed = 7;</code>
       */
      public boolean getIsClosed() {
        return instance.getIsClosed();
      }
      /**
       * <code>optional bool is_closed = 7;</code>
       */
      public Builder setIsClosed(boolean value) {
        copyOnWrite();
        instance.setIsClosed(value);
        return this;
      }
      /**
       * <code>optional bool is_closed = 7;</code>
       */
      public Builder clearIsClosed() {
        copyOnWrite();
        instance.clearIsClosed();
        return this;
      }

      /**
       * <code>optional string created_at = 8;</code>
       */
      public java.lang.String getCreatedAt() {
        return instance.getCreatedAt();
      }
      /**
       * <code>optional string created_at = 8;</code>
       */
      public com.google.protobuf.ByteString
          getCreatedAtBytes() {
        return instance.getCreatedAtBytes();
      }
      /**
       * <code>optional string created_at = 8;</code>
       */
      public Builder setCreatedAt(
          java.lang.String value) {
        copyOnWrite();
        instance.setCreatedAt(value);
        return this;
      }
      /**
       * <code>optional string created_at = 8;</code>
       */
      public Builder clearCreatedAt() {
        copyOnWrite();
        instance.clearCreatedAt();
        return this;
      }
      /**
       * <code>optional string created_at = 8;</code>
       */
      public Builder setCreatedAtBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCreatedAtBytes(value);
        return this;
      }

      /**
       * <code>optional string updated_at = 9;</code>
       */
      public java.lang.String getUpdatedAt() {
        return instance.getUpdatedAt();
      }
      /**
       * <code>optional string updated_at = 9;</code>
       */
      public com.google.protobuf.ByteString
          getUpdatedAtBytes() {
        return instance.getUpdatedAtBytes();
      }
      /**
       * <code>optional string updated_at = 9;</code>
       */
      public Builder setUpdatedAt(
          java.lang.String value) {
        copyOnWrite();
        instance.setUpdatedAt(value);
        return this;
      }
      /**
       * <code>optional string updated_at = 9;</code>
       */
      public Builder clearUpdatedAt() {
        copyOnWrite();
        instance.clearUpdatedAt();
        return this;
      }
      /**
       * <code>optional string updated_at = 9;</code>
       */
      public Builder setUpdatedAtBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUpdatedAtBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.models.Ask)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.models.AskOuterClass.Ask();
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
          dalalstreet.socketapi.models.AskOuterClass.Ask other = (dalalstreet.socketapi.models.AskOuterClass.Ask) arg1;
          id_ = visitor.visitInt(id_ != 0, id_,
              other.id_ != 0, other.id_);
          userId_ = visitor.visitInt(userId_ != 0, userId_,
              other.userId_ != 0, other.userId_);
          stockId_ = visitor.visitInt(stockId_ != 0, stockId_,
              other.stockId_ != 0, other.stockId_);
          price_ = visitor.visitInt(price_ != 0, price_,
              other.price_ != 0, other.price_);
          orderType_ = visitor.visitInt(orderType_ != 0, orderType_,    other.orderType_ != 0, other.orderType_);
          stockQuantity_ = visitor.visitInt(stockQuantity_ != 0, stockQuantity_,
              other.stockQuantity_ != 0, other.stockQuantity_);
          isClosed_ = visitor.visitBoolean(isClosed_ != false, isClosed_,
              other.isClosed_ != false, other.isClosed_);
          createdAt_ = visitor.visitString(!createdAt_.isEmpty(), createdAt_,
              !other.createdAt_.isEmpty(), other.createdAt_);
          updatedAt_ = visitor.visitString(!updatedAt_.isEmpty(), updatedAt_,
              !other.updatedAt_.isEmpty(), other.updatedAt_);
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

                  id_ = input.readInt32();
                  break;
                }
                case 16: {

                  userId_ = input.readInt32();
                  break;
                }
                case 24: {

                  stockId_ = input.readInt32();
                  break;
                }
                case 32: {

                  price_ = input.readInt32();
                  break;
                }
                case 40: {
                  int rawValue = input.readEnum();

                  orderType_ = rawValue;
                  break;
                }
                case 48: {

                  stockQuantity_ = input.readInt32();
                  break;
                }
                case 56: {

                  isClosed_ = input.readBool();
                  break;
                }
                case 66: {
                  String s = input.readStringRequireUtf8();

                  createdAt_ = s;
                  break;
                }
                case 74: {
                  String s = input.readStringRequireUtf8();

                  updatedAt_ = s;
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.models.AskOuterClass.Ask.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.models.Ask)
    private static final dalalstreet.socketapi.models.AskOuterClass.Ask DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Ask();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.models.AskOuterClass.Ask getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Ask> PARSER;

    public static com.google.protobuf.Parser<Ask> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
