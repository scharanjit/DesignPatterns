package design.patterns.z.problems10.educative.APIRateLimiter;

public interface RefillStrategy {
    long refill();
    long getIntervalInMillis();
}
