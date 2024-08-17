import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> numbers1 =Arrays.asList( Arrays.asList(6,4,9,3),Arrays.asList(8,8,56,4));
        List<Integer> numbers = Arrays.asList(8, 2, 4, 0, 19,8,56,4);
                numbers.stream().skip(2).forEach(System.out::println);
                System.out.println("\n");
                numbers.stream().sorted().forEach(System.out::println);
                System.out.println("\n");
                numbers.stream().distinct().forEach(System.out::println);
        System.out.println("\n");

        List<String> name = Arrays.asList("joe","tiger","lion","sun");
        name.stream().filter(s -> s.startsWith("s")).forEach(System.out::println);
        System.out.println("\n");
        name.stream().limit(2).forEach(System.out::println);
        System.out.println("\n");
        name.stream().map(String::length).forEach(System.out::println);
        System.out.println("\n");
        numbers1.stream().flatMap(List::stream).forEach(System.out::println);
        System.out.println("\n");
        numbers.stream().peek(n -> {
            System.out.print("Elements is : ");
            
        }).forEach(System.out::println);

        numbers.stream()
                .peek(n ->System.out.print("Elements is : "))
                .forEach(System.out::println);


        System.out.println("\n");
        System.out.println("terminal operations");

        name.stream().forEach(System.out::println);
        System.out.println("\n");


        long count=name.stream().count();
        System.out.println(count);
        System.out.println("\n");

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("\n");

        boolean allmatch=numbers.stream().allMatch(n->n%2==0);
        System.out.println(allmatch);
        System.out.println("\n");

        boolean anymatch=numbers.stream().anyMatch(n->n%2==0);
        System.out.println(anymatch);
        System.out.println("\n");

        Optional<String> firstName=name.stream().findFirst();
        firstName.ifPresent(System.out::println);




    }
        }



