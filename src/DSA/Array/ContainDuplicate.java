package DSA.Array;

import java.util.HashSet;
import java.util.Set;

class ContainDuplicate {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num:arr) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);}
        return false;
    }
}