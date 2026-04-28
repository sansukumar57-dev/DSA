package DSA.PowerX;

class PowerX {
    public double myPow(double x, int n) {
        double ans = 1;
        
        boolean isPowNegative = n < 0;
        long N = Math.abs((long) n); 
        while (N > 0) {
            if (N % 2 == 0) {
                x = x * x;
                N /= 2;
            } else {
                ans *= x;
                N--;
            }
        }
        
        if (isPowNegative) {
            ans = 1 / ans;
        }
        
        return ans;
    }
}