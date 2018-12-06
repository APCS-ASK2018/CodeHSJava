public class Grid
{
    // Write your Grid class here
    public static final int
        NUM_ROWS = 10,
        NUM_COLS = 10;
    
    private Location[][] grid = new Location[NUM_ROWS][NUM_COLS];
    
    // Create a new Grid. Initialize each Location in the grid
    // to be a new Location object.
    public Grid() {
        for(int i = 0; i < NUM_ROWS ; i++)
            for(int j = 0; j < NUM_COLS; j++)
                grid[i][j] = new Location();
    }
    
    // Mark a hit in this location by calling the markHit method
    // on the Location object.  
    public void markHit(int row, int col) {
        grid[row][col].markHit();
    }
    
    // Mark a miss on this location.    
    public void markMiss(int row, int col) {
        grid[row][col].markMiss();
    }
    
    // Set the status of this location object.
    public void setStatus(int row, int col, int status) {
        grid[row][col].setStatus(status);
    }
    
    // Get the status of this location in the grid  
    public int getStatus(int row, int col) {
        return grid[row][col].getStatus();
    }
    
    // Return whether or not this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col) {
        return !grid[row][col].isUnguessed();
    }
    
    // Set whether or not there is a ship at this location to the val   
    public void setShip(int row, int col, boolean val) {
        grid[row][col].setShip(val);
    }
    
    // Return whether or not there is a ship here   
    public boolean hasShip(int row, int col) {
        return grid[row][col].hasShip();
    }
    
    
    // Get the Location object at this row and column position
    public Location get(int row, int col) {
        return grid[row][col];
    }
    
    // Return the number of rows in the Grid
    public int numRows() {
        return grid.length;
    }
    
    // Return the number of columns in the grid
    public int numCols() {
        return grid[0].length;
    }
    
    public void addShip(Ship s) {
        int posR = s.getRow();
        int posC = s.getCol();
        int len = s.getLength();
        int dir = s.getDirection();
        if(dir == 0) {
            while(len > 0) {
                setShip(posR,posC++,true);
                len--;
            }
        } else {
            while(len > 0) {
                setShip(posR++,posC,true);
                len--;
            }
        }
    }
    
    
    
    public void printStatus() {
        int c = 0;
        char r = 'A';
        
        String g = " ";
        for(int j = 0;j<numCols();j++)
            g += " " + ++c;
        for(int i = 0;i < numRows(); i++) {
            g += "\n" + r++ + " ";
            for(int j = 0;j<numCols();j++) {
                int stat = getStatus(i,j);
                if(stat == Location.MISSED)
                    g += "O ";
                else if(stat == Location.HIT)
                    g += "X ";
                else
                    g += "- ";
            }
        }
        System.out.println(g);
    }
    
    public void printShips() {
        int c = 0;
        char r = 'A';
        
        String g = " ";
        for(int j = 0;j<numCols();j++)
            g += " " + ++c;
        for(int i = 0;i < numRows(); i++) {
            g += "\n" + r++ + " ";
            for(int j = 0;j<numCols();j++) {
                if(hasShip(i,j))
                    g += "X ";
                else
                    g += "- ";
            }
        }
        System.out.println(g);
    }
}
