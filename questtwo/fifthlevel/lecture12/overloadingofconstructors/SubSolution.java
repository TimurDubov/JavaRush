package questtwo.fifthlevel.lecture12.overloadingofconstructors;

public class SubSolution extends Solution {
    public SubSolution() {
    }

    protected SubSolution(int b) {
        super(b);
    }

    SubSolution(String c) {
        super(c);
    }
}
