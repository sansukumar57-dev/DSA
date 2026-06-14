package DSA.Array;

class KthSmallest {
    public int kthSmallest(int[] arr, int k) {

        for (int i = 0; i < k; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1];
    }
}