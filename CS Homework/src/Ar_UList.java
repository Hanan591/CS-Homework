public class Ar_UList {
    private int[] data;
    private int size;

   
    public Ar_UList() {
        data = new int[10]; 
        size = 0;
    }

    
    public void add(int value) {
        if (size == data.length) {
            resize(); 
        }
        data[size++] = value;
    }

   
    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    
    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

   
    public int getRange() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int min = data[0];
        int max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max - min;
    }

   
    public Ar_UList duplicateInRange(int lbound, int ubound) {
        Ar_UList newList = new Ar_UList();
        for (int i = 0; i < size; i++) {
            if (data[i] >= lbound && data[i] <= ubound) {
                newList.add(data[i]);
            }
        }
        return newList;
    }

    
    public static void main(String[] args) {
        Ar_UList list = new Ar_UList();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(30);

        System.out.println("Original List: 10, 5, 20, 15, 30");

        
        System.out.println("Max Value: " + list.getMax());

       
        System.out.println("Range: " + list.getRange());

       
        Ar_UList newList = list.duplicateInRange(10, 20);
        System.out.print("Elements in Range 10, 20: ");
        for (int i = 0; i < newList.size; i++) {
            System.out.print(newList.data[i] + " ");
        }
    }
}
