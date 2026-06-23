package DSA.String;

class ToLowerCase {
    public String toLowerCase(String s) {
        // String str=s.toLowerCase();
        // return str;

        char[] c=s.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i]>='A'&& c[i]<='Z'){
                c[i]=(char)(32+c[i]);

            }
        }
        return new String(c);
    }
}