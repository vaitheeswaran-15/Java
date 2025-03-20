package Java;
import java.util.*;

public class Array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
       int result = a.compareTo(b);
       System.out.println(result);
       sc.close();
    }
}
