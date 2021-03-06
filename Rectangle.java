//Rectangle class implementing Shape class

public class Rectangle implements Shape {

  double length;
  double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return length * width;
  }

  public double perimeter() {
    return 2 * (length + width);
  }

  public String type() {
    return ("rectangle");
  }
}
 
