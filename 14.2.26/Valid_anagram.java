import java.util.Scanner;

public class Valid_anagram {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        else{

            int count[] = new int[26];                
            for(int i=0;i<n;i++){
                count[s.charAt(i)-'a']++;

            }
            for(int i=0;i<n;i++){
                count[t.charAt(i)-'a']--;

            }
            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }

            }

       }
        return true;
    
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        Valid_anagram obj = new Valid_anagram();
        boolean result = obj.isAnagram(s, t);

        if (result) {
            System.out.println("The strings are Anagrams.");
        } else {
            System.out.println("The strings are NOT Anagrams.");
        }

        sc.close();
    }
}
