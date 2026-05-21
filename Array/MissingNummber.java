package DSA.Array;

class MissingNummber {
    public int missingNumber(int[] arr) {
        int n = arr.length + 1; 
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }
}