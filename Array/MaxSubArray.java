package DSA.Array;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int Msum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            Msum=Math.max(Msum,sum);
        }
        return Msum;
    }
}