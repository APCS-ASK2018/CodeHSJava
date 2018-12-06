public class Location
{
    //Implement the Location class here
    static final int
        UNGUESSED = 0,
        HIT = 1,
        MISSED = 2;
    
    int stat = UNGUESSED;
    boolean hasShip = false;
    
    // Was this Location a hit?
    public boolean checkHit() {return stat == HIT;}
    
    // Was this location a miss?
    public boolean checkMiss() {return stat == MISSED;}
    
    // Was this location unguessed?
    public boolean isUnguessed() {return stat == UNGUESSED;}
    
    // Mark this location a hit.
    public void markHit() {stat = HIT;}
    
    // Mark this location a miss.
    public void markMiss() {stat = MISSED;}
    
    // Return whether or not this location has a ship.
    public boolean hasShip() {return hasShip;}
    
    // Set the value of whether this location has a ship.
    public void setShip(boolean val) {hasShip = val;}
    
    // Set the status of this Location.
    public void setStatus(int status) {stat = status;}
    
    // Get the status of this Location.
    public int getStatus() {return stat;}
}
