package DSA.Array;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};


        int firstMax;
        int secondMax;
if(arr.length<2){
    System.out.println("no second largest number");
    return;
}
        if(arr[0]>arr[1]){
firstMax=arr[0];
secondMax=arr[1];
        }else{
            firstMax=arr[1];
            secondMax=arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            } else if (arr[i]>secondMax&&arr[i]!=firstMax) {
                secondMax=arr[i];
            }
        }
        if(firstMax==secondMax){
            System.out.println("No secod largest ");
        }
        else {
            System.out.println("Second Largest: " + secondMax);
        }




    }

    public static class MaxCount {

            static int maxConsecBits(int[] arr) {
                // code here
                int count=1;
                int maxCount=1;
                int n=arr.length;
                for(int i=1;i<n;i++){
                    if(arr[i]==arr[i-1]){
                        count++;
                    }
                    else{
                        count=1;

                    }

                    if(count>maxCount){
                        maxCount=count;
                    }
                }
                return maxCount;

            }
        public static void main(String[] args) {
            int[] arr={0, 1, 0, 1, 1, 1, 1};
            System.out.println(maxConsecBits(arr));
        }

    }
}
