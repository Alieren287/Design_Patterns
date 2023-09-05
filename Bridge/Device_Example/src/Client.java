public class Client {

    public static void main(String[] args) {
        Tv tv = new Tv();
        AdvancedRemoteControl remote1 = new AdvancedRemoteControl(tv);
        remote1.togglePower();

        Radio radio = new Radio();
        AdvancedRemoteControl remote2 = new AdvancedRemoteControl(radio);
        remote2.mute();
    }
}
