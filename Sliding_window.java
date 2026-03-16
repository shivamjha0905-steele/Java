/* import java.util.*; public class Main { public static void main(String[] args) { Scanner 
scanner = new Scanner(System.in); String n = scanner.nextLine(); int k = 
scanner.nextInt(); int len = n.length(); if (k > len) { System.out.println(0); return; } int sum 
= 0; for (int i = 0; i <= len - k; i++) { int max_digit = 0; for (int j = i; j < i + k; j++) { max_digit = 
Math.max(max_digit, n.charAt(j) - '0'); } sum += max_digit; } System.out.println(sum); } } */
import java.util.Scanner;
public class Sliding_window {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the integer");
    String n = sc.nextLine();
    System.out.println("enter sliding size");
    int k=sc.nextInt();
    int len = n.length();
    if(k>len){
        System.out.println(0);
        return;
    }
    int sum = 0;
    for(int i= 0; i <= len-k; i++){
        int max_digit = 0;
        for(int j =i; j<i+k; j++){
            max_digit = Math.max(max_digit, n.charAt(j) - '0');
        }
        sum  = sum+max_digit;
    }
    System.out.println(sum);
   } 
}
