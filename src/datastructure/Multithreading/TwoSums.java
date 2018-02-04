package datastructure.Multithreading;

public class TwoSums implements Runnable{

    private int sum1 = 0;
    private int sum2 = 0;

    private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);

    public  void add(int val1, int val2) {
        synchronized (this.sum1Lock) {
            this.sum1 += val1;
        }
        synchronized (this.sum2Lock) {
            this.sum2 += val2;
        }

        System.out.println();
        System.out.println("sum1 : "+this.sum1);
        System.out.println("sum2 : "+this.sum2);
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new TwoSums());
        Thread t2 = new Thread(new TwoSums());
        t1.start();
        t2.start();

    }

    @Override
    public void run() {

        for (int i=0;i<10;i++){
            add(5,6);
        }
    }
}
