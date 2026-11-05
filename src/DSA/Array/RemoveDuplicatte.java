package DSA.Array;

class RemoveDuplicatte {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        int k=0;
        for(int j:s){
            nums[k]=j;
            k++;
        }
        return k;

    }
}