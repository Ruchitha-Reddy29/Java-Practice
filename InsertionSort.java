public class InsertionSort {

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(curr<arr[prev]&&prev>=0){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {2,7,5,9,3,2};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
