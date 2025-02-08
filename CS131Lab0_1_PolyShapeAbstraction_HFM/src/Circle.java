/**
 * Class representing a circle.
 * 
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Default constructor that sets the radius to 0.0.
     */
    public Circle() {
        this.radius = 0.0;
    }

    /**
     * Preferred constructor that sets the radius to a specified value.
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     * 
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     * 
     * @param radius the new radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the interior area of the circle.
     * 
     * @return the interior area of the circle
     */
    @Override
    public double getInteriorArea() {
        return Math.PI * radius * radius;
    }
}