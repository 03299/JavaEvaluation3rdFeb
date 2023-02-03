import java.util.PriorityQueue;
//PriorityQueue Operations
public class PriorityQueueOperation{
    public static void main(String args[]){
        PriorityQueue<Integer> p=new PriorityQueue<>();

        //Adding 5 element
        p.add(12);
        p.add(12);
        p.add(56);
        p.add(13);
        p.add(89);
        System.out.println(p);

        //Print all Values
        System.out.println("\nElements :");
        for(int i: p){
            System.out.println(i);
        }

        //Remove an element
        System.out.println("Element removed from queue is:");
        System.out.println(p.poll());

        //Printing Final PriorityQueue
        System.out.println("FINAL Queue IS: ");
        System.out.println(p);
    }
}
