//Name: Michael Gonsalves
//Date: 1/29/2025
//Desc: Learning about classes and how to properly make them.

package labs.example.mammals;

public class Mammal {

protected String hairColor;
protected String eyeColor;
protected String bodyTemp;
protected String gender;
protected String numOfLegs;
protected String name;
protected String age;
protected String habitat;
protected String birthDay;
protected String weight;
protected String height;


public void mammal(String name){

}

public void setName(String name){
    this.name = name;
    
}

public void eat(){
    System.out.println("The " + this.name + " Is now eating....");
}

public void sleep(){

}

public void drink(){

}

public void sit() throws Exception{
    System.out.println("The " + this.name + " Is now sitting...");
    Thread.sleep(15000);
}

public void run(){

}

public void sniff(){

}

public void scratch(){

}

public void spin(){

}

public void climb(){

}

public void stand(){
    System.out.println("The " + this.name + " Has stood up");
}

public void getMammalDetails(){
    System.out.println(this.hairColor);
    System.out.println(this.eyeColor);
    System.out.println(this.habitat);
    System.out.println(this.bodyTemp);
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.gender);
    System.out.println(this.height);
    System.out.println(this.weight);
    System.out.println(this.numOfLegs);
    System.out.println(this.birthDay);

}

}