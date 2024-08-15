package Abstract;

public class main {
    public static void main(String[] args) {
       Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();


        duck.makeSound();
        duck.duckeat();

        dog.makeSound(); // Outputs: Woof!
//        dog.eat();       // Outputs: This animal is eating.
//
        cat.makeSound(); // Outputs: Meow!
//        cat.eat();       // Outputs: This animal is eating.

    }
}