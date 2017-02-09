// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/StockPrices.proto

package dalalstreet.socketapi.datastreams;

public final class StockPrices {
  private StockPrices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface StockPricesUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.datastreams.StockPricesUpdate)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */
    int getPricesCount();
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */
    boolean containsPrices(
        int key);
    /**
     * Use {@link #getPricesMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPrices();
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPricesMap();
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    int getPricesOrDefault(
        int key,
        int defaultValue);
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    int getPricesOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.datastreams.StockPricesUpdate}
   */
  public  static final class StockPricesUpdate extends
      com.google.protobuf.GeneratedMessageLite<
          StockPricesUpdate, StockPricesUpdate.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.datastreams.StockPricesUpdate)
      StockPricesUpdateOrBuilder {
    private StockPricesUpdate() {
    }
    public static final int PRICES_FIELD_NUMBER = 1;
    private static final class PricesDefaultEntryHolder {
      static final com.google.protobuf.MapEntryLite<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntryLite
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapFieldLite<
        java.lang.Integer, java.lang.Integer> prices_ =
            com.google.protobuf.MapFieldLite.emptyMapField();
    private com.google.protobuf.MapFieldLite<java.lang.Integer, java.lang.Integer>
    internalGetPrices() {
      return prices_;
    }
    private com.google.protobuf.MapFieldLite<java.lang.Integer, java.lang.Integer>
    internalGetMutablePrices() {
      if (!prices_.isMutable()) {
        prices_ = prices_.mutableCopy();
      }
      return prices_;
    }

    public int getPricesCount() {
      return internalGetPrices().size();
    }
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    public boolean containsPrices(
        int key) {
      
      return internalGetPrices().containsKey(key);
    }
    /**
     * Use {@link #getPricesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPrices() {
      return getPricesMap();
    }
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer> getPricesMap() {
      return java.util.Collections.unmodifiableMap(
          internalGetPrices());
    }
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    public int getPricesOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPrices();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */

    public int getPricesOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPrices();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * key: stockId, value: price
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
     */
    private java.util.Map<java.lang.Integer, java.lang.Integer>
    getMutablePricesMap() {
      return internalGetMutablePrices();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPrices().entrySet()) {
        PricesDefaultEntryHolder.defaultEntry.serializeTo(
            output, 1, entry.getKey(), entry.getValue());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPrices().entrySet()) {
        size += PricesDefaultEntryHolder.defaultEntry.computeMessageSize(
          1, entry.getKey(), entry.getValue());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.datastreams.StockPricesUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.datastreams.StockPricesUpdate)
        dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdateOrBuilder {
      // Construct using dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }



      public int getPricesCount() {
        return instance.getPricesMap().size();
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */

      public boolean containsPrices(
          int key) {
        
        return instance.getPricesMap().containsKey(key);
      }

      public Builder clearPrices() {
        copyOnWrite();
        instance.getMutablePricesMap().clear();
        return this;
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */

      public Builder removePrices(
          int key) {
        
        copyOnWrite();
        instance.getMutablePricesMap().remove(key);
        return this;
      }
      /**
       * Use {@link #getPricesMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPrices() {
        return getPricesMap();
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPricesMap() {
        return java.util.Collections.unmodifiableMap(
            instance.getPricesMap());
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */

      public int getPricesOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            instance.getPricesMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */

      public int getPricesOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            instance.getPricesMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */
      public Builder putPrices(
          int key,
          int value) {
        
        
        copyOnWrite();
        instance.getMutablePricesMap().put(key, value);
        return this;
      }
      /**
       * <pre>
       * key: stockId, value: price
       * </pre>
       *
       * <code>map&lt;uint32, uint32&gt; prices = 1;</code>
       */
      public Builder putAllPrices(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        copyOnWrite();
        instance.getMutablePricesMap().putAll(values);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.datastreams.StockPricesUpdate)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          prices_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate other = (dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate) arg1;
          prices_ = visitor.visitMap(
              prices_, other.internalGetPrices());
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
                  if (!prices_.isMutable()) {
                    prices_ = prices_.mutableCopy();
                  }
                  PricesDefaultEntryHolder.defaultEntry.parseInto(prices_, input, extensionRegistry);  break;
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.datastreams.StockPricesUpdate)
    private static final dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StockPricesUpdate();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.datastreams.StockPrices.StockPricesUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StockPricesUpdate> PARSER;

    public static com.google.protobuf.Parser<StockPricesUpdate> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}