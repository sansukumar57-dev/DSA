package DSA.Array;

import java.util.*;

class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> e = new HashMap<>();

        int max = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = e.getOrDefault(nums[i], 0) + 1;

            e.put(nums[i], count);

            if (count > max) {
                max = count;
                ans = nums[i];
            }
        }

        return ans;
    }
}
