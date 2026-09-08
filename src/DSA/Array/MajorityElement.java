package DSA.Array;

class MajorityElement {
    public int majorityElement(int[] nums) {
        int cad=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                cad=nums[i];
            }
            if(nums[i]==cad){
                c++;
            }else{
                c--;
            }
        }
        return cad;
    }
}