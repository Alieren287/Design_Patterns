public class Main {

    public static void main(String[] args) {

        ConcreteCreatorA concreteCreatorA = new ConcreteCreatorA();
        Product concreteProductA = concreteCreatorA.createProduct();
        concreteProductA.doStuff();

        ConcreteCreatorB concreteCreatorB = new ConcreteCreatorB();
        Product concreteProductB = concreteCreatorB.createProduct();
        concreteProductB.doStuff();

    }
}
