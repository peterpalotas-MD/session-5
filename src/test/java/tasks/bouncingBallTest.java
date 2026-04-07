package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.bouncingBall.ballBounce;

class bouncingBallTest {

    @Test
    public void testBallBounceWorks(){
        //aCCEPTABLE DATA
        double h = 10;
        double bounce = 0.66;
        double window = 1.5;

        int result = ballBounce(h, bounce, window);

        assertEquals(4, result);

    }

    @Test
    public void testBallProblematicHValue() {
        //aCCEPTABLE DATA
        double h = -2;
        double bounce = 0.66;
        double window = 1.5;

        int result = ballBounce(h, bounce, window);

        //the question asks to return -1 if the data is wrong
        assertEquals(-1, result);
    }

    @Test
    public void testWindowAboveH() {
        //aCCEPTABLE DATA
        double h = 3;
        double bounce = 0.66;
        double window = 5;

        int result = ballBounce(h, bounce, window);

        //the question asks to return -1 if the data is wrong
        assertEquals(-1, result);
    }

}