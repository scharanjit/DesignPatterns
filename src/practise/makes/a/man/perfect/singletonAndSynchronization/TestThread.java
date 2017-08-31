package practise.makes.a.man.perfect.singletonAndSynchronization;

public class TestThread implements  Runnable{
    private String threadName;

    public void run() {
        for(int i=0; i<1000 ; i++) {
            Singleton singleton = Singleton.getInstance();
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            Singleton singleton3 = Singleton.getInstance();
            Singleton singleton4 = Singleton.getInstance();
            System.out.println(singleton1.equals(singleton));
            System.out.println(singleton1.equals(singleton2));
            System.out.println(singleton1.equals(singleton3));
            System.out.println(singleton1.equals(singleton4));
            System.out.println(singleton2.equals(singleton1));
            System.out.println(singleton2.equals(singleton));
            System.out.println(singleton2.equals(singleton3));
            System.out.println(singleton2.equals(singleton4));
            System.out.println(singleton3.equals(singleton1));
            System.out.println(singleton3.equals(singleton2));
            System.out.println(singleton3.equals(singleton));
            System.out.println(singleton3.equals(singleton4));
            System.out.println(singleton4.equals(singleton1));
            System.out.println(singleton4.equals(singleton2));
            System.out.println(singleton4.equals(singleton3));
            System.out.println(singleton.equals(singleton1));
            System.out.println(singleton.equals(singleton2));
            System.out.println(singleton.equals(singleton3));
            System.out.println(singleton.equals(singleton4));
            System.out.println(singleton1.hashCode()==singleton.hashCode());
            System.out.println(singleton1.hashCode()==singleton2.hashCode());
            System.out.println(singleton1.hashCode()==singleton3.hashCode());
            System.out.println(singleton1.hashCode()==singleton4.hashCode());
            System.out.println(singleton2.hashCode()==singleton.hashCode());
            System.out.println(singleton2.hashCode()==singleton3.hashCode());
            System.out.println(singleton2.hashCode()==singleton4.hashCode());
            System.out.println(singleton3.hashCode()==singleton.hashCode());
            System.out.println(singleton3.hashCode()==singleton2.hashCode());
            System.out.println(singleton3.hashCode()==singleton4.hashCode());
            System.out.println(singleton4.hashCode()==singleton.hashCode());
            System.out.println(singleton4.hashCode()==singleton2.hashCode());
            System.out.println(singleton4.hashCode()==singleton3.hashCode());
            System.out.println(singleton.hashCode()==singleton4.hashCode());
        }
    }

    public TestThread(String name){
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread("Thread-0");
        Thread t = new Thread(testThread);
        TestThread testThread1 = new TestThread("Thread-1");
        Thread t1 = new Thread(testThread1);
        TestThread testThread2 = new TestThread("Thread-2");
        Thread t2 = new Thread(testThread2);
        TestThread testThread3 = new TestThread("Thread-3");
        Thread t3 = new Thread(testThread3);
        TestThread testThread4 = new TestThread("Thread-4");
        Thread t4 = new Thread(testThread4);
        TestThread testThread5 = new TestThread("Thread-5");
        Thread t5 = new Thread(testThread5);
        TestThread testThread6 = new TestThread("Thread-6");
        Thread t6 = new Thread(testThread6);

        t2.start();
        t.start();
        t1.start();
        t4.start();
        t5.start();
        t6.start();
        t3.start();

    }
}
