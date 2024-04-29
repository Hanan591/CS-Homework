

 

/**
 * 
 */
import java.util.Scanner; 
public class ArrayQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	int[] iAr = {1,10,20,2,4,5,7}; 

	String[] sAr = new String[iAr.length];
	 
	for (int i = 0; i < iAr.length; i++) {
		int[] iAr1 = {1, 10, 20, 2, 4, 5, 7};
		
		   if (iAr1[i] > 7) {
		       sAr[i] = "Found " + iAr1[i];
		   }
		}
		
		for (String s : sAr) {
		    if (!s.isEmpty()) {
		        System.out.println(s);
		    }
		}
	}

			
} 


