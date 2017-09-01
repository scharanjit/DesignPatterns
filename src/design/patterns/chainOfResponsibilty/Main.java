package design.patterns.chainOfResponsibilty;

public class Main {

    public static void main(String[] args) {
         Manager manager = new Manager();
         Chef chef = new Chef();
         Waiter waiter = new Waiter();

         //setup the chain of responsibility
       waiter.setSuccessor(chef);
       chef.setSuccessor(manager);
       manager.setSuccessor(null);

       //participants : CLient initiate the request to
        // concrete handler  object on the chain

        waiter.processComplaint("I'm out of water");

        waiter.processComplaint("This is a ripOff");

        waiter.processComplaint("This steak is overdone");




    }
}
