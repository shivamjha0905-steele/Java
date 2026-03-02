import java.util.Scanner;
public class SumOfArrElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum=0;
       int number[];
       number = new int[n]; 
       for(int i=0;i<n;i++){
        number[i]=i;
        sum=sum+number[i];
        System.out.println(sum);
       }
       
    }
}
