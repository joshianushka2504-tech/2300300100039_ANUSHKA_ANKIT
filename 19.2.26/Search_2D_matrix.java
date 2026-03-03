import java.util.Scanner;

public class Search_2D_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low = mid+1;
            }
            else if(matrix[row][col]>target){
                high = mid-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements row-wise (sorted matrix):");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Search_2D_matrix obj = new Search_2D_matrix();
        boolean result = obj.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Target found in matrix.");
        } else {
            System.out.println("Target not found in matrix.");
        }

        sc.close();
    }
}
