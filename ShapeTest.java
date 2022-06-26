import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ShapeTest {
 
 Cylinder c = new Cylinder(7,6);
 @Test
 public void shouldCalculateRadius() {
 System.out.println("running test 1: addition");
 Assertions.assertEquals(8, c.getRadius(),  "Expected  radius result did not match returned value");
 Assertions.assertEquals(7, c.getRadius(),  "Expected  radius result  match returned value");
   Assertions.assertEquals(15, c.getDiameter(),  "Expected  radius result did not match returned value");
   
 }

}
