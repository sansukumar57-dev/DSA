package DSA.Array;
import java.util.HashMap;
public class LongestSubArray {

    // User function Template for Java


      static int longestSubarray(int[] arr, int k) {
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






    public static void main(String[] args) {
        int[] ar={1, 8, 7, 56, 90};
        System.out.println(LongestSubArray.longestSubarray(ar,56));
    }
}
