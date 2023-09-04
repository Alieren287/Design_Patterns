import java.rmi.Remote;

public class Client {

    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl remote1 = new RemoteControl(tv);
        remote1.togglePower();

        Radio radio = new Radio();
        AdvancedRemoteControl remote2 = new AdvancedRemoteControl(radio);
        remote2.mute();
    }
}
