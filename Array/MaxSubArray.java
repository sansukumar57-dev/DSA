package DSA.Array;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        
        int msum = nums[0];
         int sum = nums[0];
         for(int i=1;i<nums.length;i++)
         {
             if(sum + nums[i]>= nums[i])
             {
                 sum += nums[i];
             }
             else
             {
                 sum = nums[i];
             }
             if(sum>msum)
             {
                 msum=sum;
             }
         }
         System.out.println(msum);
         
        
         return msum;
    }
}