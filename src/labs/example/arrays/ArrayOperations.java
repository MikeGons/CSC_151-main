// Michael G.
// 3/3/2025

package labs.example.arrays;

public class ArrayOperations{
    public void ArrayOperations(){

    }
    private static void createNewArray(){
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15};
        int size = odds.length;
        for (int total = 0; total < 8; total++){
            System.out.println("I created a new array and it now has "+ size +" items in it.");
            System.out.println("The array items and their valeus are listed below: " + odds);
        }
    }

    public static void displayArray(){
        
        createNewArray();
    }

    public static void sortArray(int[] sort){
       

        int[] fifty = sort;

        for(int e = 0;e < sort.length-1; e++){
            if(fifty[e] > fifty[e+1]){
                int temp = fifty[e+1];
                fifty[e+1] = fifty[e];
                fifty[e] = temp;
                e=-1;
            }
        }
        System.out.println("The list has been sorted: ");
        for (int e = 0;e<fifty.length;e++){
            System.out.println(fifty[e]);
        }

    }

    public static void getDaysAndMonths(){
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        for (int index = 0; index < 12; index++){

        
        System.out.println("There are " + days[index] + " days in " + months[index]);
        }

    }

    }














