public class Application {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

       
        myList.add("First");
        myList.add("Second");
        myList.add("Third");
        myList.add("Fourth");
        myList.add("Fifth");

        
        System.out.println("List before adding new node:");
        myList.printList();

        
        myList.addAfterSecond("NewNode");

        
        System.out.println("List after adding new node:");
        myList.printList();
    }
}

