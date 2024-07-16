public class Main {
    //static method
     static void staticMethod(){
         System.out.println("This is the static method");
     }
     //Instance Method
     void instanceMethod(){
         System.out.println("This is instance method");
     }
     //return method
     public int returnMethod(){
         return 10;
     }
     //overloaded Method
    public void overloadMethod(int x){
         System.out.println(x);
    }
    public void overloadMethod(String x){
        System.out.println(x);
    }
    public static void main(String[] args) {
         staticMethod();
         //instance method calling
         Main obj=new Main();
         obj.instanceMethod();
         //return method calling
         System.out.println(obj.returnMethod());
         //System.out.println(obj.returnMethod());
         //overload method calling
         obj.overloadMethod(15);
         obj.overloadMethod("happy");
    }
}