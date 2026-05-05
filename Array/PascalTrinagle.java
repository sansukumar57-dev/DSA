package DSA.Array;

class PascalTrinagle {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pascal =new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List temp= new ArrayList<>(Collections.nCopies(i + 1, 1));
            for(int j=1;j<i;j++){
                //  int val= pascal[i−1][j−1] + pascal[i−1][j]; pascal formula
                 int val= pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j);
                 temp.set(j,val);

            }
            pascal.add(temp);
        }
        return pascal;
    }
}