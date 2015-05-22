public class ThreadSafeSingleton {
    private static class Holder {
        static final ThreadSafeSingleton instance = 
                new ThreadSafeSingleton();
    }

    private ThreadSafeSingleton() {
        // We don't let others create an instance
    }

    public static ThreadSafeSingleton getInstance() {
        return Holder.instance;
    }
}