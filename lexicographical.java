import java.util.*;
public class lexicographical {
    public static void perm(int arr[]){
        int n = arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>= arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(arr[i]>=arr[j]){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        reverse(arr,i+1);
        // Arrays.sort(arr,i+1,n);
    }

    public static void reverse(int arr[],int start){
        
        int end = arr.length-1;
       
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
    
        }
       
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,7,5,0};
        perm(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
