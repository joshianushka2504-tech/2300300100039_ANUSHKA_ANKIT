import java.util.Scanner;

public class Containing_water {
    public int maxArea(int[] height) {
        int j = height.length;
        int ans = Integer.MIN_VALUE;
        int i=0;
        int n = j-1;
        while( i<n ){
            int width = n-i;
            int area = Math.min(height[i],height[n])*width;
            ans = Math.max(ans,area);
            if(height[i]>height[n])
            {
                n--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter heights:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Containing_water obj = new Containing_water();
        int result = obj.maxArea(arr);

        System.out.println("Maximum Area: " + result);

        sc.close();
    }
}
