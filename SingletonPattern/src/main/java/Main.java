public class Main {
    public static void main(String args) {
        validateThreadUnsafeSingleton();
    }

    private static void validateThreadUnsafeSingleton() {
        System.out.println(ThreadUnsafeSingleton.getInstance() == ThreadUnsafeSingleton.getInstance());
    }
}
