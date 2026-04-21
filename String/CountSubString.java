package DSA.String;

class CountSubString {
    public static int countSubstring(String s) {
        // code here
         
int cc=0;
for (int i = 0; i < s.length(); i++) {
           
for (int j = i+1; j <= s.length(); j++) {
    
    String substring=s.substring(i,j);
    if(substring.contains("a")&&substring.contains("b")&&substring.contains("c"))
                cc++;
       }
}
        return cc;
    }
}
