import java.util.Scanner;

public class Search_InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
                
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Search_InsertPosition obj = new Search_InsertPosition();
        int result = obj.searchInsert(arr, target);

        System.out.println("Target position (or insert position): " + result);

        sc.close();
    }
}
