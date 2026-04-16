package DSA.String;

class OutermostParantheses {
    public String removeOuterParentheses(String s) {
        
        
        int count =  0;
        String st = "";
        for(int i = 0 ;i<s.length() ;i++){
            if(s.charAt(i) =='('){
                if(count > 0){
                    st = st + "(";
                }
                count ++;
            }
            else if(s.charAt(i) == ')'){
                count--;
                if(count > 0){
                    st = st +")";
                }
                
            }
        }
        return st;
    }
}