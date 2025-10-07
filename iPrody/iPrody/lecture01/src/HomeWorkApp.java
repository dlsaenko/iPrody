public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-1, 0);
        printColor(-1);
        compareNumbers(2, 2);
        System.out.println(isSumInRange10to20(6, 5) + "\n");
        printNumberSign(1);
        System.out.println(isNegative(0) + "\n");
        printStringMultipleTimes("Danil", 2);
        System.out.println(isLeapYear(2001));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
        System.out.println("");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The amount is positive.");
        } else {
            System.out.println("The amount is negative.");
        }
        System.out.println("");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
        System.out.println("");
    }

    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(b + " = " + a);
        }
        System.out.println("");
    }

    public static boolean isSumInRange10to20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int value) {
        if (value >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
        System.out.println("");
    }

    public static boolean isNegative(int value) {
        return value <= 0;
    }

    public static void printStringMultipleTimes(String name, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(name);
        }
        System.out.println("");
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}