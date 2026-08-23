package DSA.Prefix;

import java.util.*;
 
class FindMaxLength{ 
    public int findMaxLength(int[] nums) { 
        HashMap<Integer, Integer> map = new HashMap<>(); 
 
        int balance = 0; 
        int maxLength = 0; 
 
        map.put(0, -1); 
 
        for (int i = 0; i < nums.length; i++) { 
 
            if (nums[i] == 0) { 
                balance--; 
            } else { 
                balance++; 
            } 
 
            if (map.containsKey(balance)) { 
                int length = i - map.get(balance); 
                maxLength = Math.max(maxLength, length); 
            } else { 
                map.put(balance, i); 
            } 
        } 
 
        return maxLength; 
    } 
}