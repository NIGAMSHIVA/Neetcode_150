package Arrays_Hashing;
import java.util.HashMap;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        // By HashMap When I Check it is O(1) time operation.
        // Time O(n)
        // Space O(n)-worst case

        int ans[] = new int[2]; 

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 6 };

        int Ans[] = twoSum(arr, 9);

        for (int i = 0; i < Ans.length; i++) {
            System.out.println(Ans[i]);
        }

    }

}
