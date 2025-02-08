
/**
 * This class models a generic linked list where each node holds a GenericNode object.
 * 
 * @param <T> the type of data stored in the list's nodes
 * @author ...
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head;
	private GenericNode<T> tail;
	private int length;
	
	public GenericLinkedList() {
		head = null;
		length = 0;
		tail = head;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public GenericNode<T> getList() {
		return head;
	}
	
	public void addNode(GenericNode<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}
		tail.setNextNode(aNode);
		tail = tail.getNextNode();
		tail.setNextNode(null);
		length++;
	}
}
