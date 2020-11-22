package questtwo.thirdlevel.lecture11;

public class AddingInterfaces4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
