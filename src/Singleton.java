public class Singleton {
    private static Singleton instance = null;

    public int ID;
    private Singleton() {
        ID = 1;
    }
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void main(String args[])
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.ID++;

        System.out.println("s2 should also change to: " + s2.ID);
    }
}
