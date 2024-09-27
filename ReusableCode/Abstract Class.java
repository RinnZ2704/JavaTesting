abstract class Animal {  //Khai bao abstract class
    abstract void sound(); //Abstract method khong co than ham (Pthuc truu tuong)
    public void sleep() { //Phuong thuc thong thuong co than ham
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The animal barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        Animal myCat = new Cat();
        myCat.sound();
        myCat.sleep();
    }
}