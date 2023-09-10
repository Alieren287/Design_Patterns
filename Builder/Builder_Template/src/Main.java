public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director();

        Product product = director.construct(builder);
        System.out.println("Constructed Product: " + product);
    }
}