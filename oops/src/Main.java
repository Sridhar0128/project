        //abstract class example
 abstract class  Vehicle {
    abstract void method();

    void method1() {
        System.out.println("This is concrete method");
    }
}
    class Car extends Vehicle{
        void method(){
            System.out.println("This is extended method");
        }
    }
    class Bike extends Vehicle{
    void method(){
        System.out.println("Another extended method");
    }
    }
    //encapsulation example program
    class Encapsule{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int num){
        id=num;
    }
    public void setName(String str){
        name=str;
    }
    }
    //Polymorphism example program compile time polymorphism
        class Poly{
            public void method3(int a,int b){
                System.out.println("The given integers are " + a + " and " + b );
            }
        public void method3(double a,double b){

                System.out.println("The given doubles are " + a + " and " + b );
        }
        public void method3(String a,String b){
            System.out.println("The given Strings are " + a +" and "+ b );
        }

    }

    //runtime time polymorphism
    class  Cricket {
        void method() {
            System.out.println("This is the method in the parent class");
        }
    }
        class Football  extends Cricket{
            void method(){
                System.out.println("This is extended method in the first child class");
            }
        }
        class Hockey extends Cricket {
            void method() {
                System.out.println("Another extended method in the second child class");
            }
        }
public class Main {
    public static void main(String[] args) {
        //Abstraction object creation
       Car obj=new Car();
        obj.method();
        obj.method1();
        Bike obj1=new Bike();
        obj1.method();
        System.out.println("\n");

        //Encapsulation object creation
        Encapsule obj2=new Encapsule();
        obj2.setId(20);
        obj2.setName("john");
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
        System.out.println("\n");

        //Polymorphism object creation
        Poly obj3=new Poly();
        obj3.method3(12,24);
        obj3.method3(100.30,200.70);
        obj3.method3("Good","Morning");

        Cricket obj4=new Cricket();
        obj4.method();
        Football obj5=new Football();
        obj5.method();
        Hockey obj6= new Hockey();
        obj6.method();


    }
}