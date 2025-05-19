package Arrays_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

        // cretaing a Map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        } 
        // creating an array holding Lists

        List<Integer> bucket[] = new ArrayList[nums.length + 1];  

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }  \

        for (int key : map.keySet()) {

            int freq = map.get(key);

            bucket[freq].add(key);
        }  

        // extraction of the top k elements

        int kArray[] = new int[k];
        int z = 0;

        for (int i = bucket.length-1; i >= 0; i--) {  

            int size = bucket[i].size();

            if (k <= 0)
                break;

            if (size > 0) {

                for (int j = 0; j < size; j++) {
                    kArray[z] = bucket[i].get(j);
                    z++;
                    k--;
                }

            }
        }


        return kArray;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 2, 2, 2, 3 };
        int k = 2;

        int ans[] = (topKFrequent(arr, k));

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
