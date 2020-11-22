package questtwo.fourthlevel.lecture8.moneyconverter;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();

            allMoney.add(new Hrivna(12.12));
            allMoney.add(new Ruble(15.12));
            allMoney.add(new USD(18.12));
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

