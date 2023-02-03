import java.util.Scanner;
//count occurence of a given character in a string
public class CountCharOccurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s=sc.next();
        System.out.println("Enter character for finding occurence: ");
        char c=sc.next().charAt(0);

        int n=s.length(),count=0;
        for(int i=0; i<n; i++){
            if(c==s.charAt(i)){
                count++;
            }

        }
        System.out.println("Number of occurence of "+c+" is "+count);
    }
}
