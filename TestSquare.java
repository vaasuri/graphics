import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSquare {

  @Test
  public void testArea() {
    Square square = new Square(5.0);
    assertEquals( 25.0, square.area(), 0.001);
    Square square1 = new Square(7.0); 
    assertEquals(49.0, square1.area(), 0.001);
  }

  @Test
  public void testPerimeter() {
    Square square = new Square(5.0);
    assertEquals("perimeter", 20.0, square.perimeter(), 0.001);
    square = new Square(7.0);
    assertEquals("perimeter", 28.0, square.perimeter(), 0.001);
  }
}

