package DSA.Array;
import java.util.HashMap;
public class LongestSubArray {

     static    int longestSubarray(int[] arr, int k) {
            HashMap<Long, Integer> map = new HashMap<>();
            long sum = 0;
            int maxLen = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if (sum == k) {
                    maxLen = i + 1;
                }

                if (map.containsKey(sum - k)) {
                    maxLen = Math.max(maxLen, i - map.get(sum - k));
                }

                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }

            return maxLen;
        }
    public static void main(String[] args) {
        int[] ar={1, 8, 7, 56, 90};
        System.out.println(LongestSubArray.longestSubarray(ar,56));
    }
}
