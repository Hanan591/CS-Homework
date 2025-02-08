import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fuel Weight in Pounds: ");
        int fuelWeight = scanner.nextInt();

        System.out.print("Enter Fuel Use Per Second in Pounds: ");
        int fuelUsePSec = scanner.nextInt();

       System.out.print("Enter Captain's name: ");
       String captain = scanner.next();

      System.out.print("Enter Navigator's name: ");
     String navigator = scanner.next();

        System.out.print("Enter Engineer's name: ");
        String engineer = scanner.next();

       Rocket rocket = new Rocket(fuelWeight, fuelUsePSec, captain, navigator, engineer);

        System.out.println(rocket.toString());

        System.out.println("Launch!");
       int flightTime = rocket.launch();
       if (flightTime > 0) {
           System.out.println("Houston, we predict MICO in " + flightTime + " seconds");
        } else {
            System.out.println("Not enough fuel to launch the rocket.");
        }

        System.out.println(rocket.toString());
    }
}