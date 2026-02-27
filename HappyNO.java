package Lec0221_01;
import java.util.Scanner;
public class HappyNO {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	int n=num;
	while(num!=1 && n!=4) {
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum = sum+digit*digit;
			n=n/10;
		}
		n=sum;
	}
	if(n==1)
		System.out.println("Happy number");
	else
		System.out.println("Not happy number");
	sc.close();
	}

}
