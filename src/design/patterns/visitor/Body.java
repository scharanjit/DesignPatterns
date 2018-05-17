package design.patterns.visitor;

public class Body implements CarElement {
    public void accept(final CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
