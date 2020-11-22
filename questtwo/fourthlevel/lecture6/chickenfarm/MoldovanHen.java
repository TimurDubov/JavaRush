package questtwo.fourthlevel.lecture6.chickenfarm;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна" + " - " +
                Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

