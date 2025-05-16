package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        // HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        // map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // for (int i = 0; i < t.length(); i++) {
        // map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // return map1.equals(map2);

        // Approach 2

        // char char1[] = s.toCharArray();
        // char char2[] = t.toCharArray();

        // Arrays.sort(char1);
        // Arrays.sort(char2);

        // return Arrays.equals(char1, char2);


        // Approach 3

        int nums[] = new int[26];

        for (int i = 0; i < s.length(); i++) {

            nums[s.charAt(i) - 'a']++;
            nums[t.charAt(i) - 'a']--;

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                return false;
        }

        return true;


    }

    public static void main(String[] args) {

        String s = "care";
        String t = "race";

        System.out.println(isAnagram(s, t));

    }

}
