
import java.util.*;
public class MaxElement {

    static int getGreatest(int arr[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest =arr[i];
        }
      }
      return largest;
    }
    public static void main(String args[]){
     int nums[] = {23,34,78,10,90,2,3,4};
     System.out.println(getGreatest(nums));
    }
}
