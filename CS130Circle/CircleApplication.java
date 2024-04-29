
public class CircleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Circle myCircle = new Circle();
  Circle myOtherCircle = new Circle(); 
   myCircle = new Circle(10);
   System.out.println(myCircle.getArea());
   
   CircleCollection cc=new CircleCollection(); 
   cc.fillArray();
   cc.printCircleArea();
	}

}
