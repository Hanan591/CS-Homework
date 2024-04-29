public class Test {
    private int num;
    private String name;

    public Test(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("Number: " + num + ", Name: " + name);
    }
}
