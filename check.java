public class check {
    public static void main(String args[]){
        int x = -123;
        int rev =0;
        while(x!=0){
           int rem = x%10;
           x = x/10;
           rev = rev*10+rem;
        }
        System.out.println(rev);
    }
}
