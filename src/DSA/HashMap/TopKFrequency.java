package DSA.HashMap;

import java.util.*;

class TopKFrequency {
    public int[] topKFrequent(int[] nums, int k) {
         int n = nums.length;
        if(k == 0)
            return new int[]{};
         
        Map<Integer,Integer> map = HashMap.newHashMap(n);

        for(int num : nums)
            map.put(num,map.getOrDefault(num,0) + 1);

        List<Integer>[] buckets = new List[n + 1];

        for(int key : map.keySet())
        {
            int val = map.get(key);
            if(buckets[val] == null)
                buckets[val] = new ArrayList<>();
            buckets[val].add(key);
        }
        int idx = 0;
        int[] ans = new int[k];
        for(int i=n;i>=0;i--)
        {
            if(buckets[i] != null)
            {
                for(int num: buckets[i])
                {
                    ans[idx++] = num;
                    if(idx == k)
                        return ans;
                }
                
            }
        }
        return ans;
    }
}