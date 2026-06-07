package DSA.Array;

import java.util.Arrays;
import java.util.Set;

class IntersectionOfTwoArrrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums2) {
            if (map.containsKey(num)) {
                set.add(num);
            }
        }

        int[] res = new int[set.size()];
        int index = 0;

        for (int num : set) {
            res[index++] = num;
        }

        return res;
    }
}