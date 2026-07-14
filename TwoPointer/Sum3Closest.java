package DSA.TwoPointer;

class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);


        int clost=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;


            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if (Math.abs(target - sum) < Math.abs(target - clost)) {
                    clost = sum;
                }

                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum;
                }
            }

        }
        return clost;
    }
}