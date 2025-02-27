// Michael G.
// 2/26/2025


package labs.example.loops;

public class Main{
    public static void main(String[] args){
        WhileLoop whileLoop = new WhileLoop(); 
        whileLoop.callingWhileLoop();
        ForLoop forLoop = new ForLoop();
        forLoop.CallingForLoop();

       int decrementedSum = forLoop.callSumTwoNumbers(2, 2);
        --decrementedSum;
        System.out.println("Sum has been decremented: "+ decrementedSum);

        int loopSum = forLoop.callSumLoopCounter(10);
        System.out.println("The total sum is: " + loopSum);
    
       forLoop.callPrintMultiplicationTable(1);


    }
}