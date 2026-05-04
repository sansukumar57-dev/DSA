package DSA.Array;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
       int result = 0;
        int n = nums.length;
        int sum = 0;
        int i = 0;
        int j = i;
        while(i < n)
        {
            sum += nums[j];
            if(sum == k)
            {
                result++;
                j++;
            }
            else{
                j++;
            }
            if(j == n)
            {
                i++;
                j = i;
                sum = 0;
            }
        }
        return result;
    }
}