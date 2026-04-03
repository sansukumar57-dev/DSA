package DSA.Array;

public class RotateArraybyD {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int d=2;
        int[] temp=new int[arr.length];
        int[] a=new int[d];
        int[] b=new int[arr.length-d];
        for (int i = 0; i < d; i++) {
          a[i]=arr[i];
            }
        for (int i =d;i < arr.length; i++) {

                b[i-d] = arr[i];
            }
int pos=0;
        for (int i = 0; i < b.length; i++) {
            temp[pos] =b[i];
                pos++;
            }
        for (int i = 0; i < a.length; i++) {
            temp[pos]=a[i];
            pos++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            arr[i]=temp[i];
        }

































//            if(i==arr.length-1) {
//                temp[0]=arr[i];
//                System.out.println( temp[0]);
//
//            }
//            else{
//                temp[i + 1] = arr[i];
//                System.out.println(temp[i]);
//            }

        System.out.println("=====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
