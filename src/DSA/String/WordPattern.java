package DSA.String;

import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character,Integer> pMap = new HashMap<>();
        Map<String,Integer> wMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            if (!Objects.equals(pMap.put(p, i), wMap.put(w, i))) {
                return false;
            }
        }
        return true;
    }
}