import java.util.Scanner;

public class Count_NumberofNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] % 2 == 0)
            {
                nums[i] = 0 ;
            }
            else
            {
                nums[i] = 1 ;
            }
        }

        int i = 0 , j = 0 , curr_Sum = 0 , Zero_Count = 0 , count = 0 ;
        int n = nums.length ;
        while(j < n)
        {
            curr_Sum += nums[j] ;
            while(i < j && (curr_Sum > k || nums[i] == 0))
            {
                if(nums[i] == 0)
                {
                    Zero_Count += 1 ;
                }
                else
                {
                    Zero_Count = 0 ;
                }
                curr_Sum -= nums[i] ;
                i++ ;
            }

            if(curr_Sum == k)
            {
                count += 1 + Zero_Count ;
            }
            j++ ;
        }

        return count  ;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k (number of odd numbers): ");
        int k = sc.nextInt();

        Count_NumberofNiceSubarrays obj = new Count_NumberofNiceSubarrays();
        int result = obj.numberOfSubarrays(nums, k);

        System.out.println("Number of nice subarrays: " + result);

        sc.close();
    }
}
