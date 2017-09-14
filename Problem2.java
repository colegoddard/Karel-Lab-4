
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        checkWalls();
    }
    
    public void checkWalls() {
        turnLeft();
        if (!frontIsClear()) {
            turnRight();
            putBeeper();
            nextSpot();
        }
        if (frontIsClear()) {
            putBeeper();
            nextSpot();
        }
    }
    
    public void nextSpot() {
        if (frontIsClear()) {
            move();
            checkWalls();
        }
        turnRight();
        move();
        if (nextToABeeper()) {
            turnLeft();
            turnLeft();
            move();
            pickBeeper();
            turnRight();
            turnRight();
            move();
            turnLeft();
            move();
        }
        checkWalls();
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

