package questtwo.fourthlevel.lecture6.chickenfarm;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 50000;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна" + " - " +
                Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

