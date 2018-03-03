//circle class implementing Shape class

public class Circle implements Shape {

  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return 3.14 * radius * radius;
  }

  public double perimeter() {
    return 2 * 3.14 * radius;
  }

  public String type() {
    return ("circle");
  }
}
 
