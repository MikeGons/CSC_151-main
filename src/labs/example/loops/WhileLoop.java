/* 
Name: Michael Gonsalves
Date: 2/25/2026
Reason: Experimenting with different types of loops, mostly while loops in the java class. This will be my first program with while loops inside of it.
*/
package labs.example.loops;

public class Whileloop{
    public static void main(String[] args){
        executeWhileLoop();
    }

    private static void executeWhileLoop(){
        int num = 0
        while (num < 10) {
            num++;
        }
        System.out.println("The loop looped " + num + " times");
        return;
    }
}