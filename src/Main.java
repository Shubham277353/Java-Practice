interface Animal {
    void makesSound();

    void sleep();

}

class Dog implements Animal {
    public void makesSound() {
        System.out.println("woof woof");
    }

    public void sleep() {
        System.out.println("zzzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makesSound();
        myDog.sleep();

    }
}