// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/DataStreamType.proto

package dalalstreet.socketapi.datastreams;

public final class DataStreamTypeOuterClass {
  private DataStreamTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code dalalstreet.socketapi.datastreams.DataStreamType}
   */
  public enum DataStreamType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>MARKET_DEPTH = 0;</code>
     */
    MARKET_DEPTH(0),
    /**
     * <code>TRANSACTIONS = 1;</code>
     */
    TRANSACTIONS(1),
    /**
     * <code>NOTIFICATIONS = 2;</code>
     */
    NOTIFICATIONS(2),
    /**
     * <code>STOCK_PRICES = 3;</code>
     */
    STOCK_PRICES(3),
    /**
     * <code>STOCK_EXCHANGE = 4;</code>
     */
    STOCK_EXCHANGE(4),
    /**
     * <code>MARKET_EVENTS = 5;</code>
     */
    MARKET_EVENTS(5),
    /**
     * <code>MY_ORDERS = 6;</code>
     */
    MY_ORDERS(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MARKET_DEPTH = 0;</code>
     */
    public static final int MARKET_DEPTH_VALUE = 0;
    /**
     * <code>TRANSACTIONS = 1;</code>
     */
    public static final int TRANSACTIONS_VALUE = 1;
    /**
     * <code>NOTIFICATIONS = 2;</code>
     */
    public static final int NOTIFICATIONS_VALUE = 2;
    /**
     * <code>STOCK_PRICES = 3;</code>
     */
    public static final int STOCK_PRICES_VALUE = 3;
    /**
     * <code>STOCK_EXCHANGE = 4;</code>
     */
    public static final int STOCK_EXCHANGE_VALUE = 4;
    /**
     * <code>MARKET_EVENTS = 5;</code>
     */
    public static final int MARKET_EVENTS_VALUE = 5;
    /**
     * <code>MY_ORDERS = 6;</code>
     */
    public static final int MY_ORDERS_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataStreamType valueOf(int value) {
      return forNumber(value);
    }

    public static DataStreamType forNumber(int value) {
      switch (value) {
        case 0: return MARKET_DEPTH;
        case 1: return TRANSACTIONS;
        case 2: return NOTIFICATIONS;
        case 3: return STOCK_PRICES;
        case 4: return STOCK_EXCHANGE;
        case 5: return MARKET_EVENTS;
        case 6: return MY_ORDERS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataStreamType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DataStreamType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DataStreamType>() {
            public DataStreamType findValueByNumber(int number) {
              return DataStreamType.forNumber(number);
            }
          };

    private final int value;

    private DataStreamType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:dalalstreet.socketapi.datastreams.DataStreamType)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
