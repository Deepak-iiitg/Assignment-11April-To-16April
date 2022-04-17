public class ReverseNumberUsingRec {

    static int reverse(int n,int rev){
        if(n<=0){
            return rev;
        }
        int rem = n%10;
        rev = rev*10+rem;
        n = n/10;
        return reverse(n,rev);
    }

    public static void main(String args[]){
        int n =12356,rev = 0;
        rev = reverse(n,rev);
        System.out.println(rev);
    }
    
}
