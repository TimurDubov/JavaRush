package questone.tenthlevel.lecture11;

public class IMakeConstructors {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private double height;
        private String address;
        private boolean sex;
        private char color;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, double height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public Human(String name, int age, double height, String address){
            this.name = name;
            this.age = age;
            this.height = height;
            this.address = address;
        }
        public Human(String name, int age, double height, String address, boolean sex){
            this.name = name;
            this.age = age;
            this.height = height;
            this.address = address;
            this.sex = sex;
        }
        public Human(String name, int age, double height, String address, boolean sex, char color){
            this.name = name;
            this.age = age;
            this.height = height;
            this.address = address;
            this.sex = sex;
            this.color = color;
        }
        public Human(String name, double height){
            this.name = name;
            this.height = height;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, char color){
            this.name = name;
            this.color = color;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
