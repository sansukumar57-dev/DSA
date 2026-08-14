package DSA.Array;

class ZeroSubArray {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long zerocount=0;
        for(int i:nums){
            if(i==0){
                zerocount++;
                ans+=zerocount;
            }else{
                zerocount=0;
            }
        }
        return ans;
    }
}