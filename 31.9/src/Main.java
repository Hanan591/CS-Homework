public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 3);

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2)) {
            System.out.println("r1 and r2 are equal.");
        } else {
            System.out.println("r1 and r2 are NOT equal.");
        }

        Rational r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        Rational r4 = r1.add(r2);
        Rational r5 = r1.subtract(r2);
        Rational r6 = r1.multiply(r2);
        Rational r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);

        System.out.println("Comparing r1 and r2:");
        if (r1.compareTo(r2) > 0) {
            System.out.println(r1 + " is greater than " + r2);
        } else if (r1.compareTo(r2) < 0) {
            System.out.println(r1 + " is less than " + r2);
        } else {
            System.out.println(r1 + " is equal to " + r2);
        }
    }
}
