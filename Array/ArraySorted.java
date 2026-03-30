package DSA.Array;

public class ArraySorted {

        static boolean isSorted(int[] arr) {
            // code here
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
      int[]  arr={10, 20, 30, 40, 50};
        System.out.println(isSorted(arr));
    }
}
