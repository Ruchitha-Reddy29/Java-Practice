public class searchInSortedMatrixmethod2 {
    
        public static boolean staircase2(int matrix[][], int key){
            int row = matrix.length-1,col = 0;
            while(row >= 0 && col< matrix[0].length){
                if(matrix[row][col] == key){
                    System.out.println("found key at ("+ row + ","+ col +")");
                    return true;
                }
                else if(key < matrix[row][col]){
                    row--;
                }
                else{
                    col++;
                }
    
            }
            System.out.println("key not found!");
            return false;
        }
        public static void main(String args[]){
            int arr[][] = {{10,20,30,40},
            {15,25,35,45},{27,29,37,48},{32,33,39,50}};
            System.out.println(staircase2(arr,39));
        }
    }
    

