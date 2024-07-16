class animal{
    void color(){
        System.out.println("Animal color");
    }
    void sound(){
        System.out.println("Animal sounds");
    }
}
class dog extends animal{
     void sound(){
        System.out.println("dog barks");
    }
}
  class cat extends animal{
    void structure(){
        System.out.println("cat is small");
    }
     void sound(){
        System.out.println("cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        cat obj=new cat();
        obj.sound();
        obj.color();
        animal obj1=new animal();
        obj1.sound();


    }
}