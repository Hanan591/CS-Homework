/**
 * Class representing a square.
 * 
 */
public class Square extends Shape {

    private double side;

    /**
     * Default constructor that sets the side to 0.0.
     */
    public Square() {
        this.side = 0.0;
    }

    /**
     * Preferred constructor that sets the side to a specified value.
     * 
     * @param side the side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Gets the side of the square.
     * 
     * @return the side of the square
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets the side of the square.
     * 
     * @param side the new side of the square
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculates the interior area of the square.
     * 
     * @return the interior area of the square
     */
    @Override
    public double getInteriorArea() {
        return side * side;
    }
}