import java.util.Scanner;
//Delete Nth node from the Linked List
class node{
    int data;
    node next;
}
public class DeleteNthNodeInLinkedList{
    static node head;
    static node temp;
    static int choice=1;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(choice==1){
            node n=new node();
            System.out.println("Enter element: ");
            n.data=sc.nextInt();
            if(head==null){
                head=temp=n;
            }
            else{
                temp.next=n;
                temp=n;
            }
            System.out.println("Do you want to continue press (yes:1 and no:0): ");
            choice=sc.nextInt();
        }
        System.out.println("List created");
        print();
        System.out.println("\nEnter element which you want to remove: ");
        int x;
        x=sc.nextInt();
        System.out.println("After Deleteing : ");
        remove(x);

    }
    public static void print(){
        temp=head;
        System.out.println("List is: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void remove(int x){
        temp=head;
        System.out.println("List is: ");
        while(temp!=null){
            if(temp.data!=x) {
                System.out.print(temp.data + " ");
            }
            temp=temp.next;
        }
    }
}
