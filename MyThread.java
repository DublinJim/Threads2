public class MyThread extends Thread {
private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {


        for (int i = 0; i < 6; i++) {
            System.out.println("Number count:: " + i + " from thread "+threadNumber );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
