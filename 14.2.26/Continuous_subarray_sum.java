import java.util.HashMap;
import java.util.Scanner;

public class Continuous_subarray_sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum%k)){
                int index = map.get(sum%k);
                if(i-index>=2){
                    return true;
                }
            }
            else{
                map.put(sum%k,i);
            }
        }
        return false;
        
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

        Continuous_subarray_sum obj = new Continuous_subarray_sum();
        boolean result = obj.checkSubarraySum(arr, k);

        if (result) {
            System.out.println("Subarray with sum multiple of k exists.");
        } else {
            System.out.println("No such subarray exists.");
        }
        sc.close();
    }
}
