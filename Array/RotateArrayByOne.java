package DSA.Array;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5};

int[] temp=new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            if(i== arr.length-1){
                temp[0]=arr[i];
            }
           else {
                temp[i + 1] = arr[i];

            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
