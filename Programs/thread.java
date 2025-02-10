package Programs;

public class thread extends Thread {
    public void run() {
        int a = 10;
        int b = 20;
        System.out.print("thread is running");
        System.out.print(a+b);
    }

    public static void main(String[] args) {
        thread t = new thread();
        t.start();
    }
}