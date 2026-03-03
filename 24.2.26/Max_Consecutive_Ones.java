import java.util.Scanner;

public class Max_Consecutive_Ones {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0 , j = 0, sum = 0, zero = 0, ans = 0;
        for(int a =0; a<n;a++){
            if(nums[a]==0){
                zero++;
            }           
        }
        if(zero<k){
            return n;
        }
        while(j<n){
            sum += nums[j];
            if(j-i+1-sum>k){
                sum -=nums[i];
                i++;
            }
            else if(j-i+1-sum==k){
                ans = Math.max(j-i+1,ans);
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Max_Consecutive_Ones obj = new Max_Consecutive_Ones();
        int result = obj.longestOnes(nums, k);

        System.out.println("Maximum consecutive ones after flipping k zeros: " + result);

        sc.close();
    }
}
