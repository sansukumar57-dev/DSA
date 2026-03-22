package DSA.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
int[] arr ={4, 1, 3,99,12,42,'A', 9, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
