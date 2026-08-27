package DSA.Array;

class SubarrayProduct {
    public int maxProduct(int[] nums) {
       int n=nums.length();
       int maxProduct=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        int currentProduct=1;
        for(int j=i;j<n;j++){
currentProduct*=nums[i];
maxProduct=Math.max(maxProduct,currentProduct);
        }
       }

       return maxProduct;
    }
}