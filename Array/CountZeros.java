package DSA.Array;// User function Template for Java

class CountZeros {
    int countZeroes(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               c=c+1; 
            }
        }
        return c;
    }
}
