import java.util.Scanner;
public class PracticeClass2 {
    public static void main(String args[]) {
 Scanner scnr = new Scanner(System.in);
  int start = scnr.nextInt();
  int end = scnr.nextInt();
  
  if(start > end) {
	 System.out.print("Second number can't be bigger than the first one");
  } else {
	  while (start <= end){
		  System.out.print(start + " ");
		  start = start + 5;
	  }
  }
   }
}