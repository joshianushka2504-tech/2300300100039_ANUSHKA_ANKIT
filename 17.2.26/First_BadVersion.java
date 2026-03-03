import java.util.Scanner;

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

public class First_BadVersion {
    static int firstBad;
    boolean isBadVersion(int version) {
        return version >= firstBad;
    }
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int ans = 0;
        while (low<=high){
            int mid = low+ (high-low)/2 ;
            if(isBadVersion(mid)){
                ans = mid ;
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of versions: ");
        int n = sc.nextInt();

        System.out.print("Enter first bad version: ");
        firstBad = sc.nextInt();

        First_BadVersion obj = new First_BadVersion();
        int result = obj.firstBadVersion(n);

        System.out.println("First Bad Version is: " + result);

        sc.close();
    }
}
