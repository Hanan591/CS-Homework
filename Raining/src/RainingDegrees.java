import java.util.Scanner;

public class RainingDegrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner scnr = new Scanner(System.in);
		      
		        System.out.print("Is it raining? (yes/no): ");
		        String raining = scnr.nextLine();
		        boolean isRaining = raining.equals("yes");

		      
		        System.out.print("Is it warmer than 60 degrees? (yes/no): ");
		        String warmer = scnr.nextLine();
		        boolean isWarmer = warmer.equals("yes");

		       
		        if (isWarmer && !isRaining) {
		            System.out.println("Time for a bike ride!");
		        } else {
		            System.out.println("No ride today.");
		        }

		       
		    }
		
	}


