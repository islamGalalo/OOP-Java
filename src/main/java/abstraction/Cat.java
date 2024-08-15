package abstraction;

public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("cat speak");
    }

    @Override
    public void eat() {
     System.out.println("cat eat");
    }
}
