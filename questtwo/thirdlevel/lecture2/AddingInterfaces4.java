package questtwo.thirdlevel.lecture2;

public class AddingInterfaces4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
    //напишите тут ваш класс
}

