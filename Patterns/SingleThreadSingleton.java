public class SingleThreadSingleton {
    private static SingleThreadSingleton instance;

    private SingleThreadSingleton() {
        // We don't let others create an instance
    }

    public static SingleThreadSingleton getInstance() {
        if (instance == null) {
            instance = new SingleThreadSingleton();
        }
        return instance;
    }
}