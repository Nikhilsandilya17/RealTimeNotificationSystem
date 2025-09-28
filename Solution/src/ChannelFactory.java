import models.ChannelType;

public class ChannelFactory {
    public static NotificationStrategy getChannel(ChannelType channelType) {
        return switch (channelType) {
            case SMS -> new SMSChannel();
            case EMAIL -> new EmailChannel();
            case PUSH -> new PushChannel();
            default -> throw new IllegalArgumentException("Unknown channel type: " + channelType);
        };
    }
}
