package Lec0221_01;
import java.util.Scanner;
public class DuckNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		while(num!=0) {
			int rem = num%10;
			if(rem==0)
			{
				flag = true;
				break;
			}
			num = num/10;
		}
		if(flag==true)
			System.out.println("Duck number");
		else
         System.out.println("not a duck no.");
	}

}
