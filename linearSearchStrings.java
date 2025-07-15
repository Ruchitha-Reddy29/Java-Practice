
public class linearSearchStrings {

    public static int search(String arr[],String key){
       for(int i=0;i<arr.length;i++){
        if(arr[i].equals(key)){
            return i;
        }
       }
       return -1;
    }
    public static void main(String args[]){
     String items[] = {"samosa","chats","fruit juice","salad"};
     String key="chats";
     int index=search(items,key);
     if(index == -1){
        System.out.println("not found");
     }else{
        System.out.println("element found at :"+index);
     }

    }
}
