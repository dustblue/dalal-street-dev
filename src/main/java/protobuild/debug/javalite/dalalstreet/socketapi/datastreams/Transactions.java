// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/Transactions.proto

package dalalstreet.socketapi.datastreams;

public final class Transactions {
  private Transactions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TransactionUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.datastreams.TransactionUpdate)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    boolean hasTransaction();
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    dalalstreet.socketapi.models.TransactionOuterClass.Transaction getTransaction();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.datastreams.TransactionUpdate}
   */
  public  static final class TransactionUpdate extends
      com.google.protobuf.GeneratedMessageLite<
          TransactionUpdate, TransactionUpdate.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.datastreams.TransactionUpdate)
      TransactionUpdateOrBuilder {
    private TransactionUpdate() {
    }
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private dalalstreet.socketapi.models.TransactionOuterClass.Transaction transaction_;
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    public boolean hasTransaction() {
      return transaction_ != null;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    public dalalstreet.socketapi.models.TransactionOuterClass.Transaction getTransaction() {
      return transaction_ == null ? dalalstreet.socketapi.models.TransactionOuterClass.Transaction.getDefaultInstance() : transaction_;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    private void setTransaction(dalalstreet.socketapi.models.TransactionOuterClass.Transaction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      transaction_ = value;
      
      }
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    private void setTransaction(
        dalalstreet.socketapi.models.TransactionOuterClass.Transaction.Builder builderForValue) {
      transaction_ = builderForValue.build();
      
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    private void mergeTransaction(dalalstreet.socketapi.models.TransactionOuterClass.Transaction value) {
      if (transaction_ != null &&
          transaction_ != dalalstreet.socketapi.models.TransactionOuterClass.Transaction.getDefaultInstance()) {
        transaction_ =
          dalalstreet.socketapi.models.TransactionOuterClass.Transaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
      } else {
        transaction_ = value;
      }
      
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
     */
    private void clearTransaction() {  transaction_ = null;
      
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (transaction_ != null) {
        output.writeMessage(1, getTransaction());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (transaction_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTransaction());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.datastreams.TransactionUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.datastreams.TransactionUpdate)
        dalalstreet.socketapi.datastreams.Transactions.TransactionUpdateOrBuilder {
      // Construct using dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public boolean hasTransaction() {
        return instance.hasTransaction();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public dalalstreet.socketapi.models.TransactionOuterClass.Transaction getTransaction() {
        return instance.getTransaction();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public Builder setTransaction(dalalstreet.socketapi.models.TransactionOuterClass.Transaction value) {
        copyOnWrite();
        instance.setTransaction(value);
        return this;
        }
      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public Builder setTransaction(
          dalalstreet.socketapi.models.TransactionOuterClass.Transaction.Builder builderForValue) {
        copyOnWrite();
        instance.setTransaction(builderForValue);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public Builder mergeTransaction(dalalstreet.socketapi.models.TransactionOuterClass.Transaction value) {
        copyOnWrite();
        instance.mergeTransaction(value);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Transaction transaction = 1;</code>
       */
      public Builder clearTransaction() {  copyOnWrite();
        instance.clearTransaction();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.datastreams.TransactionUpdate)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate();
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
          dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate other = (dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate) arg1;
          transaction_ = visitor.visitMessage(transaction_, other.transaction_);
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
                  dalalstreet.socketapi.models.TransactionOuterClass.Transaction.Builder subBuilder = null;
                  if (transaction_ != null) {
                    subBuilder = transaction_.toBuilder();
                  }
                  transaction_ = input.readMessage(dalalstreet.socketapi.models.TransactionOuterClass.Transaction.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(transaction_);
                    transaction_ = subBuilder.buildPartial();
                  }

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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.datastreams.TransactionUpdate)
    private static final dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TransactionUpdate();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.datastreams.Transactions.TransactionUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TransactionUpdate> PARSER;

    public static com.google.protobuf.Parser<TransactionUpdate> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
