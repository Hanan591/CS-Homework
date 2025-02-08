public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(Node newNode) {
        if (head == null) {
            // If the list is empty, set the head to the new node
            head = newNode;
        } else {
            // Traverse to the end of the list and add the new node
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public Node getList() {
        return head;
    }
}
