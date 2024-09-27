interface Animal { //Khai bao Interface
    void sound();  //Phuong thuc truu tuong/abstract khong co than ham
    void eat();
}

class Dog implements Animal {
    @Override //Ghi de phuong thuc sound
    public void sound() {
        System.out.println("The dog barks");
    }

    @Override //Ghi de phuong thuc eat
    public void eat() {
        System.out.println("The dog eats");
    }
}
class Cat implements Animal {
    @Override  //Ghi de phuong thuc sound (See more about Priorities)
    public void sound() {
        System.out.println("The cat meows");
    }

    @Override //Ghi de phuong thuc eat
    public void eat() {
        System.out.println("The cat eats");
    }
}

public class Main { //Lop chinh de chay chuong trinh
    public static void main(String[] args) {
        Animal myDog = new Dog(); //tao object moi myDog
        myDog.sound(); //Goi phuong thuc sound va eat
        myDog.eat(); //Print ra 2 String nhu tren
        Animal myCat = new Cat();
        myCat.sound();
        myCat.eat();
    }
}
