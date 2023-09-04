public class Client {

    AbstractFactory factory;

    public Client(){}
    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Client client = new Client();

        client.setFactory(new ConcreteFactory1());

        ProductA pa = client.factory.createProductA();
        client.someOperation();
    }

    public void someOperation(){}

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
}
