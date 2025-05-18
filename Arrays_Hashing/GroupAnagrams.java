package Arrays_Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Approach 1 

        // List<String> l1 = new ArrayList<>();

        // List<List<String>> L1 = new ArrayList<>();

        // HashMap<String, List<String>> map = new HashMap<>();

        // for (int i = 0; i < strs.length; i++) {

        //     char ch[] = strs[i].toCharArray();

        //     Arrays.sort(ch); 

        //     String sorted = new String(ch);

        //     if (!map.containsKey(sorted)) {
        //         map.put(sorted, new ArrayList<>()); 
        //     }
        //     map.get(sorted).add(strs[i]);
        // }
        
        // L1.addAll(map.values());

        // return L1;

        // Approach 2
         HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> L1 = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            int num[] = new int[26];

            char ch[] = strs[i].toCharArray();
            // Not sorting instead I will generate a key

            for (int j = 0; j < ch.length; j++) {
                num[ch[j] - 'a']++;
            }
            // Now this num is an array I want something String type
            // [1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1]
            StringBuilder sb = new StringBuilder();

            for (int z = 0; z < num.length; z++) {
                sb.append("#"); // when b are 10 and d is 1 so these b -> 10 will give 1 0 type thing.
                sb.append(num[z]);
            }
            // unique key is generated and stored in sb

            String dummy = sb.toString();

            if (!map.containsKey(dummy)) {

                map.put(dummy, new ArrayList<>());
            }

            map.get(dummy).add(strs[i]);
        }
        
        System.out.println(map);

        L1.addAll(map.values());
        
        return L1;


    }
    public static void main(String[] args) {

        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> l1 = groupAnagrams(strs);

        System.out.println(l1);

    }

}
