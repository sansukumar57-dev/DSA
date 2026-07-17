package DSA.HashMap;

class Sum3multiply {
    public int threeSumMulti(int[] arr, int target) {
       long mod = 1_000_000_007;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {

                int need = target - arr[i] - arr[j];

                ans = (ans + map.getOrDefault(need, 0)) % mod;

                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
        }

        return (int) ans;  
    }
}