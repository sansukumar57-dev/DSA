package DSA.String;

class LongestPalindromicString {
    public String longestPalindrome(String s) {
       String res="";
       for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            int a=0;
           int b=sub.length()-1;
            boolean flag=true;
           while(a<b){
            if(sub.charAt(a)!=sub.charAt(b)){
                flag=false;
                break;
                }
            a++;
            b--;
            }
           
           if(flag&&sub.length()>res.length()){
            res=sub;
           }

           }
            
        }
            
        
        return res;
    }
    
}