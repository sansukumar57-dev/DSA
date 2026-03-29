package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicates {

     static ArrayList<Integer> removeDuplicate(int arr[]) {
            ArrayList<Integer> ans = new ArrayList<>();

            if (arr.length == 0) return ans;

            ans.add(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    ans.add(arr[i]);
                }
            }

            return ans;
        }




    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        ArrayList<Integer> result = removeDuplicate(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Removing Duplicates: " + result);
    }
}
