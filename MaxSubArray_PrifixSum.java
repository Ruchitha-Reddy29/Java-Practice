
import java.util.*;
public class MaxSubArray_PrifixSum {

    public static void max(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum =0;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
              sum = i == 0?prefix[j] : prefix[j]-prefix[i-1];
              if(sum>max){
                max = sum;
              }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        max(nums);
    }
}
