public class Main {
    public static void main(String[] args) {
        // Using the simple LinkedList
        LinkedList myList = new LinkedList();

        Node aNode = new Node();
        aNode.setData("Element 1");
        myList.addNode(aNode);

        aNode = new Node();
        aNode.setData("Element 2");
        myList.addNode(aNode);

        Node tempNode = myList.getList();
      
       
        if (tempNode != null) {
            do {
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNextNode();
            } while (tempNode != null);
        } else {
            System.out.println("The list is empty.");
        }
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		GenericLinkedList<String> stringList = new GenericLinkedList<>();
		
		// Add Integer elements 0 to 4
		for (int i = 0; i < 5; i++) {
			GenericNode<Integer> intNode = new GenericNode<>();
			intNode.setData(i);
			integerList.addNode(intNode);
		}
		
		// Iterate and print Integer list elements
		System.out.println("Generic List Contents:");
		GenericNode<Integer> current = integerList.getList();
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNextNode();
		}
	}
}