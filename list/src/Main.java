import java.time.*;
import java.time.LocalTime;
import java.util.*;

class ArrayListEx {
    ArrayList<String> fruit = new ArrayList<>();

    void addMethod() {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        ArrayList arr2 = new ArrayList<Integer>();
        //Adding the element
        fruit.add("mango");
        fruit.add("apple");
        System.out.println("Adding the element " + fruit);

        //index based adding
        fruit.add(1,"papaya");
        System.out.println("Adding papaya to index 1 "+ fruit);

        //changing the elements
        fruit.set(2,"change");
        System.out.println("Changing the elements "+fruit);

        System.out.println("Get the element at index 1 "+fruit.get(1));
        Collections.sort(fruit);
        System.out.println("Sorting "+fruit);

        System.out.println("Size "+fruit.size());

        System.out.println("Checking the list contains mango : "+fruit.contains("mango"));

        System.out.println("Cloning list : "+fruit.clone());
        System.out.println(fruit.indexOf("papaya"));
        int [] arr= {1,2,3,4,5};
        System.out.println("integer : "+arr.toString());
        Object[] ob=fruit.toArray();
        System.out.println("Array");
        for(Object o:ob){
            System.out.println(o);
        }
        //remove method
        fruit.remove(1);
        System.out.println("Index removing "+fruit);
        fruit.remove("papaya");
        System.out.println("Object removing "+fruit);
        System.out.println(fruit.toString());

        fruit.clear();
        System.out.println("Cleared list "+fruit);

        System.out.println("Checking the list is empty : "+fruit.isEmpty());

    }

}
class LinkedList1{
    LinkedList<Integer> ll=new LinkedList<>();
    void linkedMethod(){
        ll.add(10);
        ll.add(11);
        ll.add(12);
        System.out.println("Adding elements : "+ll);

        ll.add(2,4);
        System.out.println("Index based adding : "+ll);
        ll.addFirst(1);
        System.out.println("Add first element : "+ll);
        ll.addLast(15);
        System.out.println("Add Last element : "+ll);

        System.out.println("Getting first element "+ll.getFirst());

        System.out.println("Getting first element "+ll.getLast());

        ll.offerFirst(0);
        System.out.println("Adding element at first : "+ll);
        ll.offerLast(20);
        System.out.println("Adding element at last : "+ll);

        //System.out.println(ll.peek());
        System.out.println("First element in the list is : "+ll.peekFirst());
        System.out.println("Last element in the list is : "+ll.peekLast());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println("After the polling first and last : "+ll);


        ll.push(3);
        ll.push(4);
        ll.push(5);
        System.out.println("After pushing : "+ll);
        System.out.println(ll.pop());
        System.out.println(ll);

    }
}
class Vector1{
    Vector<String>vs=new Vector();
    void vectorMethod(){
        vs.add("1");
        vs.add("2");
        vs.add("3");
        System.out.println("Adding : "+vs);
        vs.addElement("lion");
        System.out.println("Adding element : "+vs);
        System.out.println(vs.capacity());
        System.out.println("Clone : "+vs.clone());
        System.out.println("Display element at : "+vs.elementAt(2));
        System.out.println(vs.hashCode());
        System.out.println(vs.removeElement("lion"));
        System.out.println("After removing : "+vs);
        System.out.println(vs.size());
        vs.setSize(5);
        System.out.println(vs);
        System.out.println(vs.contains("2"));
        System.out.println(vs.indexOf("1"));
        vs.insertElementAt("4",3);
        System.out.println(vs);
        System.out.println("using iterator ; ");
        Iterator iv=vs.iterator();
        while(iv.hasNext()){
            System.out.println(iv.next());
        }

        vs.clear();
        System.out.println("clear : "+vs);
        System.out.println(vs.isEmpty());
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayListEx as=new ArrayListEx();
        System.out.println("Array list Methods");
        as.addMethod();
        System.out.println("\n");

        LinkedList1 ll=new LinkedList1();
        System.out.println("Linked list Methods");
        ll.linkedMethod();
        System.out.println("\n");

        System.out.println("Vector Methods");
        Vector1 vs=new Vector1();
        vs.vectorMethod();

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println("\n");
        LocalDateTime obj=LocalDateTime.now();
        System.out.println(obj);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
    }
}