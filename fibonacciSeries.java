import java.util.*;
public class fibonacciSeries{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        
        System.out.println("The Fibonacci series is ");
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a +" ");
            int next = a+b ;
             a =b;
             b= next;
        }
        sc.close();        
    }
}
