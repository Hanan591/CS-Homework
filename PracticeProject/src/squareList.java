
public class squareList {
	
  private Square[] squares;
  private int count;
  
    public SquareList() {
  
	 squares = new Square[10];
	 count = 0;
    
    }
    public void addSquare(Square sq) {
    	squares[count]=sq; //
    	
    }
    public void printAreas() {
 
        for (int i = 0; i < 30; i++) {
            System.out.println(squares[i].getArea());
        }
      
    }
}

