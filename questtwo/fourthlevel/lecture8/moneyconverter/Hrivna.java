package questtwo.fourthlevel.lecture8.moneyconverter;

public class Hrivna extends Money{

    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
