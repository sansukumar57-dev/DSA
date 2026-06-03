package DSA.String;

import java.util.HashSet;

class Pangram {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }

        return set.size() == 26;
    }
}