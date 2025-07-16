import java.util.*;
public class bubbleSortEfficient {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
       
        for(int i=0;i<n-1;i++){
            boolean sort = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sort = false;
                }
               
                }
                if(sort){
                    return;

            }
        }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }
      bubbleSort(arr);
      System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    }
}
