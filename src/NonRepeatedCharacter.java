import java.util.Scanner;
//Find first non repeating character
public class NonRepeatedCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();

        for(int i=0; i<str.length(); i++){
            int flag=1;
            for(int j=0 ; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("The first non repeated character is: ");
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
