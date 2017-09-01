package design.patterns.chainOfResponsibilty;

public interface ComplaintHandler {

    void processComplaint(String message);

    void setSuccessor(ComplaintHandler successor);
}
