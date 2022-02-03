package Utils;

public class GlobalStore {
    private static DataObject obj;

    public static DataObject getObject() {
        return obj;
    }

    public static void setObject(DataObject object) {
        GlobalStore.obj = object;
    }
}
