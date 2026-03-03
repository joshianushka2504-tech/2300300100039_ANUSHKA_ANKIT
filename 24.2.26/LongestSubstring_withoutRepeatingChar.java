import java.util.Scanner;
import java.util.HashSet;

public class LongestSubstring_withoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(right));
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        LongestSubstring_withoutRepeatingChar obj = new LongestSubstring_withoutRepeatingChar();
        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring without repeating characters: " + result);

        sc.close();
    }
}
