/* Name: Michael Gonsalves
    Date: 1/28/2025
    Purpose: Constructing a class that has several methods and properties relating to mammals.
*/
package labs.example.mammals;
public class Mammal {



private String hairColor = "Black";
private String eyeColor = "Blue";
private double bodyTemp = 89;
private String height = "1 ft";
private String weight = "26 lb" ;
private String species = "Lab";

public void getMammalDetails(){
    System.out.println(this.hairColor);
    System.out.println(this.eyeColor);
    System.out.println(this.bodyTemp);
    System.out.println(this.height);
    System.out.println(this.weight);
    System.out.println(this.species);
}


public void scratch(){

}

public void run(){

}

public void eat(){

}

public void drink(){

}

/*public void sleep() throws Exception{
    int sleepTime = 5000;
    System.out.println("The " + this.name + " is sleeping and will wake up in " sleepTime/1000 " seconds");
}
*/
public void jump(){

}

public void fight(){

}

/*public void setName(String name){
    this.name = name;
    return;
}

public String getName(){
    return this.name;
}
*/
public void swim(){

}

public void walk(){

}

public void sit() throws Exception{
    Thread.sleep(15000);
    System.out.println("The mammal is no longer sitting");
    Thread.sleep(5000);
    stand();
}
public void stand(){
    System.out.println("The mammal is now up and barking");
}


}