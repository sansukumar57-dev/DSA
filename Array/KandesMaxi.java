package DSA.Array;

class KandesMaxi {
    int maxSubarraySum(int[] arr) {
        // Code here
        int  m=arr[0];
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>m){
                    m=sum;
                }
            }
        }
        return m;
    }
}
