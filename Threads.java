public class Threads {



    public static void main(String[] args) {

        System.out.println("hello");

        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        myThread1.start();
        myThread2.start();


        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(i);
            myThread.start();
        }

    }
}
