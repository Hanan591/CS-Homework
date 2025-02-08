import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

       
        System.out.print("Enter the first integer: ");
        int firstNum = scnr.nextInt();

       
        System.out.print("Enter the second integer: ");
        int secondNum = scnr.nextInt();

      
        int sum = firstNum + secondNum;

       
        System.out.println("The sum is: " + sum);

       
        if (sum > 10) {
            System.out.println("The sum is greater than 10.");
        } else {
            System.out.println("The sum is less than or equal to 10.");
        }
        
      
    }
}



