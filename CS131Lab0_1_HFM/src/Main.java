/**
 * Main class with the main method.
 * @author Hanan
 * @version 1.0
 * Assigment 0.1 First Assigment of the year
 * Fall/2024
 */
public class Main {
   /**
     * Main method.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Instantiate ArrayFun and call its methods
        ArrayFun arrayFun = new ArrayFun();
       arrayFun.forward();
       arrayFun.backward();
        arrayFun.sum();

       // Instantiate Square and print its area
           Square square = new Square(2.0);
           System.out.println(square.area());

     // Instantiate Circle and print its area
      Circle circle = new Circle(2.0);
        System.out.printf("%.2f", circle.area());
    }
}

