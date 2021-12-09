package L1;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        String str1 = "NINIT"; //palindrome
        boolean isPalindrome = isPalindrome(str1);
        System.out.println(str1 + " --> isPalindrome: " + isPalindrome);

        String str2 = "NINNIT"; //not a palindrome
        System.out.println(str2 + " --> isPalindrome: " + isPalindrome(str2));

        System.out.println("bab" + " --> isPalindrome: " + isPalindrome("bab"));
        System.out.println("a" + " --> isPalindrome: " + isPalindrome("a"));
        System.out.println("aa" + " --> isPalindrome: " + isPalindrome("aa"));
        System.out.println("aaa" + " --> isPalindrome: " + isPalindrome("aaa"));
        System.out.println("ab" + " --> isPalindrome: " + isPalindrome("ab"));
        System.out.println("aab" + " --> isPalindrome: " + isPalindrome("aab"));
    }

    private static boolean isPalindrome(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for(int i = 0; i != str.length(); ++i){
            if(charFrequencyMap.containsKey(str.charAt(i))){
                charFrequencyMap.put(str.charAt(i), charFrequencyMap.get(str.charAt(i)) + 1);
            }else{
                charFrequencyMap.put(str.charAt(i), 1);
            }
        }

        int countOfOddFrequencies = 0;
        for(int frequency: charFrequencyMap.values()){
            if(frequency%2 != 0){
                countOfOddFrequencies += 1;
            }
        }

        if(countOfOddFrequencies > 1){
            return false;
        }
        return true;
    }
}
