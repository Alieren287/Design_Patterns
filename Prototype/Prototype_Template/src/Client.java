public class Client {

    public static void main(String[] args) {
        Product prototype = new Product();
        prototype.setPart1("Original Part 1");
        prototype.setPart2("Original Part 2");

        try {
            Product product1 = prototype.clone();
            product1.setPart1("Customized Part 1");

            Product product2 = prototype.clone();
            product2.setPart2("Customized Part 2");

            System.out.println("Product 1: " + product1);
            System.out.println("Product 2: " + product2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
