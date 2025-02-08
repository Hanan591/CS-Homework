public class Main {
    public static void main(String[] args) {
        FirstList<Integer> aList = new FirstList<Integer>();
        
      
        for (int i = 0; i < 10; i++) {
            aList.addItem(i);
        }
        
       
        aList.addItem(10);
        
       
        System.out.println("New Size is: " + aList.getLength());
        
       
        aList.addItem(6);
        System.out.println("Item number 3 is: " + aList.getItem(6) + " and should be a 6");
        
        
        aList.deleteItem(2);
        
        
        System.out.println("The first four items in the list are:");
        for (int i = 0; i < 4; i++) {
            System.out.print(aList.getItem(i) + " ");
        }
        System.out.println();
        
       
        FirstList<Square> squareList = new FirstList<Square>();
        
        
        for (int i = 0; i < 20; i++) {
            squareList.addItem(new Square(i));
        }
        
       
        System.out.println("Squares:");
        System.out.println(squareList.getItem(1));
        System.out.println(squareList.getItem(15));
        
        
        FirstList<PointThreeD> pointList = new FirstList<PointThreeD>();
        
        
        for (int i = 0; i < 20; i++) {
            pointList.addItem(new PointThreeD(i, i, i));
        }
        
        
        PointThreeD point3 = pointList.getItem(3);
        PointThreeD point12 = pointList.getItem(12);
        double distance = Math.sqrt(Math.pow(point3.getxPoint() - point12.getxPoint(), 2) +
                                     Math.pow(point3.getyPoint() - point12.getyPoint(), 2) +
                                     Math.pow(point3.getzPoint() - point12.getzPoint(), 2));
        System.out.printf("Point Distance: %.2f%n", distance);
        
        
        FirstList<Object> shapeList = new FirstList<Object>();
        
        
        
        shapeList.addItem(new PointThreeD(2.0, 3.0, 5.0));
        
      
        shapeList.addItem(new Square(2.0));
        
      
        System.out.println("ShapeList contents:");
        System.out.println(shapeList.getItem(0).toString());
        System.out.println(shapeList.getItem(1).toString());
    }
}