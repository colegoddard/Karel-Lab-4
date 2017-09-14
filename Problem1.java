
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        checkWall();
    }
    
    public void checkWall() {
        if (!frontIsClear()) {
            turnLeft();
        }
        progressAlongWall();
    }
    
    public void progressAlongWall() {
        while (frontIsClear()) {
            move();
            turnRight();
            if (frontIsClear()) {
                move();
                move();
            }
        }
        checkWall();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

