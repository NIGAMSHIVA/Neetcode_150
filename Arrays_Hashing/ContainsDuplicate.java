package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        
        //code 1-Using HashSet
        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }
        // if(set.size()!=nums.length)
        //     return ture;

        // return false;


        // Code 2 Using Sorting
        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1])
        //         return true;
        // }
        // return false;

        // code 3 using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
            else
                return true;
        }

        return false;

    }
    public static void main(String[] args) {


        int nums[] = { 1,2,3,4};
        System.out.println(containsDuplicate(nums));
        
    }
}
