package design.patterns.chainOfResponsibilty;

public class Waiter implements ComplaintHandler {

    private ComplaintHandler successor;

    @Override
    public void processComplaint(String message) {

        if (message.indexOf("out of water") >= 0) {
            System.out.println("Waiter: I'll get you water immediately");
        } else {
            successor.processComplaint(message);
        }
    }

    @Override
    public void setSuccessor(ComplaintHandler successor) {
        this.successor = successor;
    }
}
