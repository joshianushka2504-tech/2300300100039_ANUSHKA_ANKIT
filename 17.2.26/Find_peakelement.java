import java.util.Scanner;

public class Find_peakelement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low<high)
        {

            mid = low+((high-low)/2);
            if(nums[mid]>nums[mid+1])
            {
                high=mid;

            }
            else{
                low = mid+1;

           }

        }
        return low;
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

        Find_peakelement obj = new Find_peakelement();
        int peakIndex = obj.findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}
