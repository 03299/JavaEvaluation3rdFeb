import java.util.InputMismatchException;
import java.util.Scanner;
//Merge Sort
public class MergeSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements : ");
            try{
            for (int i = 0; i < n; i++) {
                   a[i] = sc.nextInt();
            }}catch(InputMismatchException e){
                System.out.println("Invalid number");
            }

        System.out.println("Before Sorting..");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        divideArray(a,0,n-1);
        System.out.println("\nAfter Sorting..");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void divideArray(int[] arr , int s , int e){
        if(s>=e)
            return;
        int mid = (s + e)/2;
        divideArray(arr , s , mid);
        divideArray(arr,mid+1, e);
        mergeArray(arr,s,e);
    }

    public static void mergeArray(int[] arr , int s , int e){
        int mid = (s + e)/2;
        int len1 = mid - s + 1;
        int len2 = e - mid;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int originalArrayIndex = s;
        for(int i = 0; i < len1; i++){
            arr1[i] = arr[originalArrayIndex++];
        }
        for(int i = 0; i < len2; i++){
            arr2[i] = arr[originalArrayIndex++];
        }
        originalArrayIndex = s;

        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                arr[originalArrayIndex++] = arr1[idx1++];
            }
            else {
                arr[originalArrayIndex++] = arr2[idx2++];
            }
        }
        while(idx1 < len1){
            arr[originalArrayIndex++] = arr1[idx1++];
        }
        while(idx2 < len2){
            arr[originalArrayIndex++] = arr2[idx2++];
        }
    }
}

