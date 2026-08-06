package DSA.Array;

class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int pos=0,neg=1;;

        for(int num:nums){
            if(num>0){
                arr[pos]=num;
                pos+=2;
            }
            else{
                arr[neg]=num;
                neg+=2;
            }
        }
        return arr;
    }
}