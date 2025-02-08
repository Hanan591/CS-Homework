
public class Square implements AreaInterface {
    
    private double side;

   
    public Square() {
        this.side = 0.0;
    }

    
    public Square(double side) {
        this.side = side;
    }

    /**
     * Returns the side length of the square.
     * @return the side length of the square
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets the side length of the square.
     * @param side the new side length of the square
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Returns the interior area of the square.
     * @return the interior area of the square
     */
    @Override
    public double getInteriorArea() {
        return side * side;
    }
}