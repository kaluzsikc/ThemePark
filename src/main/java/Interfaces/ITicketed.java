package Interfaces;

import Park.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
}


