package DSA.Array;

import java.util.*;

class RandomizedSet {

    private List<Integer> nums;
    private Map<Integer, Integer> indexMap;
    private Random random;

    public RandomizedSet() {
        nums = new ArrayList<>();
        indexMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }

        indexMap.put(val, nums.size());
        nums.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        int index = indexMap.get(val);
        int lastValue = nums.get(nums.size() - 1);

        // Move last element to the position of val
        nums.set(index, lastValue);
        indexMap.put(lastValue, index);

        // Remove last element
        nums.remove(nums.size() - 1);
        indexMap.remove(val);

        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}