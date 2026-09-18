//import java.util.*;

public class Factorial{
    public static long calculate(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        }
        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a non-negative integer: ");
        
            long result = calculate(5);
            System.out.println("Factorial of  is: " + result);
    }
}