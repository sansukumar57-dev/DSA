package DSA.Array;

class FirstIndexString {
    public int strStr(String s, String t) {
       
        
            for (int i = 0; i < s.length(); i++) {
            if(t.contains(s.substring(0,t.length()))){
                   return i;
            }
            }
        
           
        
        return -1;
    }
}