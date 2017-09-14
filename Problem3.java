 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        checkWindows();
    }
    
    public void checkWindows() {
        move();
        if (nextToABeeper()) {
            turnOff();
        }
        turnLeft();
        if (frontIsClear()) {
            putBeeper();
            turnRight();
            checkWindows();
        }
        turnRight();
        if (!frontIsClear()) {
            turnRight();
            checkWindows();
        }
        checkWindows();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}