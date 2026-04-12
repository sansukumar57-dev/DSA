package DSA.Array;

public class LongestSubArrayK {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    int len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
            }
        }
        return maxLen;
    }

}
