package design.patterns.visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}