package DSA.Array;

public class Search {

        static int search(int arr[], int x) {
            // code here
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    return i;
                }
            }

            return -1;
        }


    public static void main(String[] args) {
        int[] arr = {10, 4, 44};
        System.out.println(Search.search(arr,4));
    }
}
