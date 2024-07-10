import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        i=sc.nextInt();
        if(i%2==0){
            System.out.println("Entered number is even ");
        }
        else{
            System.out.println("Entered number is odd");
        }
        System.out.println("\n");
        int f;
        System.out.println("Enter the another number");
        f=sc.nextInt();
        if(f>i){
            System.out.println("f is greater than i");
        }
        else {
            System.out.println("i greater than f");
        }

    }
}