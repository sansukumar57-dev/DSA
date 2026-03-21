package DSA.PrimeNumber;

public class PrimeNumber {

        static boolean isPrime(int n) {
            // code here
            if(n<=1) return false;
            int res = 0;

            for (int i = 0; i <= n; i++) {
                if (n % i == 0) {
                    res++;
                }
                if (res > 2) return false;
            }

            return true;
        }

    public static void main(String[] args) {
      boolean a = isPrime(5);
      if(a) {
          System.out.println("Prime Number");
      }else{
          System.out.println("Not a Prime number");
      }
    }
}
