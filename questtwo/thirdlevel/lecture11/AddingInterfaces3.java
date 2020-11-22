package questtwo.thirdlevel.lecture11;

public class AddingInterfaces3 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}

