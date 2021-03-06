// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/StockExchange.proto

package dalalstreet.socketapi.datastreams;

public final class StockExchange {
  private StockExchange() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface StockExchangeDataPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.datastreams.StockExchangeDataPoint)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint32 price = 1;</code>
     */
    int getPrice();

    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    int getStocksInExchange();

    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    int getStocksInMarket();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.datastreams.StockExchangeDataPoint}
   */
  public  static final class StockExchangeDataPoint extends
      com.google.protobuf.GeneratedMessageLite<
          StockExchangeDataPoint, StockExchangeDataPoint.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.datastreams.StockExchangeDataPoint)
      StockExchangeDataPointOrBuilder {
    private StockExchangeDataPoint() {
    }
    public static final int PRICE_FIELD_NUMBER = 1;
    private int price_;
    /**
     * <code>optional uint32 price = 1;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>optional uint32 price = 1;</code>
     */
    private void setPrice(int value) {
      
      price_ = value;
    }
    /**
     * <code>optional uint32 price = 1;</code>
     */
    private void clearPrice() {
      
      price_ = 0;
    }

    public static final int STOCKS_IN_EXCHANGE_FIELD_NUMBER = 2;
    private int stocksInExchange_;
    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    public int getStocksInExchange() {
      return stocksInExchange_;
    }
    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    private void setStocksInExchange(int value) {
      
      stocksInExchange_ = value;
    }
    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    private void clearStocksInExchange() {
      
      stocksInExchange_ = 0;
    }

    public static final int STOCKS_IN_MARKET_FIELD_NUMBER = 3;
    private int stocksInMarket_;
    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    public int getStocksInMarket() {
      return stocksInMarket_;
    }
    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    private void setStocksInMarket(int value) {
      
      stocksInMarket_ = value;
    }
    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    private void clearStocksInMarket() {
      
      stocksInMarket_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (price_ != 0) {
        output.writeUInt32(1, price_);
      }
      if (stocksInExchange_ != 0) {
        output.writeUInt32(2, stocksInExchange_);
      }
      if (stocksInMarket_ != 0) {
        output.writeUInt32(3, stocksInMarket_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, price_);
      }
      if (stocksInExchange_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stocksInExchange_);
      }
      if (stocksInMarket_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stocksInMarket_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.datastreams.StockExchangeDataPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.datastreams.StockExchangeDataPoint)
        dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPointOrBuilder {
      // Construct using dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional uint32 price = 1;</code>
       */
      public int getPrice() {
        return instance.getPrice();
      }
      /**
       * <code>optional uint32 price = 1;</code>
       */
      public Builder setPrice(int value) {
        copyOnWrite();
        instance.setPrice(value);
        return this;
      }
      /**
       * <code>optional uint32 price = 1;</code>
       */
      public Builder clearPrice() {
        copyOnWrite();
        instance.clearPrice();
        return this;
      }

      /**
       * <code>optional uint32 stocks_in_exchange = 2;</code>
       */
      public int getStocksInExchange() {
        return instance.getStocksInExchange();
      }
      /**
       * <code>optional uint32 stocks_in_exchange = 2;</code>
       */
      public Builder setStocksInExchange(int value) {
        copyOnWrite();
        instance.setStocksInExchange(value);
        return this;
      }
      /**
       * <code>optional uint32 stocks_in_exchange = 2;</code>
       */
      public Builder clearStocksInExchange() {
        copyOnWrite();
        instance.clearStocksInExchange();
        return this;
      }

      /**
       * <code>optional uint32 stocks_in_market = 3;</code>
       */
      public int getStocksInMarket() {
        return instance.getStocksInMarket();
      }
      /**
       * <code>optional uint32 stocks_in_market = 3;</code>
       */
      public Builder setStocksInMarket(int value) {
        copyOnWrite();
        instance.setStocksInMarket(value);
        return this;
      }
      /**
       * <code>optional uint32 stocks_in_market = 3;</code>
       */
      public Builder clearStocksInMarket() {
        copyOnWrite();
        instance.clearStocksInMarket();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.datastreams.StockExchangeDataPoint)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint();
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
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint other = (dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint) arg1;
          price_ = visitor.visitInt(price_ != 0, price_,
              other.price_ != 0, other.price_);
          stocksInExchange_ = visitor.visitInt(stocksInExchange_ != 0, stocksInExchange_,
              other.stocksInExchange_ != 0, other.stocksInExchange_);
          stocksInMarket_ = visitor.visitInt(stocksInMarket_ != 0, stocksInMarket_,
              other.stocksInMarket_ != 0, other.stocksInMarket_);
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

                  price_ = input.readUInt32();
                  break;
                }
                case 16: {

                  stocksInExchange_ = input.readUInt32();
                  break;
                }
                case 24: {

                  stocksInMarket_ = input.readUInt32();
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.datastreams.StockExchangeDataPoint)
    private static final dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StockExchangeDataPoint();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StockExchangeDataPoint> PARSER;

    public static com.google.protobuf.Parser<StockExchangeDataPoint> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface StockExchangeUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.datastreams.StockExchangeUpdate)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */
    int getStocksInExchangeCount();
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */
    boolean containsStocksInExchange(
        int key);
    /**
     * Use {@link #getStocksInExchangeMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>
    getStocksInExchange();
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */
    java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>
    getStocksInExchangeMap();
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrDefault(
        int key,
        dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint defaultValue);
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.datastreams.StockExchangeUpdate}
   */
  public  static final class StockExchangeUpdate extends
      com.google.protobuf.GeneratedMessageLite<
          StockExchangeUpdate, StockExchangeUpdate.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.datastreams.StockExchangeUpdate)
      StockExchangeUpdateOrBuilder {
    private StockExchangeUpdate() {
    }
    public static final int STOCKS_IN_EXCHANGE_FIELD_NUMBER = 1;
    private static final class StocksInExchangeDefaultEntryHolder {
      static final com.google.protobuf.MapEntryLite<
          java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> defaultEntry =
              com.google.protobuf.MapEntryLite
              .<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>newDefaultInstance(
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint.getDefaultInstance());
    }
    private com.google.protobuf.MapFieldLite<
        java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> stocksInExchange_ =
            com.google.protobuf.MapFieldLite.emptyMapField();
    private com.google.protobuf.MapFieldLite<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>
    internalGetStocksInExchange() {
      return stocksInExchange_;
    }
    private com.google.protobuf.MapFieldLite<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>
    internalGetMutableStocksInExchange() {
      if (!stocksInExchange_.isMutable()) {
        stocksInExchange_ = stocksInExchange_.mutableCopy();
      }
      return stocksInExchange_;
    }

    public int getStocksInExchangeCount() {
      return internalGetStocksInExchange().size();
    }
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    public boolean containsStocksInExchange(
        int key) {
      
      return internalGetStocksInExchange().containsKey(key);
    }
    /**
     * Use {@link #getStocksInExchangeMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> getStocksInExchange() {
      return getStocksInExchangeMap();
    }
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    public java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> getStocksInExchangeMap() {
      return java.util.Collections.unmodifiableMap(
          internalGetStocksInExchange());
    }
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    public dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrDefault(
        int key,
        dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint defaultValue) {
      
      java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> map =
          internalGetStocksInExchange();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */

    public dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> map =
          internalGetStocksInExchange();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
     */
    private java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint>
    getMutableStocksInExchangeMap() {
      return internalGetMutableStocksInExchange();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (java.util.Map.Entry<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> entry
           : internalGetStocksInExchange().entrySet()) {
        StocksInExchangeDefaultEntryHolder.defaultEntry.serializeTo(
            output, 1, entry.getKey(), entry.getValue());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> entry
           : internalGetStocksInExchange().entrySet()) {
        size += StocksInExchangeDefaultEntryHolder.defaultEntry.computeMessageSize(
          1, entry.getKey(), entry.getValue());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.datastreams.StockExchangeUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.datastreams.StockExchangeUpdate)
        dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdateOrBuilder {
      // Construct using dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }



      public int getStocksInExchangeCount() {
        return instance.getStocksInExchangeMap().size();
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */

      public boolean containsStocksInExchange(
          int key) {
        
        return instance.getStocksInExchangeMap().containsKey(key);
      }

      public Builder clearStocksInExchange() {
        copyOnWrite();
        instance.getMutableStocksInExchangeMap().clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */

      public Builder removeStocksInExchange(
          int key) {
        
        copyOnWrite();
        instance.getMutableStocksInExchangeMap().remove(key);
        return this;
      }
      /**
       * Use {@link #getStocksInExchangeMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> getStocksInExchange() {
        return getStocksInExchangeMap();
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */
      public java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> getStocksInExchangeMap() {
        return java.util.Collections.unmodifiableMap(
            instance.getStocksInExchangeMap());
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */

      public dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrDefault(
          int key,
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint defaultValue) {
        
        java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> map =
            instance.getStocksInExchangeMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */

      public dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint getStocksInExchangeOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> map =
            instance.getStocksInExchangeMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */
      public Builder putStocksInExchange(
          int key,
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        copyOnWrite();
        instance.getMutableStocksInExchangeMap().put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .dalalstreet.socketapi.datastreams.StockExchangeDataPoint&gt; stocks_in_exchange = 1;</code>
       */
      public Builder putAllStocksInExchange(
          java.util.Map<java.lang.Integer, dalalstreet.socketapi.datastreams.StockExchange.StockExchangeDataPoint> values) {
        copyOnWrite();
        instance.getMutableStocksInExchangeMap().putAll(values);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.datastreams.StockExchangeUpdate)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          stocksInExchange_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate other = (dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate) arg1;
          stocksInExchange_ = visitor.visitMap(
              stocksInExchange_, other.internalGetStocksInExchange());
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
                case 10: {
                  if (!stocksInExchange_.isMutable()) {
                    stocksInExchange_ = stocksInExchange_.mutableCopy();
                  }
                  StocksInExchangeDefaultEntryHolder.defaultEntry.parseInto(stocksInExchange_, input, extensionRegistry);  break;
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.datastreams.StockExchangeUpdate)
    private static final dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StockExchangeUpdate();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.datastreams.StockExchange.StockExchangeUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StockExchangeUpdate> PARSER;

    public static com.google.protobuf.Parser<StockExchangeUpdate> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
