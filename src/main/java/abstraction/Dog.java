package abstraction;

public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("dog speak");
    }
    @Override
    public void eat() {
     System.out.println("dog eat");
    }
}
