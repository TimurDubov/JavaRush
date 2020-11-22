package questthree.firstlevel.lecture5;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Solution)) return false;
        Solution sol = (Solution) obj;
        return this.first == sol.first && this.last == sol.last;

    }

    @Override
    public int hashCode() {
        if (this.first == null && this.last == null) return 0;
        if (this.last == null) return 31 * (this.first.length() + 0);
        if (this.first == null) return 31 * (0 + this.last.length());
        return 13 * (this.first.length() + this.last.length());
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
