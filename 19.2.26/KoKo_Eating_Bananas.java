import java.util.Scanner;

public class KoKo_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1, high = 0;

        for(int pile : piles){
            high = Math.max(high, pile);
        }

        while(low<high){
            int mid = low +(high-low)/2;

            if(timetaken(piles,mid)<=h){
                high = mid;
            }
            else{
                low = mid +1;
            } 
        }
        return low;
    }
    public int timetaken(int[] piles, int mid){
        int n = piles.length;
        int totaltime = 0;
        for(int i=0;i<n;i++){
            totaltime += ((piles[i]+mid-1)/mid);
        }
        return totaltime;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];

        System.out.println("Enter bananas in each pile:");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter total hours (h): ");
        int h = sc.nextInt();

        KoKo_Eating_Bananas obj = new KoKo_Eating_Bananas();
        int result = obj.minEatingSpeed(piles, h);

        System.out.println("Minimum eating speed required: " + result);

        sc.close();
    }
}
