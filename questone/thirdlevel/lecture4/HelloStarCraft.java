package questone.thirdlevel.lecture4;

public class HelloStarCraft {
    public static void main(String[] args) {


        Zerg[] zerg = new Zerg[5];
        Protoss[] protoss = new Protoss[3];
        Terran[] terran = new Terran[4];

        for (int i = 0; i < zerg.length; i++) {
            zerg[i] = new Zerg();
            zerg[i].name = "zerg1" + i;
        }

        for (int i = 0; i < protoss.length; i++) {
            protoss[i] = new Protoss();
            protoss[i].name = "protoss1" + i;
        }

        for (int i = 0; i < terran.length; i++) {
            terran[i] = new Terran();
            terran[i].name = "terran1" + i;
        }


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
