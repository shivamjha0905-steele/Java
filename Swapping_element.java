import java.util.Scanner;
public class Swapping_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        int n = a.length;
        for(int s =0; s<n; s++){
            System.out.println("enter the elements");
            a[s] = sc.nextInt();
        }
        int temp;
        temp = a[0];
        a[0] = a[n-1];
        a[n-1] = temp;
        System.out.println("final array is");
        for(int num : a){
            System.out.println(num +" ");
        }
    }
}
