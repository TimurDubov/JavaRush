package questtwo.fourthlevel.lecture6.chickenfarm;

public class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10000;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна" + " - " +
                Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
