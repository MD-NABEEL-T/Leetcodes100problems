import java.util.*;
public class factorialTrailingZeroes
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<5) System.out.println(0);
        else 
        {
            int sum =0;
            while(n>=5)
            {
                n = n/5;
                sum += n;
            }
            System.out.println(sum);
        }
    }

}
    
