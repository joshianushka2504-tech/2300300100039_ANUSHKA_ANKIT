import java.util.HashMap;
import java.util.Scanner;

public class Subarray_sumequalsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1); 
        
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;

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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Subarray_sumequalsK obj = new Subarray_sumequalsK();
        int result = obj.subarraySum(arr, k);

        System.out.println("Number of subarrays with sum " + k + " is: " + result);

        sc.close();
    }
}
