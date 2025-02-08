public class FirstList<E>
{    
    private final int DEFAULT_SIZE = 10;
    private int currentItem = 0;
    private E[] ar;
  
    @SuppressWarnings("unchecked")
    public FirstList()
    {        
        ar = (E[]) new Object[DEFAULT_SIZE];
    } 

    @SuppressWarnings("unchecked")
    public FirstList(int length)
    {
        ar = (E[]) new Object[length];
    }

    /**
     * Adds an item to the end of the list.
     * @param item The item to add to the end of the list
     */
    public void addItem(E item) {
        // Check if array needs to be expanded
        if (currentItem >= ar.length) {
            doubleListSize();
        }
        // Add item and increment currentItem
        ar[currentItem] = item;
        currentItem++;
    }

    /**
     * Retrieves an item at a specific index from the list.
     * @param index The index of the item to retrieve
     * @return The item at the specified index
     */
    public E getItem(int index) {
        // Check if index is valid
        if (index < 0 || index >= currentItem) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return ar[index];
    }

    /**
     * Returns the number of items in the list.
     * @return The number of items in the list
     */
    public int getLength() {
        return ar.length;  // Return number of items, not array length
    }

    /**
     * Doubles the size of the array when it reaches its capacity.
     */
    @SuppressWarnings("unchecked")
    private void doubleListSize() {
        // Create new array with double the size
        E[] newAr = (E[]) new Object[ar.length * 2];
        // Copy elements from old array to new array
        for (int i = 0; i < ar.length; i++) {
            newAr[i] = ar[i];
        }
        // Update reference to new array
        ar = newAr;
    }

	public void deleteItem(int i) {
		// TODO Auto-generated method stub
		
	}
}