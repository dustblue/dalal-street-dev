// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/Notifications.proto

package dalalstreet.socketapi.datastreams;

public final class Notifications {
  private Notifications() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface NotificationUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dalalstreet.socketapi.datastreams.NotificationUpdate)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    boolean hasNotification();
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    dalalstreet.socketapi.models.NotificationOuterClass.Notification getNotification();
  }
  /**
   * Protobuf type {@code dalalstreet.socketapi.datastreams.NotificationUpdate}
   */
  public  static final class NotificationUpdate extends
      com.google.protobuf.GeneratedMessageLite<
          NotificationUpdate, NotificationUpdate.Builder> implements
      // @@protoc_insertion_point(message_implements:dalalstreet.socketapi.datastreams.NotificationUpdate)
      NotificationUpdateOrBuilder {
    private NotificationUpdate() {
    }
    public static final int NOTIFICATION_FIELD_NUMBER = 1;
    private dalalstreet.socketapi.models.NotificationOuterClass.Notification notification_;
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    public boolean hasNotification() {
      return notification_ != null;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    public dalalstreet.socketapi.models.NotificationOuterClass.Notification getNotification() {
      return notification_ == null ? dalalstreet.socketapi.models.NotificationOuterClass.Notification.getDefaultInstance() : notification_;
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    private void setNotification(dalalstreet.socketapi.models.NotificationOuterClass.Notification value) {
      if (value == null) {
        throw new NullPointerException();
      }
      notification_ = value;
      
      }
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    private void setNotification(
        dalalstreet.socketapi.models.NotificationOuterClass.Notification.Builder builderForValue) {
      notification_ = builderForValue.build();
      
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    private void mergeNotification(dalalstreet.socketapi.models.NotificationOuterClass.Notification value) {
      if (notification_ != null &&
          notification_ != dalalstreet.socketapi.models.NotificationOuterClass.Notification.getDefaultInstance()) {
        notification_ =
          dalalstreet.socketapi.models.NotificationOuterClass.Notification.newBuilder(notification_).mergeFrom(value).buildPartial();
      } else {
        notification_ = value;
      }
      
    }
    /**
     * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
     */
    private void clearNotification() {  notification_ = null;
      
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (notification_ != null) {
        output.writeMessage(1, getNotification());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (notification_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getNotification());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code dalalstreet.socketapi.datastreams.NotificationUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate, Builder> implements
        // @@protoc_insertion_point(builder_implements:dalalstreet.socketapi.datastreams.NotificationUpdate)
        dalalstreet.socketapi.datastreams.Notifications.NotificationUpdateOrBuilder {
      // Construct using dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public boolean hasNotification() {
        return instance.hasNotification();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public dalalstreet.socketapi.models.NotificationOuterClass.Notification getNotification() {
        return instance.getNotification();
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public Builder setNotification(dalalstreet.socketapi.models.NotificationOuterClass.Notification value) {
        copyOnWrite();
        instance.setNotification(value);
        return this;
        }
      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public Builder setNotification(
          dalalstreet.socketapi.models.NotificationOuterClass.Notification.Builder builderForValue) {
        copyOnWrite();
        instance.setNotification(builderForValue);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public Builder mergeNotification(dalalstreet.socketapi.models.NotificationOuterClass.Notification value) {
        copyOnWrite();
        instance.mergeNotification(value);
        return this;
      }
      /**
       * <code>optional .dalalstreet.socketapi.models.Notification notification = 1;</code>
       */
      public Builder clearNotification() {  copyOnWrite();
        instance.clearNotification();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dalalstreet.socketapi.datastreams.NotificationUpdate)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate();
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
          dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate other = (dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate) arg1;
          notification_ = visitor.visitMessage(notification_, other.notification_);
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
                  dalalstreet.socketapi.models.NotificationOuterClass.Notification.Builder subBuilder = null;
                  if (notification_ != null) {
                    subBuilder = notification_.toBuilder();
                  }
                  notification_ = input.readMessage(dalalstreet.socketapi.models.NotificationOuterClass.Notification.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(notification_);
                    notification_ = subBuilder.buildPartial();
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
          if (PARSER == null) {    synchronized (dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate.class) {
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


    // @@protoc_insertion_point(class_scope:dalalstreet.socketapi.datastreams.NotificationUpdate)
    private static final dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NotificationUpdate();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static dalalstreet.socketapi.datastreams.Notifications.NotificationUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<NotificationUpdate> PARSER;

    public static com.google.protobuf.Parser<NotificationUpdate> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
