import java.util.Scanner;

public class Move_zeroes {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]!=0){
                nums[nonzero++] = nums[i];
            }
            
        }
        while(nonzero <n){
            nums[nonzero++] = 0;
        }
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Move_zeroes obj = new Move_zeroes();
        obj.moveZeroes(arr);

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
