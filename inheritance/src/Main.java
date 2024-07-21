class Circle{
    void  shape(){
        System.out.println("The Parent class");
    }
}
class Square extends Circle{
    void area(){
        System.out.println("This is the single Inheritance ");
    }
}
class Rectangle extends Square {
    void color(){
        System.out.println("This is Multilevel Inheritance");
    }
}
//Hierarchical Inheritance
class Sphere extends Circle{
    void function (){
        System.out.println("This is Hierarchical Inheritance");
    }
}
class Cone extends Circle{
    void method(){
        System.out.println("This is another Hierarchical Inheritance");
    }
}
//hybrid inheritance
interface A{
    void run();
}
interface B extends A{
    void charge();
}
interface C extends A{
    void walk();
}
class D implements C,B{
    public void run(){
        System.out.println("This is runnable");
    }
    public void charge(){
        System.out.println("This is chargable");
    }

    public void walk(){
        System.out.println("This is walkable");
    }

}
//multiple inheritance
    interface Inter{
        void interMethod();
    }

    interface Inter1{
        void anotherMethod();
    }

    class abc implements Inter, Inter1 {
        public void interMethod() {
            System.out.println("This is inherited interface");
        }
        public void anotherMethod() {
            System.out.println("This is another inherited interface");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Rectangle ob = new Rectangle();
            System.out.println("------Single Inheritance------");
            ob.shape();
            ob.area();
            System.out.println("\n");

            System.out.println("------Multilevel Inheritance------");
            ob.shape();
            ob.area();
            ob.color();
            System.out.println("\n");

            System.out.println(" ------Hierarchical inheritance------");
            Sphere obj1 = new Sphere();
            obj1.shape();
            obj1.function();
            Cone obj2 = new Cone();
            obj2.method();
            System.out.println("\n");

            D obc = new D();
            System.out.println("------Hybrid Inheritance------");
            obc.run();
            obc.charge();
            obc.walk();

            System.out.println("\n");
            System.out.println(" ------Multiple inheritance------");
            abc obj = new abc();
            obj.interMethod();
            obj.anotherMethod();
        }
    }
