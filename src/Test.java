import com.google.gson.JsonObject;
import com.rapidsockets.Callback;
import com.rapidsockets.Message;
import com.rapidsockets.RapidSockets;
import com.rapidsockets.Subscription;

public class Test {

    public static void main(String[] args) {
        RapidSockets rs = new RapidSockets();
        rs.setKey("mul-f75b9b5c-7b50-47ac-b937-c1909242d0ce");

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
            .setMessage("message")
            .publish();
    }

}