package Java;

import java.util.*;

public class Convert {

    public static void main(String[] args) {
        /* 
         * Hackerrank int to String
         * Question Link -> https://www.hackerrank.com/challenges/java-int-to-string/problem
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(n == Integer.parseInt(s) && n>= -100 && n<=100){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}