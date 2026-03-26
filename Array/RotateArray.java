package DSA.Array;

public class RotateArray {

        static void rotateArr(int arr[], int d) {
            // code here
            int n=arr.length;
            d= d%n;
            int[] temp=new int[n];
            int k=0;
            for(int i=d;i<n;i++){
                temp[k++] =arr[i];
            }
            for(int i=0;i<d;i++){
                temp[k++] =arr[i];
            }
            for(int i=0;i<n;i++){
                arr[i]=temp[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }


        }

    public static void main(String[] args) {
            int [] arr={1,3,4,5,6,3,6};
        rotateArr(arr,5);

    }
}
