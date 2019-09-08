## RapidSockets Java SDK

### Introduction
This is the official Software Development Kit for Java to interact with the RapidSockets real-time messaging platform.

### Installation
```
tbd
```

### Usage
```java
RapidSockets rs = new RapidSockets();
rs.setKey("your key");

new Subscription(rs)
    .setChannel("user_demo")
    .setCallback(new Callback() {
        @Override
        public void packet(JsonObject packet) {
            super.packet(packet);
            System.out.println(packet.toString());
        }
    })
    .subscribe();

new Message(rs)
    .setChannel("user_demo")
    .setMessage("my_message")
    .publish();
```

### Development specific notes
```
```