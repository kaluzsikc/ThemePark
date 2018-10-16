package Stall;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Park.Visitor;

public class TobaccoStall extends Stall  implements ISecurity, ITicketed {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating){

        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return 6.60;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
