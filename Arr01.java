 import java.util.Scanner;
public class Arr01 {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
     int number[] = new int[n];
     for(int i=0;i<n;i++){
        number[i] = i+5;
        System.out.println(number[i]);
     }
    }
 }
