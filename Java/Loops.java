package Java;

import java.util.*;

public class Loops {

    public static void main(String[] args) {/
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int sum = 0;
            int a =  sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            sum = a + b;
            System.out.print(sum);
            for(int j=1; j<n; j++){
                sum += (Math.pow(2,j) * b);
                System.out.print(" " + sum);
            }
            System.out.println();
        }
        sc.close();
    }
}

/* Hackerrank Java Loops II Question
 * Question Link -> https://www.hackerrank.com/challenges/java-loops/problem
 */