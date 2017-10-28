package practise.makes.a.man.perfect.singletonAndSynchronization;


public class Singleton {

    //create an object of single class
    private static Singleton instance = null;
    //double check
    private static Object lock = new Object();


    //make the constructor private so that this class can not
    // be instantiated in any other way
    private Singleton() {

    }

    //get the object available
    //Draconian synchronization
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            //double check synchronization
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //if we use below getInstance method
    //multiple thread can read to this method creating multiple instances
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance =  new Singleton();
//        }
//        return  instance;
//    }
}
