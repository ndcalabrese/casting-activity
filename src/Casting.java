public class Casting {

    public static void main(String[] args) {

        problem1();
        problem2();

    }

    public static void problem1() {

        double numDouble = 112.35;
        int numInteger = (int)numDouble;

        System.out.println("\nProblem 1:");
        System.out.println("Double: " + numDouble);
        System.out.println("int: " + numInteger);

    }

    public static void problem2() {

        String numString = "49";
        int numInteger = Integer.parseInt(numString);

        System.out.println("\nProblem 2:");
        System.out.println("The string value is: " + numString);
        System.out.println("The integer value is: " + numInteger + "\n");

    }

}
