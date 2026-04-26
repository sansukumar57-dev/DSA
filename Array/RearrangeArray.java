package DSA.Array;

import java.util.ArrayList;
import java.util.List;

class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
         List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] <0){
                negative.add(nums[i]);
            }
            else{
                positive.add(nums[i]);
            }
        }
        int count =0;
        for(int i =0;i<nums.length-1;i++){
            nums[i]=positive.get(count);
            i++;
            nums[i]=negative.get(count);
            count++;
        }
        return nums;
    }
}