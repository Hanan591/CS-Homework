
/**
 * This will Represent a Circle with a radius.
 */
public class Circle {
    private double radius;

   /**
    * this is the Default constructor that sets the radius to 0.0.
    */
    public Circle() {
       this.radius = 0.0;
   }

   /**
    * The Preferred constructor that sets the radius to a given value.
    * 
    * @param radius of the radius Circle.
    */
   public Circle(double radius) {
       this.radius = radius;
    }

    /**
    * It Gets the radius of the Circle.
    * 
    * @return the radius
    */
   public double getRadius() {
       return radius;
    }

   /**
    * This Sets the side length of the Circle.
     * 
     * @param radius the new radius
     */
    public void setRadius(double radius) {
       this.radius = radius;
    }

   /**
    * At End it Calculates the area of the Circle.
     * 
    * @return the area of the Circle
     */
   public double area() {
	   return Math.PI * radius * radius;
    }
}
