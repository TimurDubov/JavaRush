package questthree.firstlevel.lecture10.iamtestingautocloseable;

public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}
