//Test for Shapes
import java.util.ArrayList;

public class GraphicTest {

  public static void main(String[] args) {

    ArrayList<Shape> shapes = new ArrayList<Shape>();
    Circle circle = new Circle(5.0);
    Square square = new Square(5.0);
    Rectangle rectangle = new Rectangle(4.0, 5.0);
    shapes.add(new Circle(7.0));
    shapes.add(circle);
    shapes.add(square);
    shapes.add(rectangle);
    shapes.add(new Square(6.0));

    System.out.println("Area of circle is: " + circle.area());
    System.out.println("Area of square is: " + square.area());
    System.out.println("Area of rectangle is: " + rectangle.area());

    System.out.println("Perimeter of square is: " + square.perimeter());
    System.out.println("Perimeter of rectangle is: " + rectangle.perimeter());
    System.out.println("Printing all shapes...");
    printShapes(shapes);
  }

  private static void printShapes(ArrayList<Shape> shapes) {

    for (Shape shape : shapes) {
      System.out.println(shape.type() + ": Area = " + shape.area() + ", Perimeter = " + shape.perimeter());
    }
  }
}
