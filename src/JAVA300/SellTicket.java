package JAVA300;

/*
 * 模拟两个窗口售票
 *
 * */
public class SellTicket extends Thread {
    private static int ticket = 100;

//1、synchronized()括号中需要的是一个对象，所以这里使用了String类的一个对象key，可以用this来代替key。
//
//2、一个线程拿到synchronized括号中的对象以后，其他线程也是可以执行的，但是当它们需要用key的时候，发现key已经被别人拿走了，只能等着key被释放了.

    @Override
    public void run() {
        while (true)
        {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(this.getName() + " : " + ticket-- + "张票");
                } else {
                    break;
                }
            }

        }
    }
}

class  SellTicketDemo{
    public static void main(String[] args) {
        SellTicket sellTicket1 = new SellTicket();
        SellTicket sellTicket2 = new SellTicket();
        sellTicket1.setName("1");
        sellTicket2.setName("2");
        sellTicket1.start();
        sellTicket2.start();


    }
}
