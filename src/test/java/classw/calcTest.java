package classw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calcTest {

    @Test
    public void testDivideGivesCorrectResult(){
        calc c = new calc();
        //divide(10,5) = 2
        assertEquals((int) 2,c.divide(10, 5));
    }

    @Test
    public void testDivideThrows(){
        calc c = new calc();
        //divide (x, 0) should throw an error
        assertThrows(IllegalArgumentException.class, () -> c.divide(10, 0));
    }


}