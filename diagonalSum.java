public class diagonalSum {
    public static int diagonal(int matrix[][]){
        int n = matrix.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += matrix[i][i];
            sum += matrix[i][n-i-1];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}
        };
        int diagonal = diagonal(matrix);
        System.out.println(diagonal);
    }
}
