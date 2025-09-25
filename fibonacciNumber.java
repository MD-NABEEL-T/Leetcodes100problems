import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n);
            return;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b; 
            a = b;      
            b = c;      
        }
        System.out.println(b);  
    }
}


// Loop steps:
// i=2 → c=1, a=1, b=1
// i=3 → c=2, a=1, b=2
// i=4 → c=3, a=2, b=3