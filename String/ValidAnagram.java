package DSA.String;

import java.util.HashMap;

 class ValidAnagram {
        public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hp2 = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if(hp.containsKey(s.charAt(i))) {
                hp.put(s.charAt(i),hp.get(s.charAt(i))+ 1);
            }
             else{
                hp.put(s.charAt(i), 1);
            }
        }
for (int i = 0; i < t.length(); i++) {
            if (hp2.containsKey(t.charAt(i))) {
                hp2.put(t.charAt(i), hp2.get(t.charAt(i)) + 1);
            } else {
                hp2.put(t.charAt(i), 1);
            }
        }
        return hp.equals(hp2);
}
    }