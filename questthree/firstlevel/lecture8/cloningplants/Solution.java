package questthree.firstlevel.lecture8.cloningplants;

public class Solution {


    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {


        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {

        @Override
        protected Tree clone() throws CloneNotSupportedException {

            String[] strings = new String[branches.length];

            for (int i = 0; i < strings.length; i++) {
                strings[i] = branches[i];
            }

            Tree tree = new Tree(super.getName(), this.getBranches());
            return new Tree(super.getName(), strings);
        }

        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }
    }
}
