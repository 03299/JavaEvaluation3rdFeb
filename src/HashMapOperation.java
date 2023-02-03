import java.util.HashMap;
import java.util.Map;
//HashMap Operations
public class HashMapOperation {
    public static void main(String args[]){

        HashMap<Integer, String> h=new HashMap<>();
        //Adding elements to hashmap
        h.put(1,"Aman");
        h.put(2,"Kashi");
        h.put(3,"navi");
        h.put(4,"himansh");
        h.put(5,"jais");
        h.put(6,"sara");
        h.put(7,"jai");
        h.put(8,"noor");
        h.put(9,"ravi");
        h.put(10, "Kashi");

        //Printing keys
        System.out.println("Keys: ");
        for(Map.Entry e: h.entrySet()){
            System.out.println(e.getKey());
        }
        //Printing Values
        System.out.println("Values: ");
        for(Map.Entry e: h.entrySet()){
            System.out.println(e.getValue());
        }

        //Find length
        System.out.println("Length of Hashmap: "+h.size());

        //Replace a value
        System.out.println("after replacement: ");
        h.replace(2,"Kashi","Jahnvi");
        System.out.println(h);

        //Remove a key value pair
        h.remove(9,"ravi");
        System.out.println("After removing; ");
        System.out.println(h);

        //Clear
        h.clear();
        System.out.println("After Clearing all elements: ");
        System.out.println(h);
    }
}
