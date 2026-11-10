package DSA.String;

import java.util.HashMap;

class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            if (m.containsKey(c) && m.get(c) > 0) {
                m.put(c, m.get(c) - 1);
            }
        }

        for (int count : m.values()) {
            if (count > 0) {
                return false;
            }
        }

        return true;
    }
}
