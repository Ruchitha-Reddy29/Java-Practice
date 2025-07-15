import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String args[]){
     int arr[] = {23,34,22,21,7,5,10};
     Integer arr1[] ={67,9,66,2,13};
     Arrays.sort(arr);
     Arrays.sort(arr1,Collections.reverseOrder());
     for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
     }
     System.out.println();

     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
    }
}
