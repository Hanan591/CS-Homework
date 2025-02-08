/**
 * Main class to test the Square and Circle classes.
 */
public class Main {
    /**
     * Main method to test the Square and Circle classes.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Square square = new Square(2.0);
        Circle circle = new Circle(2.0);

        System.out.println(square.getInteriorArea());
        System.out.printf("%.2f%n",circle.getInteriorArea());
     
   }
}