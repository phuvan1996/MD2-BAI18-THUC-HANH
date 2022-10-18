package thuchanh1;

public class Main {
    public static void main(String[] args) {
        System.out.println("thuchanh1.Main thread running.....");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread -1 -HR-Database");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread - 2-Sent email");
        runnableDemo2.start();
        System.out.println("thread stopped !!!!");
    }
}