
public class binarySearch {

    public static int binary(int arr[],int key){
     int start = 0;
     int end = arr.length-1;

     while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            end = mid-1;
        }else{
            start = mid+1;
        }
     } 
     return -1;
    }
    public static void main(String args[]){
     int arr[] = {12,1,33,78,90};
     int key = 33;
     int index = binary(arr,key);
     System.out.println(index);
    }
}
