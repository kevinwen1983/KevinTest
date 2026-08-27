public class TreadTest {
    public static void main(String[] args) {
        Runnable1 runnable1 = new Runnable1();
        Runnable2 runnable2 = new Runnable2();
        MyTread myTread1 = new MyTread(runnable1);
        MyTread myTread2 = new MyTread(runnable2);
        myTread1.start();
        myTread2.start();


    }
}
