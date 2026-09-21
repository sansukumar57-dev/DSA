package DSA.Array;

class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        int k = 0;
        int count = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == prev) {
                count++;
            } else {
                prev = num;
                count = 1;
            }

            if (count <= 2) {
                nums[k++] = num;
            }
        }

        return k;
}}