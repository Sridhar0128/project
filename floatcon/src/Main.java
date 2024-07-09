import java.util.*;
public class Main {
    public static void main(String[] args) {
      double f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        f=sc.nextDouble();
        if (f>=1.40239846e-45f && f<=3.40282347e+38f){
            System.out.println("Entered number is float");
        }
        else{
            System.out.println("Entered number is double");
        }

        //type conversion
        float a=3.14f;
        double g=127.5678678;
        double d =(double)a;
        float s=(float)g;
        System.out.println(d);
        System.out.println(s);
        }


    }
