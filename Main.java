public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println; // x -> System.out.println(x);
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}