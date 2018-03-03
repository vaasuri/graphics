//Square class implementing Shape class

public class Square implements Shape {

  double side;
  
  public Square(double side) {
    this.side = side;
  }

  public double area() {
    return side * side;
  }

  public double perimeter() {
    return 4 * side;
  }
}
 
