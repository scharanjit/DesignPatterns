package Java8;

import java.util.concurrent.CompletableFuture;

import static java.lang.Thread.sleep;

public class Asynch {

    public static void main(String[] args) throws InterruptedException {

            CompletableFuture.runAsync(() -> System.out.println("Run async in completable future " + Thread.currentThread
                    ()));

            CompletableFuture.supplyAsync(() -> 5)
                    .thenApply(i -> i * 3)
                    .thenAccept(i -> System.out.println("The result is " + i))
                    .thenRun(() -> System.out.println("Finished."));


        /**
         * This would be like
         *   CompletableFuture.supplyAsync(this::findReceiver)
             .thenApply(this::sendMsg)
             .thenAccept(this::notify);
         *
         * Now the asynchronous task will first find a receiver, then send a message to the
         * receiver before it passes the result on to the last callback to notify.
         *
         *
         */

    }
}
