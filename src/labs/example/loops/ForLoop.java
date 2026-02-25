/* 
Name: Michael Gonsalves
Date: 2/25/2026
Reason: Experimenting with different types of loops, mostly while loops in the java class. This will be my first program with while loops inside of it.
*/
package labs.example.loops;

public class ForLoop {
    public static void main(String[] args){
        executeForLoop();
    }

    private static void executeForLoop(){
        int counter;
        for (counter = 0; counter <= 20; counter++)
        System.out.println("This loop has looped " + counter + " times!");
    }
}