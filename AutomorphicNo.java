package Lec0221_01;
import java.util.Scanner;
public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int count=0;
		 int square =(int)Math.pow(num, 2);
	//	 int digits = String.valueOf(num).length();
		 while(num!=0) {
			 int rem = num%10;
			 count++;
			 num= num/10;
		 }
		 int lastDigits = square%(int)Math.pow(10,count);
		if(lastDigits==n) {
			System.out.println("Automorphic number");
		}
		else
			System.out.println("Not Automorphic no.");
	}

}
