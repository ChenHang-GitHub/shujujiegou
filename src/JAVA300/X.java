package JAVA300;

public class X  extends Thread implements Runnable{
    public void run() {
        System.out.println("!");
    }



    public static void main(String[] args) {
        Thread t =new Thread( new X());
        t.start();
    }


}


class  Z extends  Thread {
    public static void main(String[] args) {
        Z z = new Z();
        z.run();
    }

}