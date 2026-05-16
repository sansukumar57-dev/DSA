package DSA.Array;

class FindingMissingAndReapitingValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n=grid.length;
        Set<Integer> s=new HashSet<>();
        int[] arr=new int[2];
        for(int[] row:grid)
        {
            for(int i:row)
            {
                if(s.contains(i))arr[0]=i;
                s.add(i);
            }
        }
        for(int i=1;i<=n*n;i++)
        {
            if(!s.contains(i))arr[1]=i;
        }
        return arr;
    }
}