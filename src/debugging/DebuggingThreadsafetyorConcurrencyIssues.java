package debugging;

/**
 * How would you go about debugging thread-safety or concurrency issues?
 * A1. #1: Manually reviewing the code for any obvious thread-safety issues.
 * Good knowledge of multi-threading is required.
 *
 * #2: List all possible causes and add extensive log statements and write…
 */
public class DebuggingThreadsafetyorConcurrencyIssues {
}

/**
 * Threading/concurrency problems
 *
 * => design should be good
 * => isolate mutable objects to a single thread
 * => Best use Immutable objects
 * => fully synchronized control objects
 *
 *
 * Deadlocks are the easiest to debug, if you can get a stack trace
 * when deadlocked. Given the trace, most of which do deadlock detection,
 * it's easy to pinpoint the reason and then reason about the code as to
 * why and how to fix it. With deadlocks, it always going to be a problem
 * acquiring the same locks in different orders.

 Live locks are harder - being able to observe the system while in the error
 state is your best bet there.

 Race conditions tend to be extremely difficult to replicate, and are even
 harder to identify from manual code review. With these, the path I usually
 take, besides extensive testing to replicate, is to reason about the
 possibilities, and try to log information to prove or disprove theories.
 If you have direct evidence of state corruption you may be able to reason
 about the possible causes based on the corruption.




 A race condition occurs when two or more threads can access shared
 data and they try to change it at the same time. Because the thread
 scheduling algorithm can swap between threads at any time, you don't
 know the order in which the threads will attempt to access the shared data.

 Therefore, the result of the change in data is dependent on the thread
 scheduling algorithm, i.e. both threads are "racing" to access/change the data.
 *
 */
