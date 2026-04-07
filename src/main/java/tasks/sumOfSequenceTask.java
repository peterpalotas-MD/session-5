package tasks;


/*

Given you have a begin, end and step set of arguments.
Your task is to write a function that takes these non-negative numbers and returns the sum of integers from begin to end that increase by the number of step.
If begin is greater than end, the function should return 0.


Examples:

sumOfSequence(1, 4, 1) // returns 10 because 1 + 2 + 3 + 4
sumOfSequence(2, 6, 2) // returns 12 because 2 + 4 + 6

 */
public class sumOfSequenceTask{

    static void main() {
        //System.out.println(sumOfSequence(1, 100000, 2));

    }

    //This function is my implementation of the gaussian sum with steps (Essentially arithmetic series)
    //computes sum with steps in O(1) time instead of the O(n) solution that for(int i = begin; i<=end; i+=step)
    public static int sumOfSequence(int begin, int end,int step){

        int numberOfTerms = ((end-begin)/step)+1;//3

        //this is the last term
        int actualLast = begin + (numberOfTerms-1) * step;

        //finally get the result
        return numberOfTerms * (begin + actualLast) / 2;

        //IT WORKSSS!!¡
    }
}
