package JavaPractice.MultiThreadig;
class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(10);

            } catch (Exception e) {
            }
            System.out.println("I am Happy :  " + Thread.currentThread());
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(10);

            } catch (Exception e) {
            }
            System.out.println("I am Sad : " + Thread.currentThread());
        }
    }
}
public class ASF {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); // Internally calls run()
        t2.start();
    }
}
