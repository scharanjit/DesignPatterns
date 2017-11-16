package design.patterns.z.problems10.educative.APIRateLimiter;

import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket {
    private final RefillStrategy refillStrategy;
    private final long capacity;
    private AtomicLong size;

    public TokenBucket(long capacity, RefillStrategy refillStrategy) {
        this.refillStrategy = refillStrategy;
        this.capacity = capacity;
        this.size = new AtomicLong(0L);
    }

    public void consume(long numTokens) throws InterruptedException {
        if (numTokens < 0)
            throw new RuntimeException("Number of tokens to consume must be positive");
        if (numTokens >= capacity)
            throw new RuntimeException("Number of tokens to consume must be less than the capacity of the bucket");

        long newTokens = Math.max(0, refillStrategy.refill());
        while (!Thread.currentThread().isInterrupted()) {
            long existingSize = size.get();
            long newValue = Math.max(0, Math.min(existingSize + newTokens, capacity));
            if (numTokens <= newValue) {
                newValue -= numTokens;
                if (size.compareAndSet(existingSize, newValue))
                    break;
            } else {
                Thread.sleep(refillStrategy.getIntervalInMillis());
                newTokens = Math.max(0, refillStrategy.refill());
            }
        }
    }


    @Override
    public String toString() {
        return "Capacity : " + capacity + ", Size : " + size;
    }
}









