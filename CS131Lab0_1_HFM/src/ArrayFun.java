/**
 *This will Represents an array of Squares and Circles.
 */
public class ArrayFun {
  private Square[] mySquareArray;
   private Circle[] myCircleArray;

  /**
   * This is the Default constructor that initializes the arrays. 
   */
    public ArrayFun() {
      mySquareArray = new Square[6];
      myCircleArray = new Circle[6];

       for (int i = 0; i < 6; i++) {
           mySquareArray[i] = new Square(i);
       }
    }

  /**
   * It Sets an item in the square array.
   * @param index the index of the item to set
     * @param s     the new square
     */
   public void setArrayItem(int index, Square s) {
       mySquareArray[index] = s;
   }

    /**
     * This Gets an item from the square array.
     * 
     * @param index the index of the item to get
     * @return the square at the given index
    */
   public Square getArrayItem(int index) {
       return mySquareArray[index];
    }

    /**
     * it Prints the areas of the squares in the array from first to last.
    */
   public void forward() {
       for (int i = 0; i < 6; i++) {
           System.out.println(mySquareArray[i].area());
       }
    }
   /**
     * This now will Prints the areas of the squares in the array from last to first.
     */
    public void backward() {
    	for (int i = 5; i >= 0; i--)
           System.out.println(mySquareArray[i].area());
       }
   

   /**
   * at The End it Prints the sum of the areas of the squares in the array.
   */
    public void sum() {
        double sum = 0;
       for (int i = 0; i < 6; i++) {
    	   sum += mySquareArray[i].area();
      }
     System.out.println(sum);
   }
}