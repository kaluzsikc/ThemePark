import Attraction.Attraction;
import Stall.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<Visitor> visitors;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public void visit(Visitor visitor, Attraction attraction){

    }
}
