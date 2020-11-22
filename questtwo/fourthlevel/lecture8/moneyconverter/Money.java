package questtwo.fourthlevel.lecture8.moneyconverter;

public abstract class Money {

    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public abstract String getCurrencyName();
}

