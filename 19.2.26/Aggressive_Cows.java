import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
     public int aggressiveCows(int[] stalls, int k) {
        
        Arrays.sort(stalls);
        int n = stalls.length;
        int ans =-1;
        int low = 1, high = stalls[n-1]-stalls[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(ispossible(stalls, mid, k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean ispossible(int[] stalls, int mid, int k){
        
        int cows = 1, laststallpass = stalls[0];
        for(int i=1 ;i<stalls.length;i++){
            if((stalls[i]-laststallpass)>=mid){
                cows++;
                laststallpass = stalls[i];
            }
            if(cows==k){
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();

        int[] stalls = new int[n];

        System.out.println("Enter stall positions:");
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        System.out.print("Enter number of cows: ");
        int k = sc.nextInt();

        Aggressive_Cows obj = new Aggressive_Cows();
        int result = obj.aggressiveCows(stalls, k);

        System.out.println("Largest minimum distance: " + result);

        sc.close();
    }
}
