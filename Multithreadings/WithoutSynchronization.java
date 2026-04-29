package Multithreadings;

public class WithoutSynchronization {

    int count = 0;

    void add() {
        count++;
    }

    public static void main(String[] args) throws Exception {

        WithoutSynchronization ws = new WithoutSynchronization();

        Thread t1 = new Thread(() -> ws.add());
        Thread t2 = new Thread(() -> ws.add());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ws.count);
    }
}