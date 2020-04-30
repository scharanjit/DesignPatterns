package producerConsumer;

public class ProducerConsumer {

  static Object lock = new Object();

  private static int[] buffer;
  private static int count;

  public static boolean isFull(int[] buffer) {
    return count == buffer.length;
  }

  public static boolean isEmpty(int[] buffer) {
    return count == 0;
  }


  static class Producer {

    void produce() {
      synchronized (lock) {
        if (isFull(buffer)) {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        }
        buffer[count++] = 1;

        lock.notify();
      }
    }


  }

  static class Consumer {

    void consume() {
      synchronized (lock) {

        if (isEmpty(buffer)) {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        buffer[--count] = 0;
        lock.notify();
      }
    }


  }

  public static void main(String[] args) throws InterruptedException {
    buffer = new int[10];

    count = 0;

    Producer producer = new Producer();
    Consumer consumer = new Consumer();

    Runnable producerTask = () -> {

      for (int i = 0; i < 50; i++) {
        producer.produce();
      }
    };

    Runnable consumerTask = () -> {

      for (int i = 0; i < 45; i++) { //consume only 45 items
        consumer.consume();
      }
    };

    Thread producerThread = new Thread(producerTask);
    Thread consumerThread = new Thread(consumerTask);

    producerThread.start();
    consumerThread.start();

    producerThread.join();
    consumerThread.join();

    System.out.println("Data in the buffer " + count);

  }


}
