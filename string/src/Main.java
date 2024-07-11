import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        StringBuilder convertedWord = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                convertedWord.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                convertedWord.append(Character.toLowerCase(c));
            } else {
                convertedWord.append(c);
            }
        }
        System.out.println("Converted word: " + convertedWord);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
       System.out.println("\n");

        char c;
        for (int i = 0; i < str.length(); i++) {
            c =str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                continue;
            } else {
                System.out.print(c);
            }
        }
        System.out.println("\n");
        StringBuffer obj=new StringBuffer(str);
        obj.delete(1,3);
        System.out.println(obj);
        obj.insert(1,3);
        System.out.println(obj);

        StringBuilder abc=new StringBuilder("apple");
        abc.reverse();
        System.out.println(abc);
        StringBuilder abcd=new StringBuilder("apple");
        abcd.replace(1,2,"x");
        System.out.println(abcd);




    }
}
