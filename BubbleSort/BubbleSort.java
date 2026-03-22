package DSA.BubbleSort;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        // code here

        // code here
        for (int i = 0; i < arr.length-1; i++) {
            boolean   swapped = false;
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                    swapped=true;

                }
            }
            if (!swapped){
                break;}
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        int[] arr={4, 1, 3, 9, 7};
        BubbleSort.bubbleSort(arr);

    }
}
