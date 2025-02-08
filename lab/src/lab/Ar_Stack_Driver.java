package lab;

public class Ar_Stack_Driver {
    public static void main(String[] args) {
        
        Ar_Stack<Integer> myStack = new Ar_Stack<>();
        
        
        for (int i = 1; i <= 3; i++) {
            myStack.push(i);
        }
      
                System.out.println("Peeking at the Stack: " + myStack.peek());
        System.out.println("1st Pop: " + myStack.pop());
        System.out.println("2nd Pop: " + myStack.pop());
        
       
       for (int i = 4; i <= 6; i++) {
           myStack.push(i);
        }
        
        System.out.println("3rd Pop: " + myStack.pop());
        System.out.println("4th Pop: " + myStack.pop());
       
        
        while (!myStack.isEmpty()) {
           System.out.println("Emptying the rest of the stack: " + myStack.pop());
      }
    }
}