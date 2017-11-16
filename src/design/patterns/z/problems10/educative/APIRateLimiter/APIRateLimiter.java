package design.patterns.z.problems10.educative.APIRateLimiter;


import java.util.concurrent.TimeUnit;

/**
 * Let's design an API Rate Limiter which will throttle users based upon
 * the number of the requests they are sending.
 *
 * For API Rate Limiter :- A token Bucket algorithm can be used
 *
 * Token bucket algorithm is used to define the upper limits on bandwidth
 * and burstiness on the data transmission in a software application.
 * The token bucket algorithm is based on an analogy of a fixed capacity bucket
 * into which tokens, normally representing a unit of bytes or a single packet
 * of predetermined size, are added at a fixed rate.
 *
 *
 * Applications
 1.) To provide download bandwidth limits in software applications like
 torrent & download managers.

 2.) To control the download speed on 3G network by our cellular provider.



 Implementation
 Lets try to create an implementation for this algorithm. We will choose
 a Leaky Bucket Implementation, where a fixed amount of tokens are filled
 after a predefined interval into the bucket. If no one utilizes those token,
 then they do not get accumulated over time, they just over flow after
 the capacity of bucket is reached. Let's name this strategy as
 FixedIntervalRefillStrategy.



 Our TokenBucket Class will have following properties


 1. ) Refill Strategy

 2. ) Maximum Capacity of Tokens - this is the maximum amount of tokens
 that a client can ask for, otherwise an exception is thrown.

 3.) Size - it is the current size of the bucket which will keep on
 changing as it is refilled after specific interval and emptied by the clients.


 TokenBucket's consume() method accepts the number of tokens to consume.
 This method will then remove those number of Tokens from the bucket,
 refilling the bucket if required.
 This method utilizes CAS (CompareAndSet) operation of AtomicLong to make the
 resize operation atomic so that no-locking is required.
 This will make the class thread-safe when multiple threads will simultaneously
 demand for the tokens.


 */
public class APIRateLimiter {

    public static void main(String[] args) {

        int speedLimitKBps =100;
        TokenBucket bucket = TokenBuckets.newFixedIntervalRefill(1024 * 10, speedLimitKBps, 1, TimeUnit.SECONDS);
        System.out.println(bucket.toString());



    }
}

