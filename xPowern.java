// Example 1 . x = 2, n = 10 (even exponent)
// Call tree and computations:
// fastPow(2, 10)
// calls fastPow(2, 5)
// fastPow(2, 5)
// calls fastPow(2, 2) (because 5/2 = 2)
// fastPow(2, 2)
// calls fastPow(2, 1)
// fastPow(2, 1)
// calls fastPow(2, 0)
// fastPow(2, 0) → returns 1 (base case)
// Now we unwind:
// fastPow(2, 1):
// half = 1
// n % 2 == 1 so return half * half * x = 1 * 1 * 2 = 2
// fastPow(2, 2):
// half = 2
// n % 2 == 0 so return half * half = 2 * 2 = 4
// fastPow(2, 5):
// half = 4
// odd → 4 * 4 * 2 = 32
// fastPow(2, 10):
// half = 32
// even → 32 * 32 = 1024

public class xPowern{
    public static double myPow(double x,int n){
        long N=n;
        // to avoid stack overflow we convert double to long 
        if(N<0){
            x=1/x;
            N=-N;
        }
        return mainPow(x,N);
    }
    public static double mainPow(double x,long n)
        {
            if(n==0) return 1;
            double half=mainPow(x,n/2);
            if(n%2==0) return half*half;
            else return half*half*x;
        }
    
    public static void main(String []args){
        double result = myPow(2.00000,10);
        System.out.println(result);
    }
}

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000

// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

// QUICK OVERVIEW

// long N = n; — copy n into a long so you can safely negate Integer.MIN_VALUE without overflow.
// If N < 0 you invert the base (x = 1/x) and make N positive (N = -N). That turns x^(-n) into (1/x)^n.
// fastPow(x, N) does the real work:
// Base case: if n == 0 return 1 (because any number^0 = 1).
// Recursively compute half = fastPow(x, n/2).
// If n is even: x^n = (x^(n/2))^2 = half * half.
// If n is odd: x^n = (x^((n-1)/2))^2 * x = half * half * x.
