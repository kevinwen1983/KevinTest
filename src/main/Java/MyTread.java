public class MyTread extends Thread{
    private Runnable target;
    public MyTread(Runnable target){
        this.target = target;
    }

    @Override
    public void run() {
        if(target == null){
            System.out.println("No task for current thread");
        }else{
            target.run();
        }
    }
}
