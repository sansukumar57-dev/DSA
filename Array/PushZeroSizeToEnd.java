package DSA.Array;

public class PushZeroSizeToEnd {

      static   void pushZerosToEnd(int[] arr) {
            // code here

            int j=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    if(i!=j){
                        int temp =arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }
                    j++;
                }

            }
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]+" ");

          }

        }
    public static void main(String[] args) {
        int[] arr={-3,2,18,0,24,24,0,};
        PushZeroSizeToEnd.pushZerosToEnd(arr);
    }
}
