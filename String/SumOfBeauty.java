package DSA.String;

import java.util.*;
class SumOfBeauty {
    public int beautySum(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hp = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                hp.put(c, hp.getOrDefault(c, 0) + 1);
                int[] arr = new int[hp.size()];
                int idx = 0;
                for (int val : hp.values()) {
                    arr[idx++] = val;
                }
                Arrays.sort(arr);
int min = arr[0];
                int max = arr[arr.length - 1];
                result =result+(max-min);
            }
        }

        return result;
    }
}