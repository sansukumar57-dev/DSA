package DSA.String;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

          
        String first = strs[0];
        String ans = "";
        
        for(int i = 0; i < first.length(); i++){
            char ch=first.charAt(i);
              for(int j=1;j<strs.length; j++){
                if(i >=strs[j].length()||strs[j].charAt(i)!=ch){
                    return ans;
                }
            }
             ans = ans + ch;
        }
        
        return ans;
      
    }
}