
public class Appliction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Hello<Integer> helloInteger = new Hello<>();
   helloInteger.setVariable(43);
   System.out.println("Hello with Integer: " + helloInteger); 
   
   Hello<String> helloString = new Hello<>();
   helloString.setVariable("you can conquer the world Hanan, you are it");
   System.out.println("Hello with String: " + helloString);
	}

}
