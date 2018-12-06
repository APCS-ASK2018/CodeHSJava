public class Ship
{
    public static final int
        UNSET = -1,
        HORIZONTAL = 0,
        VERTICAL = 1;
    public static final String[] DIR = {"horizontal","vertical"};
    
    private int row;
    private int col;
    private int len;
    private int dir;
    
    public Ship(int length) {
        len = length;
        dir = UNSET;
        row = UNSET;
        col = UNSET;
    }
    public boolean isLocationSet() {
        return row != UNSET && col != UNSET;
    }
    
    public boolean isDirectionSet() {
        return dir != UNSET;
    }
    
    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public void setDirection(int dir) {
        this.dir = dir;
    }
    
    public int getRow() {return row;}
    public int getCol() {return col;}
    public int getLength() {return len;}
    public int getDirection() {return dir;}
    
    public String locationToString() {
        String pos = isLocationSet() ? row + ", " + col : "unset location"; 
        return "(" + pos + ")";
    }
    public String toString() {
        String str = isDirectionSet() ? DIR[dir] : "unset direction";
        return str + " ship of length " + len + " at " + locationToString();
    }
}
