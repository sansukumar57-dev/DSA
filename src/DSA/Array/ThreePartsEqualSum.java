package DSA.Array;

class ThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(int i:arr){
            total+=i;
        }
        if(total%3!=0){
            return false;
        }
         int target = total / 3;
        int sum = 0;
        int parts = 0;

        for (int num : arr) {
            sum += num;

            if (sum == target) {
                parts++;
                sum = 0;
            }
        }

        return parts >= 3;
    }
}