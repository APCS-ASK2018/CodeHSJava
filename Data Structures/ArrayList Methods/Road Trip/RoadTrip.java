import java.util.*;

public class RoadTrip
{
    private ArrayList<GeoLocation> places;
    
    public RoadTrip() {
        places = new ArrayList<GeoLocation>();
    }
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        places.add(new GeoLocation(name,latitude,longitude));
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops() {return places.size();}
    
    // Get the total miles of the trip
    public double getTripLength() {
        double sum = 0;
        for(int i = 1; i < places.size(); i++)
            sum += places.get(i).distanceFrom(places.get(i-1));
        return sum;
    }
    
    // Return a formatted toString of the trip
    public String toString() {
        String output = "";
        int count = 0;
        for(GeoLocation g : places)
            output += ++count + ". " + g + "\n";
        return output;
    }
}
