package Java;

import java.util.*;

public class DataType {

    public static void main(String[] args) {
        /*
         * Hackerrank DataTypes Question
         * Question Link -> https://www.hackerrank.com/challenges/java-datatypes/problem
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            try {
                long testNumber = sc.nextLong();
                boolean canFit = false;
                System.out.println(testNumber + " can be fitted in:");
                if (testNumber >= Byte.MIN_VALUE && testNumber <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                    canFit = true;
                }
                if (testNumber >= Short.MIN_VALUE && testNumber <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    canFit = true;
                }
                if (testNumber >= Integer.MIN_VALUE && testNumber <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    canFit = true;
                }
                if (testNumber >= Long.MIN_VALUE && testNumber <= Long.MAX_VALUE) {
                    System.out.println("* long");
                    canFit = true;
                }
                if (!canFit) {
                    System.out.println(testNumber + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere."); // Clear the invalid input
            }
        }
        sc.close();

    }
}