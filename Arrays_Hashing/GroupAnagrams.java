package Arrays_Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<String> l1 = new ArrayList<>();

        List<List<String>> L1 = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char ch[] = strs[i].toCharArray();

            Arrays.sort(ch); 

            String sorted = new String(ch);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>()); 
            }
            map.get(sorted).add(strs[i]);
        }
        
        L1.addAll(map.values());

        return L1;


    }
    public static void main(String[] args) {

        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> l1 = groupAnagrams(strs);

        System.out.println(l1);

    }

}
