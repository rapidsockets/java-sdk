package com.rapidsockets;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class RapidSockets {

    String gateway = "wss://gateway.rapidsockets.com";
    String api = "https://api.rapidsockets.com";
    // connection
    boolean authenticated = false;
    String session;
    ArrayList<String> packetQueue;
    ArrayList<Callback> cbs;
    ArrayList<Subscription> subscriptions;
    String key;

    public RapidSockets() {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Double rand1 = Math.random();
        Double rand2 = Math.random();
        Double rand3 = Math.random();
        byte[] hash = md.digest(rand1.toString().concat(rand2.toString()).concat(rand3.toString()).getBytes());

        this.session = bytesToHex(hash);

        this.start();
    }

    public void start() {

    }

    public void openConnection() {

    }

    public void onOpen() {

    }

    public void onMessage() {

    }

    public void onError() {

    }

    public void onClose() {

    }

    public void flushQueue() {

    }

    public void establishSubscriptions() {

    }

    public void on() {

    }

    public void subscribe(Subscription subscription) {

    }

    public void publish(Message message) {

    }

    private String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public void setKey(String key) {
        this.key = key;
    }
}
