import java.util.*;
public class powerOfTwo
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.print(result);
    }
    public static boolean isPowerOfTwo(int n)
    {
        if(n==0) return false;
        else
        {
            while(n!=1)
            {
                if(n%2 != 0) return false;
                else n=n/2;

            }
            return true;
        }
    }
}