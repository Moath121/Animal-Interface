public class Main {
    public static void main(String[] args) {

    }
}



interface Animal{

    void eat();
    void makeSound();

}

class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Chicken");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("Seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("whistle");
    }
}