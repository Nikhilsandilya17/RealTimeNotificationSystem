package models;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final Set<ChannelType> subscribedChannels;

    public User(String email, String name, String id) {
        this.subscribedChannels = new HashSet<>();
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<ChannelType> getSubscribedChannels() {
        return subscribedChannels;
    }

    public void subscribeChannel(ChannelType channelType){
        this.subscribedChannels.add(channelType);
    }

    public void unsubscribeChannel(ChannelType channelType){
        this.subscribedChannels.remove(channelType);
    }


}
