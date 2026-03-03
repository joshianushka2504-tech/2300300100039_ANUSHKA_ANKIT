import java.util.Scanner;

public class KthSmallestElement_SortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
       int n = matrix.length;
       int m = matrix[0].length;

       int low = matrix[0][0];
       int high = matrix[n-1][m-1];

       while(low<high){
        int mid = low +(high-low)/2;

        int count = countlessequal(matrix,mid);

        if(count<k){
            low = mid+1;
        }
        else{
            high = mid;
        }
       }
       return low;
    }

    private int countlessequal(int [][]matrix , int mid){
        int n = matrix.length;
        int count = 0;
        int row = n-1;
        int col = 0;

        while(row>=0 && col<n){
            if(matrix[row][col]<=mid){
                count += row + 1;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (n for n x n matrix): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements (sorted row & column wise):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        KthSmallestElement_SortedMatrix obj = new KthSmallestElement_SortedMatrix();
        int result = obj.kthSmallest(matrix, k);

        System.out.println(k + "th smallest element is: " + result);

        sc.close();
    }
}
