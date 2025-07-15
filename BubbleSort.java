public class BubbleSort {

    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
      int arr[] = {2,7,5,9,3,2};
      bubble(arr);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
