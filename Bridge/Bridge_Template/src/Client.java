public class Client {

    public static void main(String[] args) {

        ConcreteImplementation1 ci1 = new ConcreteImplementation1();
        RefinedAbstraction refinedAbstraction1 = new RefinedAbstraction(ci1);
        refinedAbstraction1.featureN();

        ConcreteImplementation1 ci2 = new ConcreteImplementation1();
        RefinedAbstraction refinedAbstraction2 = new RefinedAbstraction(ci2);
        refinedAbstraction2.featureN();
    }
}
