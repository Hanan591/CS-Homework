/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class ArrayP {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		String[] names = new String[20];
		String[] address = new String[20];
		

       // String continueInput = scnr.nextLine();
		String continueInput = ("yes");
		int i=0; 
		int count=0; 
		   while (continueInput.equals("yes"))  {
			   
	            System.out.print("Enter a name: ");
	            
	            names[i]= scnr.nextLine();
	             
	            System.out.print("Enter a fake address: ");
	            
	            address[i] = scnr.nextLine();
	            i++; 
	            System.out.println("Do you want to continue adding names and addresses? Enter (yes): ");
	         
	            continueInput = scnr.nextLine();
	      
	            
	         
		   }
		
	}

}
