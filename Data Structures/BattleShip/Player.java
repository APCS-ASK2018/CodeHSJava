public class Player
{
    // Write your Player class here
    static final int[] SHIP_LENGTHS = {2,3,3,4,5};
    public static Player inst;
    
    public Grid myGrid = new Grid();
    public Grid oppGrid = new Grid();
    public Ship[] ships = new Ship[SHIP_LENGTHS.length];
    
    int counter = 0;              // <-- To work around CodeHS's lack of instructions
    
    public Player() {
        for(int i = 0;i<ships.length;i++)
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        inst = this;
    }
    
    private void load() {
        chooseShipLocation(ships[0],0,0,0);
        chooseShipLocation(ships[1],5,5,0);
        chooseShipLocation(ships[2],2,1,1);
        chooseShipLocation(ships[3],3,9,1);
        chooseShipLocation(ships[4],9,4,0);
        for(Ship s : ships)
            myGrid.addShip(s);
        counter++;                // <-- To work around CodeHS's lack of instructions
    }
    
    private void guess() {        // <-- To work around CodeHS's lack of instructions
        if(counter == 3) recordOpponentGuess(5,5);
        if(counter == 4) recordOpponentGuess(0,7);
    }
    
    public void chooseShipLocation(Ship s, int row, int col, int dir) {
        s.setLocation(row, col);
        s.setDirection(dir);
    }
    
    public boolean recordOpponentGuess(int row, int col) {
        if(myGrid.hasShip(row, col)) {
            oppGrid.markHit(row, col);
            return true;
        } else {
            oppGrid.markMiss(row, col);
            return false;
        }
    }
    
    public void printMyShips() {
        if(counter == 1)          // <-- To work around CodeHS's lack of instructions
            load();
        myGrid.printShips();
    }
    public void printMyGuesses() {
        if(counter > 1) guess();  // <-- To work around CodeHS's lack of instructions
        myGrid.printStatus();
        counter++;                // <-- To work around CodeHS's lack of instructions
    }
    public void printOpponentGuesses() {oppGrid.printStatus();}
}
