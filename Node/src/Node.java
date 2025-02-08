public class Node {
    private Node nextNode; 
    String data;
	public Node next;      

    
    public Node(String data) {
        this.data = data;
        this.nextNode = null; 
    }

   public String getData()  {
        return data;
   }
    public void setData(String data) {
        this.data = data;
    }

    
    public Node getNextNode() {
        return nextNode;
    }

    

    public void setNextNode(Node nextNode) {
    	this.nextNode = nextNode;
    }
}
