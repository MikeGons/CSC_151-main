package labs.example.mammals;

public class Main {
    public static void main(String[] args) throws Exception{
        Mammal mammal = new Mammal();

        mammal.setName("Dog");
        mammal.eat();

        mammal.sit();
    

    
        
        mammal.stand();
        Dog dog = new Dog();
        dog.bark();
    }

}