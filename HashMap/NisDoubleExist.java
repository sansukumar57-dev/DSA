package DSA.HashMap;

class  NisDoubleExist{
    public boolean checkIfExist(int[] arr) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (num == 0) {
                if (map.get(0) > 1)
                    return true;
            } else {
                if (map.containsKey(num * 2))
                    return true;
            }
        }

        return false;
    }
}