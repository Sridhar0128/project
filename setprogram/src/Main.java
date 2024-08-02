import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class hashset{
    HashSet hs=new HashSet<>();
    void method1(){
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(1);
        System.out.println(hs);

        System.out.println("Given element is present : "+hs.contains(4));
        System.out.println(hs.clone());

        hs.remove(4);
        System.out.println("Removing : "+hs);
        System.out.println("Size of the set : "+hs.size());

        Iterator iv=hs.iterator();
        while(iv.hasNext()){
            System.out.print(iv.next()+" ");
        }
        System.out.println();
        hs.clear();
        System.out.println("Clear the set : "+hs);

        System.out.println("Checking the set is empty or not : "+hs.isEmpty());
    }
}
class linkedHashset{
    LinkedHashSet lh=new LinkedHashSet();
    LinkedHashSet lh1=new LinkedHashSet();
    void method(){
        lh.add("dog");
        lh.add("cat");
        lh.add("cow");
        lh.add("deer");
        System.out.println(lh);
        System.out.println(lh.contains("dog"));
        System.out.println(lh.clone());
        lh.remove(4);
        System.out.println(lh);
        System.out.println(lh.size());

        lh1.add("Dog");
        lh1.add("Cat");
        lh.addAll(lh1);
        System.out.println("After adding two sets : "+lh);
        lh.retainAll(lh1);
        System.out.println(lh);
        //lh.containsAll(lh1);
        System.out.println(lh.containsAll(lh1));
        lh.removeAll(lh1);
        System.out.println(lh);
        System.out.println("Checking the set is empty or not : "+lh.isEmpty());
    }
}
class TreeSet1{
    TreeSet ts=new TreeSet<>();
    void method(){
        ts.add(5);
        ts.add(90);
        ts.add(50);
        ts.add(67);
        ts.add(23);
        ts.add(78);
        ts.add(55);
        System.out.println("Ascending order : "+ts);
        Iterator iv=ts.descendingIterator();
        System.out.print("Descending order : ");
        while(iv.hasNext()){
            System.out.print(iv.next()+" ");
        }
        System.out.println();
        System.out.println(ts.descendingSet());
        System.out.println("First element : "+ts.first());
        System.out.println(ts.ceiling(22));
        System.out.println(ts.floor(22));
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hash set methods");
        hashset aa=new hashset();
        aa.method1();
        System.out.println("\n");
        System.out.println("linked Hash set methods");
        linkedHashset abc=new linkedHashset();
        abc.method();
        System.out.println("\n");
        System.out.println("Tree set methods");
        TreeSet1 ab=new TreeSet1();
        ab.method();
    }
}