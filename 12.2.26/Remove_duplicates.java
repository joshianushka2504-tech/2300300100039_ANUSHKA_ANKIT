import java.util.Scanner;
// LeetCode problem: 26. Remove Duplicates from Sorted Array

public class Remove_duplicates {
    public int removeDuplicates(int[] nums) {
        int n =  nums.length;
        int i = 0;
        int j = 0;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
        
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        Remove_duplicates obj = new Remove_duplicates();
        int newLength = obj.removeDuplicates(arr);

        System.out.println("New length after removing duplicates: " + newLength);

        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
