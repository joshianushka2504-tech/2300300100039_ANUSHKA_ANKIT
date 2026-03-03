import java.util.Scanner;

public class Binary_SubarraywithSum {
    public int numSubarraysWithSum(int[] nums, int goal){
        int n = nums.length ; 
        int count = 0 ;
        int i = 0 , j = 0 , curr_Sum = 0 , Zero_Count = 0 ;
        while(j < n)
        {
            curr_Sum = curr_Sum + nums[j] ;
            while(i < j && (curr_Sum > goal || nums[i] == 0))
            {
                if(nums[i] == 1)
                {
                    Zero_Count = 0  ;
                }
                else
                {
                    Zero_Count++ ;
                }
                curr_Sum -= nums[i] ;
                i++ ;
            }

            if(curr_Sum == goal)
            {
                count = count + 1 + Zero_Count ;
            }
            j++ ;
        }
        return count ;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (0 or 1 only):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter goal sum: ");
        int goal = sc.nextInt();

        Binary_SubarraywithSum obj = new Binary_SubarraywithSum();
        int result = obj.numSubarraysWithSum(nums, goal);

        System.out.println("Number of subarrays with sum " + goal + " is: " + result);

        sc.close();
    }
}
