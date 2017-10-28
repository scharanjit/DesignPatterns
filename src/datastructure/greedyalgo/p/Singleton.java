package datastructure.greedyalgo.p;



public class Singleton {
    
    private static Singleton uniquewRefe =null;
    
    private Singleton(){
        
    }
    
    public static synchronized  Singleton getInstance(){
        if(uniquewRefe == null){
            uniquewRefe= new Singleton();
        }
        
        return uniquewRefe;
                
    }
}
