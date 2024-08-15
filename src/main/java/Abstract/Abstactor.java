package Abstract;

abstract class Animal {
    public abstract void makeSound();

    // Regular method
    public void duckeat() {
        System.out.println("This Duck is eating.");
    }
    public void cateat() {
        System.out.println("This cat is eating.");
    }
    public void dogeat() {
        System.out.println("This Dog is eating.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Duck!");
    }
}

