package DSA.Array;

class LenghtEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int f = nums[i];
            int v = nums[i + 1];
            for (int j = 0; j < f; j++) {
                l.add(v);
            }
        }
        int[] res = new int[l.size()];
        for (int k = 0; k < l.size(); k++) {
            res[k] = l.get(k);
        }
        return res;
    }
}