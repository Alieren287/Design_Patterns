public class ConcreteCreatorA extends Creator {

    //private static Product;
    //Create product method can return the static product reference. This way it returns the same object and won't create another.

    @Override
    public Product createProduct() {
        //Static product reference can be newed and can be returned.
        return new ConcreteProductA();
    }
}
