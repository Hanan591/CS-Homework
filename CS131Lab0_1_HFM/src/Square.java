/**
 * In Here I am representing a Square with a side length.
 */
  public class Square {
    private double side;

    /**
    * I guess this the Default constructor that sets the side to 0.0.
    */
    public Square() {
        this.side = 0.0;
    }

   /**
     * This will be the Preferred constructor that sets the side to a given value.
    * 
    */
   public Square(double side) {
       this.side = side;
   }

   /**
     * This will Get the side length of the square.
     * 
    * @return the side length
     */
    public double getSide() {
       return side;
    }

    /**
    * This Sets the side length of the square.
    * 
    * @param side the new side length
     */
       public void setSide(double side) {
       this.side = side;
   }

   /**
    * Now it will Calculates the area of the square.
     * 
     * @return the area of the square
     */
    public double area() {
        return side * side;
    }
}

