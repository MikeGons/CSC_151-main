// Michael G.
// 2/26/2025


package labs.example.loops;


public class WhileLoop{
    public void WhileLoop(){
       
    }

    private void executeWhileLoop(){
        double counter = 0;
        while(counter < 10){
            System.out.println("Processing Total: " + counter);
            counter ++;
        

        }
        if(counter == 10){
            System.out.println("All Done!");
        }
    }

    public void callingWhileLoop(){
        executeWhileLoop();
    }
}