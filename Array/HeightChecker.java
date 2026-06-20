package DSA.Array;

class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected= heights.clone();
int a=0;
      Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(expected[i]!=heights[i]){
            
                a++;
                
            }
        }
        return a;
    }
}