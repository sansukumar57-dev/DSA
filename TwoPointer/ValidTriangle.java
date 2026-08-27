package DSA.TwoPointer;

class ValidTriangle {
    public int triangleNumber(int[] nums) {
      Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0; i <= n-3; i++){
            for(int j=i+1; j <= n-2; j++){
                for(int k=j+1; k <= n-1; k++){

                    if(nums[i]+nums[j] > nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}