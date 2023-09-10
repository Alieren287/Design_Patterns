public class Product implements Cloneable{
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product [Part1: " + part1 + ", Part2: " + part2 + "]";
    }
}
