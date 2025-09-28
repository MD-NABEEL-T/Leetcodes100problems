// used fibonacci series concept here
import java.util.*;
public class climbStairs{
    public static void main(String []args)
    {
        System.out.println("Enter number of steps");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        // n + 1 because 0 is considered right 
        arr[0]=1;
        arr[1]=1;
        for (int i =2;i<n+1;i++)
        {
            arr[i]= arr[i-2]+arr[i-1];
        }
        System.out.println(arr[n]);
    }
}
// n +1 because we want it to travel upto n 


/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps*/