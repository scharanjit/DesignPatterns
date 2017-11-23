package practise.makes.a.man.perfect.javaBasics.set6;

class ThreadEx extends Thread
{
    public void run()
    {
        System.out.print("Hello...");
    }
    public static void main(String args[])
    {
        ThreadEx T1 = new ThreadEx();
        T1.start();
        T1.stop();
        T1.start();
    }
}

/**
 * Exception in thread “main” java.lang.IllegalThreadStateException at
 * java.lang.Thread.start
 Thread cannot be started twice.
 */
