package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.sumOfSequenceTask.sumOfSequence;

class sumOfSequenceTaskTest {

    @Test
    public void testSumWorks(){
        //sumOfSequence(2, 6, 2)
        int begin = 2;
        int end = 6;
        int step = 2;

        int result = sumOfSequence(begin,end,step);
        assertEquals(12,result);

        //sumOfSequence(1, 4, 1)
        begin = 1;
        end = 4;
        step = 1;

        result = sumOfSequence(begin,end,step);
        assertEquals(10,result);
    }



}