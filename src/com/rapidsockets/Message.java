package com.rapidsockets;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Message {

    private RapidSockets rs;
    private Gson gson;

    public String channel;
    private String message;

    public Message(RapidSockets _rs) {
        this.rs = _rs;
        this.gson = new Gson();
    }

    public Message setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public Message setMessage(String string) {
        this.message = this.gson.toJson(string);
        return this;
    }

    public Message setMessage(JsonObject object) {
        this.message = this.gson.toJson(object);
        return this;
    }

    public Message setMessage(JsonArray array) {
        this.message = this.gson.toJson(array);
        return this;
    }

    public void publish() {

    }

}
