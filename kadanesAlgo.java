
import java.util.*;
public class kadanesAlgo {

    public static void kadanes(int arr[]){
         int sum =0;
         int count =0;
         int maxSum = Integer.MIN_VALUE;
         int maxn = arr[0];
         boolean negative = false;
         for(int i=0;i<arr.length;i++){
            sum = sum +arr[i];
            if(sum<0){
                sum =0;
            }if(arr[i]<0){
                negative = true;
                count++;
            }else{
                negative = false;
            }
            maxn = Math.max(maxn,arr[i]);
            maxSum = Math.max(sum,maxSum);
         }
        
         if(count == arr.length){
            System.out.println(maxn);
         }else{
            System.out.println(maxSum);
         }
    }
    public static void main(String args[]){
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanes(arr);
    }
}
