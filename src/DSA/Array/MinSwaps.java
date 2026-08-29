package DSA.Array;

class MinSwaps {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int k = 0;
        for (int x : nums) {
            k += x;
        }

        if (k <= 1 || k == n) {
            return 0;
        }
        int[] prefix = new int[2 * n + 1];

        for (int i = 0; i < 2 * n; i++) {
            prefix[i + 1] = prefix[i] + nums[i % n];
        }

        int maxOnes = 0;

        for (int start = 0; start < n; start++) {
            int end = start + k;

            int ones = prefix[end] - prefix[start];

            maxOnes = Math.max(maxOnes, ones);
        }

        return k - maxOnes;
    }
}