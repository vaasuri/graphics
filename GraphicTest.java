//Test for Shapes

public class GraphicTest {

  public static void main(String[] args) {

    Circle circle = new Circle(5.0);
    Square square = new Square(5.0);
    Rectangle rectangle = new Rectangle(4.0, 5.0);

    System.out.println("Area of circle is: " + circle.area());
    System.out.println("Area of square is: " + square.area());
    System.out.println("Area of rectangle is: " + rectangle.area());

    System.out.println("Perimeter of square is: " + square.perimeter());
    System.out.println("Perimeter of rectangle is: " + rectangle.perimeter());
  }
}
