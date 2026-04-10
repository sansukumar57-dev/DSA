package DSA.Array;

public class SingleAmongDoubles {
    // User function Template for Java

    class Sol {
        public static int search(int n, int arr[]) {
            // your code here
            if(n==1) return arr[0];
            if(arr[0]!=arr[1]) return arr[0];
            int i=0;
            while(i<n-1){
                if(arr[i]!=arr[i+1]){
                    return arr[i];
                }
                i+=2;
            }

            return arr[n-1];
        }
    }
}
