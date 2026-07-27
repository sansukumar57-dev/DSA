package DSA.Array;

class Solution {
    public int rob(int[] n) {
        if (n.length == 0) {
            return 0;
        }

        int y = 0;
        int x = 0;

        for (int i = 0; i < n.length; i++) {
            int money = n[i];
            int curr = Math.max(x, y + money);
            y = x;
            x = curr;
        }

        return x;
    }
}