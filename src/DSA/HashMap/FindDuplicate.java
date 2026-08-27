package DSA.HashMap;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> d=new HashSet<>();
        for(int i=0;i<nums.length;i++){

            if(d.contains(nums[i])){
                return nums[i];
            }

            d.add(nums[i]);
        }
        return 0;
        
    }
}