package Park;

import Attraction.Attraction;
import Interfaces.IReviewed;
import Stall.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<Visitor> visitors;
    private ArrayList<IReviewed> reviewedPlaces;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.visitors = new ArrayList<>();
        this.reviewedPlaces = new ArrayList<>();
    }

    public void visit(Visitor visitor, Attraction attraction){
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public ArrayList<IReviewed> getReviewedPlaces() {
        return reviewedPlaces;
    }
}
