package DSA.Array;

class SortedArray {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
       HashSet<Integer> hs= new HashSet<>();
       for(int i=0;i<n;i++){
        hs.add(nums[i]);
        if(hs.contains(target)){
            return true;
        }
       }
        return false;
    }
}