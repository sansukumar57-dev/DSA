package DSA.Array;

public class MoveNegetiveNumber {
    static int[] movenegitive(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }


        return arr;

    }
    public static void main(){
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
       int [] a=movenegitive(arr);
       for(Object o:a){
           System.out.print(o+"\t");
       }
    }
}
