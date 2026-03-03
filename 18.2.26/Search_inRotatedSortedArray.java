import java.util.Scanner;

public class Search_inRotatedSortedArray {
     public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
    
            int mid = low +(high -low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<= target && target <=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target <=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of rotated sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Search_inRotatedSortedArray obj = new Search_inRotatedSortedArray();
        int result = obj.search(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
