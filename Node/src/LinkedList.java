public class LinkedList {
private Node Front;
private Node last;
private Node current;

public void add(String data) {
    Node newNode = new Node(data);
    if (Front == null) {
        Front = newNode;
    } else {
        Node current = Front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

public void addAfterSecond(String data) {
    if (Front == null ) {
        System.out.println("List has fewer than two elements.");
        return;
    }
    Node newNode = new Node(data);
    newNode.next = Front.next.next;
    Front.next.next = newNode;
}

public void printList() {
    Node current = Front;
    while (current != null) {
        System.out.print(current.data + "  ");
        current = current.next;
    }
    System.out.println("");
}
}