package Interfaces;
import Park.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
