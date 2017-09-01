package design.patterns.singleton;

//this design pattern basically consist of single class
//which is responsible to create single object at any time
public class Singleton {

    //create an abject of single class
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class can not be instantiated in any other way
    private Singleton() {

    }

    //get the object available
    public static Singleton getInstance() {
        return instance;
    }

    //if we have below mentoiend kind of method, we can have many
    //instances of singel class

//    public Singleton getInstance1(){
//        return new Singleton();
//    }

}
