class Animal{
    void color(){
        System.out.println("Animal color");
    }
    void sound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{
     void sound(){
        System.out.println("dog barks");
    }
}
  class Cat extends Animal{
    void structure(){
        System.out.println("cat is small");
    }
     void sound(){
        System.out.println("cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.sound();
        obj.color();
        Animal obj1=new Animal();
        obj1.sound();


    }
}
