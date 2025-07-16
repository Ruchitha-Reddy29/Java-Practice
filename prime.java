import java.util.*;
public class prime {
    public static boolean isprime(int val){
        if(val<3){
           return true;
        }
        if(val%2==0){
            return false;
        }
        for(int i=3;i*i<=val;i+=2){
           if(val%i==0){
            return false;
           }
        }
        return true;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean check =isprime(n);
      System.out.println(check);
    }
}
