public class Client {
    ClientInterface anInterface;

    public static void main(String[] args) {
        Data data = new Data();

        Adapter adapter = new Adapter();
        adapter.adaptee = new Service();

        Client client = new Client();
        client.anInterface = adapter;
        client.anInterface.method(data);
    }
}
