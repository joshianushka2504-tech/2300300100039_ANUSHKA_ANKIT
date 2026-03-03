import java.util.Arrays;
import java.util.Scanner;

public class Longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i-1]) {
                continue;  
            }

            if(nums[i] == nums[i-1] + 1) {
                current++;
            } else {
                current = 1;
            }

            longest = Math.max(longest, current);
        }

        return longest;
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

        Longest_consecutive_sequence obj = new Longest_consecutive_sequence();
        int result = obj.longestConsecutive(arr);

        System.out.println("Longest Consecutive Sequence Length: " + result);

        sc.close();
    }
}
