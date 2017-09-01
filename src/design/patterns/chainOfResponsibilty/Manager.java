package design.patterns.chainOfResponsibilty;

public class Manager implements ComplaintHandler {

    private ComplaintHandler successor;

    @Override
    public void processComplaint(String message) {
        System.out.println("Manager: Get out of my restaurant !!");
    }

    @Override
    public void setSuccessor(ComplaintHandler successor) {
        this.successor = successor;
    }
}