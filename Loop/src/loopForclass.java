import java.util.Scanner;

public class loopForclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scnr = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = scnr.nextInt();
	        
	        if (n < 10) {
	            for (int i = 0; i < n; i++) {
	                System.out.print("cat ");
	            }
	        }
	        if (n < 10) {
	            int i = 0;
	            while (i < n) {
	                System.out.print("Dog ");
	                i++;
	            }
	        }
	    
	}
	}


