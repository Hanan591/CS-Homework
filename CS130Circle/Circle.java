
public class Circle {
	
	private double radius;
	private double area;
	
	public Circle() {
		radius = 1; 
		area = calculateArea();
	}
	public Circle(double r) {
		radius = r;
		area = calculateArea();

	}
	public void setRadius(double r) {
		radius = r; 
		area = calculateArea();

	}
   public double getRadius() {
	   return radius; 
   }
   
   private double calculateArea() { 
	   double area = Math.PI * Math.pow(radius, 2);
	   return area; 
   }
   public double getArea() {
	   return area;
   }
}
