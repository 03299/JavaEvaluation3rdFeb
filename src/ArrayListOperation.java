import java.util.ArrayList;
import java.util.Scanner;
//Arraylist operations
public class ArrayListOperation {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=10;

        //Adding 10 elements in arraylist
        System.out.println("Enter 10 elements: ");
        for(int i=0; i<n; i++){
            int tmp=sc.nextInt();
            a.add(tmp);
        }

        //Adding an element at sixth position
        System.out.println("Enter element to add at 6th position: ");
        int x=sc.nextInt();
        System.out.println("After adding element at 6th position: ");
        a.add(5,x);
        System.out.println(a);

        //Add index of each element
        for(int i: a){
            System.out.println("Index of "+i+" is "+ a.indexOf(i));
        }


        //Remove element
        System.out.println("Enter index value of a number which you want to remove: ");
        x=sc.nextInt();
        a.remove(x);
        System.out.println("after remove: ");
        System.out.println(a);

        //Printing subarray
        System.out.println("Sublist from 2 to 7 index: ");
        System.out.println(a.subList(2,8));

        //clear arraylist
        a.clear();
        System.out.println("After clear: ");
        System.out.println(a);
    }


}
