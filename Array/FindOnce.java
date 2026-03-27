package DSA.Array;

public class FindOnce {
    static int findonce(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i+=2) {
            if(i==n-1||arr[i]!=arr[i+1]){
return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int[] arr={1,2,1,1,3,3,2,2,4,4};
        System.out.println(findonce(arr));
    }
}
