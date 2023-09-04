public class Client {

    public static void main(String[] args) {
        ConcreteImplementation1 ci1 = new ConcreteImplementation1();
        Abstraction abstraction = new Abstraction(ci1);
        abstraction.feature1();

        ConcreteImplementation2 ci2 = new ConcreteImplementation2();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(ci2);
        refinedAbstraction.featureN();
    }
}
