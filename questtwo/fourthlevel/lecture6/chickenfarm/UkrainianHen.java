package questtwo.fourthlevel.lecture6.chickenfarm;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 0;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна" + " - " +
                Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
