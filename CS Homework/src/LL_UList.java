public class LL_UList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public LL_UList() {
        head = null;
        size = 0;
    }

  
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

   
    public int getMax() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    
    public int getRange() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int min = head.data;
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max - min;
    }

    
    public LL_UList duplicateInRange(int lbound, int ubound) {
        LL_UList newList = new LL_UList();
        Node current = head;
        while (current != null) {
            if (current.data >= lbound && current.data <= ubound) {
                newList.add(current.data);
            }
            current = current.next;
        }
        return newList;
    }

    
    public static void main(String[] args) {
        LL_UList list = new LL_UList();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(30);

        System.out.println("Original List: [10, 5, 20, 15, 30]");

        
        System.out.println("Max Value: " + list.getMax());

        
        System.out.println("Range: " + list.getRange());

        
        LL_UList newList = list.duplicateInRange(10, 20);
        System.out.print("Elements in Range [10, 20]: ");
        Node current = newList.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
