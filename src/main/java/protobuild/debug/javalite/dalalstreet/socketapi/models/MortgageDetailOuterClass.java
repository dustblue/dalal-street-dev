// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/MortgageDetail.proto

package dalalstreet.socketapi.models;

public final class MortgageDetailOuterClass {
  private MortgageDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface MortgageDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.models.MortgageDetail)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    int getUserId();

    /**
     * <code>optional uint32 stock_id = 3;</code>
     */
    int getStockId();

    /**
     * <code>optional uint32 stocks_in_bank = 4;</code>
     */
    int getStocksInBank();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.models.MortgageDetail}
   */
  public  static final class MortgageDetail extends
      com.google.protobuf.GeneratedMessageLite<
          MortgageDetail, MortgageDetail.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.models.MortgageDetail)
      MortgageDetailOrBuilder {
    private MortgageDetail() {
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

    public static final int USER_ID_FIELD_NUMBER = 2;
    private int userId_;
    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    private void setUserId(int value) {
      
      userId_ = value;
    }
    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    private void clearUserId() {
      
      userId_ = 0;
    }

    public static final int STOCK_ID_FIELD_NUMBER = 3;
    private int stockId_;
    /**
     * <code>optional uint32 stock_id = 3;</code>
     */
    public int getStockId() {
      return stockId_;
    }
    /**
     * <code>optional uint32 stock_id = 3;</code>
     */
    private void setStockId(int value) {
      
      stockId_ = value;
    }
    /**
     * <code>optional uint32 stock_id = 3;</code>
     */
    private void clearStockId() {
      
      stockId_ = 0;
    }

    public static final int STOCKS_IN_BANK_FIELD_NUMBER = 4;
    private int stocksInBank_;
    /**
     * <code>optional uint32 stocks_in_bank = 4;</code>
     */
    public int getStocksInBank() {
      return stocksInBank_;
    }
    /**
     * <code>optional uint32 stocks_in_bank = 4;</code>
     */
    private void setStocksInBank(int value) {
      
      stocksInBank_ = value;
    }
    /**
     * <code>optional uint32 stocks_in_bank = 4;</code>
     */
    private void clearStocksInBank() {
      
      stocksInBank_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (userId_ != 0) {
        output.writeUInt32(2, userId_);
      }
      if (stockId_ != 0) {
        output.writeUInt32(3, stockId_);
      }
      if (stocksInBank_ != 0) {
        output.writeUInt32(4, stocksInBank_);
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
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, userId_);
      }
      if (stockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stockId_);
      }
      if (stocksInBank_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, stocksInBank_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.models.MortgageDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.models.MortgageDetail)
        dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetailOrBuilder {
      // Construct using dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail.newBuilder()
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
       * <code>optional uint32 user_id = 2;</code>
       */
      public int getUserId() {
        return instance.getUserId();
      }
      /**
       * <code>optional uint32 user_id = 2;</code>
       */
      public Builder setUserId(int value) {
        copyOnWrite();
        instance.setUserId(value);
        return this;
      }
      /**
       * <code>optional uint32 user_id = 2;</code>
       */
      public Builder clearUserId() {
        copyOnWrite();
        instance.clearUserId();
        return this;
      }

      /**
       * <code>optional uint32 stock_id = 3;</code>
       */
      public int getStockId() {
        return instance.getStockId();
      }
      /**
       * <code>optional uint32 stock_id = 3;</code>
       */
      public Builder setStockId(int value) {
        copyOnWrite();
        instance.setStockId(value);
        return this;
      }
      /**
       * <code>optional uint32 stock_id = 3;</code>
       */
      public Builder clearStockId() {
        copyOnWrite();
        instance.clearStockId();
        return this;
      }

      /**
       * <code>optional uint32 stocks_in_bank = 4;</code>
       */
      public int getStocksInBank() {
        return instance.getStocksInBank();
      }
      /**
       * <code>optional uint32 stocks_in_bank = 4;</code>
       */
      public Builder setStocksInBank(int value) {
        copyOnWrite();
        instance.setStocksInBank(value);
        return this;
      }
      /**
       * <code>optional uint32 stocks_in_bank = 4;</code>
       */
      public Builder clearStocksInBank() {
        copyOnWrite();
        instance.clearStocksInBank();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.models.MortgageDetail)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail();
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
          dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail other = (dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail) arg1;
          id_ = visitor.visitInt(id_ != 0, id_,
              other.id_ != 0, other.id_);
          userId_ = visitor.visitInt(userId_ != 0, userId_,
              other.userId_ != 0, other.userId_);
          stockId_ = visitor.visitInt(stockId_ != 0, stockId_,
              other.stockId_ != 0, other.stockId_);
          stocksInBank_ = visitor.visitInt(stocksInBank_ != 0, stocksInBank_,
              other.stocksInBank_ != 0, other.stocksInBank_);
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
                case 16: {

                  userId_ = input.readUInt32();
                  break;
                }
                case 24: {

                  stockId_ = input.readUInt32();
                  break;
                }
                case 32: {

                  stocksInBank_ = input.readUInt32();
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.models.MortgageDetail)
    private static final dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MortgageDetail();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.models.MortgageDetailOuterClass.MortgageDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MortgageDetail> PARSER;

    public static com.google.protobuf.Parser<MortgageDetail> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
