package questone.fifthlevel.lecture12;

public class MakingMenAndWomen {
    public static void main(String[] args) {

        Man man1 = new Man("Вася", 20, "New York");
        Man man2 = new Man("Денис", 24, "Tokyo");

        Woman woman1 = new Woman("Настя", 30, "Москва");
        Woman woman2 = new Woman("Мария", 38, "Санкт-Петербург");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
