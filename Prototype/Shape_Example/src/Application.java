import java.util.List;

public class Application {
    List<Shape> shapes;

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);
    }
}
