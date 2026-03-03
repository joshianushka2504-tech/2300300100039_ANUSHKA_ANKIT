import java.util.Scanner;

public class Maximum_Subarray {
     public int maxSubArray(int[] nums) {
        int n = nums.length;
        int st;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(st =0;st<n;st++){
            sum = sum + nums[st];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
        
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

        Maximum_Subarray obj = new Maximum_Subarray();
        int result = obj.maxSubArray(arr);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}
