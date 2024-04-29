
public class Square {
	private double side;
	private double area;
	
   public Square (double s) {
	   side = s;
	   area = s*s;
   }

    public void setSide(double s) {
    	side = s;
    	area = s*s;
    }
        
    public double getArea () {
 	   return area;
    }

}
