public class Client {

    AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Client client1 = new Client(new ConcreteFactory1());
        ProductA pa1 = client1.factory.createProductA();
        client1.someOperation();

        Client client2 = new Client(new ConcreteFactory2());
        ProductA pa2 = client2.factory.createProductA();
        client2.someOperation();
    }

    public void someOperation() {
    }
}