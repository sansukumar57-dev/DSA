package DSA.Array;

class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> pos=new ArrayList<>();
       List<Integer> neg=new ArrayList<>();
       for(int num:nums){
        if(num>0){
            pos.add(num);
        }else{
            neg.add(num);
        }
       }
       int[] result = new int[nums.length];

        int index = 0;

        for (int i = 0; i < positive.size(); i++) {
            result[index++] = positive.get(i);
            result[index++] = negative.get(i);
        }
        return arr;
    }
}