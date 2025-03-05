// Michael G.
// 3/3/2025

package labs.example.arrays;

public class Main{
    public static void main(String[] args){
        ArrayOperations arrayOperations = new ArrayOperations();
        ArrayOperations.displayArray();

         int[] fifty = {23, 5, 78, 12, 42, 7, 91, 55, 103, 56,
    33, 67, 84, 15, 91, 29, 38, 49, 18, 64,
    22, 0, 59, 31, 61, 87, 24, 14, 68, 39,
    102, 82, 73, 98, 47, 65, 50, 8, 9, 11,
    44, 16, 25, 3, 10, 17, 100, 6, 88, 70};
    arrayOperations.sortArray(fifty);
    arrayOperations.getDaysAndMonths();
    }
}