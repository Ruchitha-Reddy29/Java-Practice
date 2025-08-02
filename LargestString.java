public class LargestString {

    public static String largest(String arr[]){
        int n = arr.length;
        String largest = arr[0];
        for(int i=1;i<n;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
               largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
       String arr[] = {"Apple","Mango","Banana"};
       System.out.println(largest(arr));
    }
}
