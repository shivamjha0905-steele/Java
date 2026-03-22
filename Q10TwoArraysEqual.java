import java.util.Scanner;
public class Q10TwoArraysEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
       int arr1[] = new int[s];
       int arr2[]  = new int[s];
       //input of 1st array
       System.out.println("enter the elements of first array");
       for(int i=0; i<arr1.length; i++){
       
        arr1[i] = sc.nextInt();
       }
        //input of 2nd array
       for(int i=0; i<arr2.length; i++){
       System.out.println("enter the elements of second array");
        arr2[i] = sc.nextInt();
       } 
       boolean isEqual = true;
       for(int i =0; i<s; i++){
        if(arr1[i]!=arr2[i])
            isEqual = false;
       }
       if(isEqual)
        System.out.println("Both the arrays are equal");
    else
        System.out.println("Arrays are not equal");
    }
}
