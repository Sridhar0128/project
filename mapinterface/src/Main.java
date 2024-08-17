
import java.util.*;

class hashmap{
    HashMap<Integer,String> dc=new HashMap();
    void method(){
        dc.put(1,"football");
        dc.put(2,"cricket");
        dc.put(3,"hockey");
        System.out.println(dc.keySet());

        System.out.println(dc.clone());
        dc.replace(2,"Tennis");
        System.out.println(dc);
        dc.remove(3);
        System.out.println(dc);
        dc.compute(1,(k,v)->v.concat("sport"));
        dc.compute(2,(k,v)->v.concat("team"));
        System.out.println(dc);

    }
}
class linked_hashmap{
    LinkedHashMap lm=new LinkedHashMap();
    void method1(){
        lm.put(1,"car");
        lm.put(2,"bike");
        lm.put(3,"truck");
        lm.entrySet();
        System.out.println(lm);
        System.out.println(lm.containsKey(3));
        System.out.println(lm.containsValue("car"));

        System.out.println(lm.values());
        lm.clear();

        System.out.println(lm.isEmpty());
    }
}
class treemap{
    TreeMap dc=new TreeMap();
    void method2(){
        dc.put(3,"papaya");
        dc.put(1,"apple");
        dc.put(2,"orange");

        dc.put(4,"perry");
        System.out.println(dc);
        System.out.println(dc.containsKey(3));
        System.out.println(dc.containsValue("perry"));
        System.out.println(dc.firstKey());
        System.out.println(dc.lastKey());
        System.out.println(dc.size());
        TreeMap dm=new TreeMap(dc);
        dc.putAll(dm);
        System.out.println(dm);

        System.out.println(dc.values());
        System.out.println(dc.get(2));
        dc.remove(2);
        System.out.println(dc);
        dc.clear();
        System.out.println(dc);

    }
}
public class Main{
    public static void main(String args[]){
        hashmap hm=new hashmap();
        System.out.println("Hash map methods");
        hm.method();
        System.out.println("\n");

        linked_hashmap lm=new linked_hashmap();
        System.out.println("Linked Hash map methods");
        lm.method1();
        System.out.println("\n");

        treemap tm=new treemap();
        System.out.println("Tree map methods");
        tm.method2();

    }
}