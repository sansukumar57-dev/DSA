package DSA.Array;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int ans = 0;
        int n = height.length;
        int rightMax = n - 1;
        int leftMax = 0;
        for (int i = 0; i < n; i++) {
            if (height[rightMax] > height[leftMax]) {
                ans = Math.max(ans, (rightMax - leftMax) * height[leftMax]);
                leftMax++;
            } else {
                ans = Math.max(ans, (rightMax - leftMax) * height[rightMax]);
                rightMax--;
            }
        }
        return ans;
    }
}