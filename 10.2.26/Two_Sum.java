import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int first,second = 0;
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<n;i++){
            first = nums[i];
            second = target - first;
            if(m.containsKey(second)){
                return new int[]{m.get(second), i};
            } 
            m.put(first, i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size, target and elements:");

        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Two_Sum obj = new Two_Sum();
        int res[] = obj.twoSum(arr, target);

        if (res.length == 2)
            System.out.println(res[0] + " , " + res[1]);
        else
            System.out.println("No solution found");

        sc.close();
    }
}
