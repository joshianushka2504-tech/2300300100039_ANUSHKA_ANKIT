import java.util.Scanner;

public class MaxSum_subarrayofsizeK {
    public int maxSubarraySum(int[] arr, int k) {
        int i=0;
        int j=0;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        while(j<arr.length){
            if(j-i+1<k){
                sum+=arr[j];
                j++;
                
            }
            else{
                sum+=arr[j];
                max_sum = Math.max(sum,max_sum);
                sum -=arr[i];
                i++;
                j++;
            }
            
        }
        return max_sum;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        MaxSum_subarrayofsizeK obj = new MaxSum_subarrayofsizeK();
        int result = obj.maxSubarraySum(arr, k);

        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);

        sc.close();
    }
}
