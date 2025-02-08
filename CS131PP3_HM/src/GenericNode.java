/**
 * This class models a GenericNode object that can hold any data type. 
 * Each node has its internal data and pointers to the next node in the list.
 * 
 * @param <T> the type of data stored in the node
 * @author Hanan
 * Programming Project 3
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  // Data of type T
	private GenericNode<T> nextNode; // Pointer to the next node in the list
	
	public GenericNode() {
		this.nextNode = null;
		this.data = null;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public GenericNode<T> getNode() {
		return this;
	}
	
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public GenericNode<T> getNextNode() {
		return this.nextNode;
	}
}
