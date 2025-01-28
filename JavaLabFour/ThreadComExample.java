package labfour;

public class ThreadComExample {
    public static void main(String[] args) {
        ThreadComSharedData sharedData = new ThreadComSharedData();
        ThreadComWaitThread waitThread = new ThreadComWaitThread(sharedData);
        ThreadComIncrementThread incrementThread = new ThreadComIncrementThread(sharedData);
        waitThread.start();
        incrementThread.start();
    }
}
