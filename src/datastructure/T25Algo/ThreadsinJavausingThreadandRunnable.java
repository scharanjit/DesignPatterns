package datastructure.T25Algo;


/**
 * 1. Inheritance Option:   The limitation with "extends Thread" approach is that
 * if you extend Thread,  you can not extend anything else .
 * Java does not support multiple inheritance.  In reality , you do not
 * need Thread class behavior , because in order to use a thread you need to
 * instantiate one anyway.
 On the other hand,
 Implementing the Runnable interface gives you the choice to extend any class you like ,
 but still define behavior that will be run by separate thread.


 2. Reusability :  In "implements Runnable" , we are creating a different Runnable
 class for a specific behavior  job (if the work you want to be done is job).
 It gives us the freedom to reuse the specific
 behavior job whenever required.
 "extends Thread"  contains both thread and job specific behavior code.
 Hence once thread completes execution , it can not be restart again.

 3. Object Oriented Design:  Implementing Runnable should be preferred .
 It does not specializing or modifying the thread behavior . You are giving
 thread something to run. We conclude that Composition is the better way.
 Composition means two objects A and B satisfies has-a  relationship.
 "extends Thread"  is not a good Object Oriented practice.

 4. Loosely-coupled : "implements Runnable" makes the code loosely-coupled
 and easier to read .
 Because the code is split into two classes .
 Thread class for the thread specific code and your Runnable implementation
 class for your job that should be run by a thread code.
 "extends Thread"  makes the code tightly coupled . Single class contains the
 thread code as well as the job that needs to be done by the thread.

 5. Functions overhead :  "extends Thread"  means inheriting all the
 functions of the Thread class which we may do not need .
 job can be done easily by Runnable without the Thread class functions overhead.


 6.Logical Separation Of Task From The Runner

 If you implement Runnable interface, it will separate actual task from the runner.
 Runnable interface represents only the task and you can pass this task to any
 type of runner, either a thread or any executors.
 */
public class ThreadsinJavausingThreadandRunnable implements  Runnable{


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }
}
