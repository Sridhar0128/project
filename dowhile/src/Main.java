import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int i=0;
       do{
           i++;
            if(i==5) {
                break;
            }else if(i>8){
                continue;
            }
            System.out.println(i);
        }while(i<=10);


    }
}