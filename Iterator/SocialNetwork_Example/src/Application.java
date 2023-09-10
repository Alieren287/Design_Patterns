public class Application {

    SocialNetwork network;
    SocialSpammer socialSpammer;

    public void config() {
        if (true /*Working with the Facebook*/) {
            this.network = new Facebook();
        }
        /*if (false Working with the LinkedIn); {
            this.network = new LinkedIn();
        }*/
    }
}
