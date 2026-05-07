package DSA.Array;

class Roatate {
    public void rotate(int[][] a) {
          int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        for(int arr[]:a) System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=a[i][n-1-j];
                a[i][n-1-j]=a[i][j];
                a[i][j]=t;
            }
        }
    }
}