class Animal {
    String name; //Dat name la mot var co tinh chat la dang String
    
    public void eat() { //goi ObjectName.eat se khien print ra ten cua doi tuong + string "is eating", tao ra mot string hoan chinh
        System.out.println(name + " is eating.");
    }

    public void sleep() { //goi ObjectName.sleep se khien print ra ten cua doi tuong + string "is sleeping", tao ra mot string hoan chinh
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public void bark() { //Dog ke thua phuong thuc eat va sleep tu class Animal, Goi bang [TenClass].[PhuongThuc]
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    public void meow() { //Cat cung ke thua phuong thuc eat va sleep tu class Animal & goi bang 
        System.out.println(name + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); //Tao mot object moi ten dog o trong class Dog
        dog.name = "Buddy"; //set name cua dog, ban dau de duong dang var string thanh "Buddy"
        dog.eat(); 
        dog.bark();

        Cat cat = new Cat(); //set name cua cat (Independent), ban dau de duong dang var string thanh "Whiskers"
        cat.name = "Whiskers";
        cat.eat();
        cat.meow();
    }
}
