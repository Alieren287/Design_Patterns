public class Circle extends Shape {
    int radius;

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public Circle() {
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
