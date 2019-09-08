package com.rapidsockets;

public class Subscription {

    private RapidSockets rs;
    private String channel;
    private Callback callback;

    public Subscription(RapidSockets _rs) {
        this.rs = _rs;
    }

    public void subscribe() {

    }

    public Subscription setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public Subscription setCallback(Callback callback) {
        this.callback = callback;
        return this;
    }
}
