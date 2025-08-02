public class Palindrome {
    public static void palindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
         if(str.charAt(i) != str.charAt(n-i-1)){
            System.out.println("not a palindrome!");
            return;
         }
        }
        System.out.println("palindrome");
    }
    public static void main(String args[]){
       String str = "racecars";
       palindrome(str);
    }
}
