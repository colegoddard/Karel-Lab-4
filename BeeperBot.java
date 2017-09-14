
import kareltherobot.*;

/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeepers();
        }  
    }

    public void collectBeepers() {
        faceEast();
        findABeeperColumn();
        collectColumn();
        returnToFloor();
    }

    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void findABeeperColumn() {
        while(!nextToABeeper()) {
            move();
        }
    }
    
    public void collectColumn() {
        turnLeft();
        pickBeeper();
        move();
        while(nextToABeeper()) {
            pickBeeper();
            move();
        }
    }
    
    public void returnToFloor() {
        turnLeft();
        turnLeft();
        while(frontIsClear()) {
            move();
        }
        collectBeepers();
    }
    
}