package design.patterns.visitor;

public class Engine implements CarElement {
    public void accept(final CarElementVisitor visitor) {
        visitor.visit(this);
    }
}