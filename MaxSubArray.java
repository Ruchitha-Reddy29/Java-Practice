
import java.util.*;
public class MaxSubArray {

    public static int max(int arr[]){
        int sum;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum =0;
                for(int k=i;k<=j;k++){
                  sum = sum+arr[k];
                }
                // System.out.println(sum);
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
         int nums[] = {2,4,6,8,10};
         System.out.println("Max sum is:"+max(nums));
    }
}
