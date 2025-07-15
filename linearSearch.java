
class linearSearch{

    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
      int nums[] = {12,23,67,9,80,1,22};
      int key = 90;
      int index = search(nums,key);
      if(index==-1){
        System.out.println("not found");
      }else{
        System.out.println("key is found at index:"+index);
      }
    }
}