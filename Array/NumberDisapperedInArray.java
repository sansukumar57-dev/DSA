package DSA.Array;

class NumberDisapperedInArray {
    public List<Integer> findDisappearedNumbers(int[] arr) {
       HashSet<Integer> s=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        for (int i = 1; i <=arr.length; i++) {
            if(!s.contains(i)){
                l.add(i);
            }

        }
        return l;
    }
}