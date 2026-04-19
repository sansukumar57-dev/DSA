package DSA.String;

import java.util.ArrayList;
import java.util.List;

class ReverseWord {
    public String reverseWords(String s) {
         List<String> list = new ArrayList<>();
int st = 0;

for (int i = 0; i <= s.length(); i++) {
     if (i == s.length() || s.charAt(i) == ' ') {
        
         String word = s.substring(st, i);

        if (!word.equals("")) {
           list.add(word);
        }         
        st = i + 1;
    }
} 
String[] rev = list.toArray(new String[0]);

        String res = "";

        for (int i = rev.length - 1; i >= 0; i--) {
            if (res.equals("")) {
                res = rev[i];
            } else {
                res = res + " " + rev[i];
            }
        }

        return res;
    }
}
