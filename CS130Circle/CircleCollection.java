
public class CircleCollection {
 
	Circle [] CirclesAr;
	int numCircles; 
	
	public CircleCollection() {
		numCircles=10;
		CirclesAr = new Circle [10];
	}
	public CircleCollection(int numC) {
		numCircles=numC;
		CirclesAr = new Circle[numC];
	}
	public void fillArray() {
		
		//Circle myCircle = new Circle();
		for (int i=0;i<numCircles;i++) {
			CirclesAr[i]= new Circle(i);
		}
	}
	public void printCircleArea() {
		for (int i=0;i<numCircles;i++) {
			System.out.println(CirclesAr[i].getArea());
		}
	}
}
