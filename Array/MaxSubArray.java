package DSA.Array;

class MaxSubArray {
    int maxSubArray(int[] arr) {
        // Code here
        int c=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            if(c>msum){
                msum=c;
            }
            if(c<0){
                c=0;
            }
            
           
           
        }
       return msum;
    }
}
