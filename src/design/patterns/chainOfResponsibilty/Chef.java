package design.patterns.chainOfResponsibilty;

public class Chef implements ComplaintHandler {

    private ComplaintHandler successor;

    @Override
    public void processComplaint(String message) {

        if (message.indexOf("overdone") >= 0) {
            System.out.println("Chef: Sorry, another steak is on the way !!");
        } else {
            successor.processComplaint(message);
        }
    }

    @Override
    public void setSuccessor(ComplaintHandler successor) {
        this.successor = successor;
    }
}