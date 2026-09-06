package DSA.Array;

class Power {
    public double myPow(double x, int n) {
      if (n == 0) return 1.0;

        if (n < 0) {
            return 1 / (x * myPow(x, -(n + 1)));
        }

        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        } else {
            return x * myPow(x, n - 1);
        }
       
    }
}