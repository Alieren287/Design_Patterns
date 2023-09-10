public class Director {
    public Product construct(Builder builder) {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
        return builder.getResult();
    }
}