import java.util.Vector;
import java.util.Scanner;
//Vector Operations
public class VectorOperation {
    public static void main(String args[]){
        Vector<Integer> v=new Vector<>();

        //Adding elements
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        for(int i=0; i<5; i++){
            int tmp=sc.nextInt();
            v.add(tmp);
        }

        //Adding an element
        System.out.println("Enter number which you want to add at 3th position: ");
        int x=sc.nextInt();
        v.add(2,x);
        System.out.println("After adding: ");
        System.out.println(v);

        //Contains Operation
        System.out.println("Enter element which you want to check: ");
        x=sc.nextInt();
        System.out.println("Number is present : "+v.contains(x));

        //Printing value for 4th and 8th position
        int count=0;
        for(int i: v){
            if(count==3){
                System.out.println("Element at 4th position: "+i);
            }
            if(count==7){
                System.out.println("Element at 8th position: "+i);
            }
        }

        //Remove element at 4th position
        System.out.println("Remove element at 4th position: ");
        v.remove(3);
        System.out.println(v);



    }
}
