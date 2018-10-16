package Stall;

import Interfaces.ITicketed;
import Park.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownerName, int parkingSpot, int rating){

        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
