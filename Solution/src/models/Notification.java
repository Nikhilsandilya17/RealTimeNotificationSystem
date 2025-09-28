package models;

public class Notification {
    private ChannelType channelType;
    private String message;
    private User user;

    public Notification(String message, ChannelType channelType, User user) {
        this.channelType = channelType;
        this.message = message;
        this.user = user;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

