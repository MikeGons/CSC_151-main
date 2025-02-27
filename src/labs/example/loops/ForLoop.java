// Michael G.
// 2/26/2025


package labs.example.loops;
public class ForLoop{
    public void ForLoop(){
       
    }

    private void executeForLoop(){
        for (int total = 0; total <20; total++)
        System.out.println("Total Iterations: " + total);

    }

    private int sumLoopCounter(int Loops){
       int sum = 0 ;
        for(int times = 1; times <= Loops; times++){
            sum = times + sum; 

        }
        return sum;

    }

    private void printMultiplicationTable(int number){
        int product= 0;
        for(int total = 0; total <= 12; total ++){
            product = total * number;
            System.out.println(number + " * " + total + " = " + product);
        }
    }

    public void callPrintMultiplicationTable(int number){
        printMultiplicationTable(number);
    }



    
    public int callSumLoopCounter(int Loops){
        int sum;
        sum = sumLoopCounter(Loops);
        return sum;
    }

    private int sumTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public int callSumTwoNumbers(int num1, int num2){
        int sum;
        sum = sumTwoNumbers(num1, num2);
        return sum;
    }



   

    public void CallingForLoop(){
        
       executeForLoop();

    }
}