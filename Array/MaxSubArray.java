package DSA.Array;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int mSum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            mSum=Math.max(mSum,sum);
        }
        return mSum;
    }
}