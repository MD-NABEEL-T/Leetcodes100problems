public class powerOfFour{
    public static boolean printFour(int n){
        if(n<=0) return false;
        while(n!=1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }
    public static void main(String []args){
        int n=16;
        boolean result=printFour(n);
        System.out.println(result);
    }
}