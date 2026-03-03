import java.util.Scanner;
// LeetCode problem: 268. Missing Number

public class Missing_number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = (n*(n+1))/2;
        int actual_sum = 0;
        for(int i=0;i<n;i++){
            actual_sum += nums[i];
        }
        return expected_sum-actual_sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (numbers from 0 to n with one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Missing_number obj = new Missing_number();
        int result = obj.missingNumber(arr);

        System.out.println("Missing number is: " + result);

        sc.close();
    }
}
