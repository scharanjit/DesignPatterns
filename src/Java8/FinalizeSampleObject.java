package Java8;

/**
 * Seek the difference between
 * Final (string)
 * Finally (try catch)
 * Finalize  (garabge collectiom thread)
 */

public class FinalizeSampleObject {
    public String data;
    public FinalizeSampleObject(String data) {
        this.data = data;
    }
//    @Override
//    public void finalize() {
//        try {
//            // Sleep for 1 minute.
//            Thread.currentThread().sleep(1 * 60 * 1000);
//        } catch (Exception e) {}
//    }
    public static void main(String[] args) {
        long counter = 0;
        while (true) {
            new FinalizeSampleObject("my-fun-data-" + counter);
            System.out.println("created: " + counter++);
        }
    }
}

/**
 * Basically, the ‘main()’ method of this class creates ‘SampleObject’ continuously.
 * The interesting part of this program is the “finalize()” method. This method puts
 * the currently executing thread (i.e. the ‘Finalizer’ thread) to sleep for 1 minute.
 * This example illustrates a poor implementation of “finalize()” method.
 *
 *
 * compare heap dumps with and without overriding finalize method @heaphero.io
 */