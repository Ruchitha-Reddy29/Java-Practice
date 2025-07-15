public class RotateLeft {

    public static void leftRotation(int arr[],int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
    }

    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
    int arr[] = {1,2,3,4,5};
    leftRotation(arr,6);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
