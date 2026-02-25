import java.util.Scanner;
public class PercentageCalc {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	int m1,m2,m3,m4,m5;
	System.out.println("Enter the marks");
	m1 = Sc.nextInt();
	m2 = Sc.nextInt();
	m3 = Sc.nextInt();
	m4 = Sc.nextInt();
	m5 = Sc.nextInt();
	double totalM = m1+m2+m3+m4+m5;
	double percentage;
	percentage  = ((totalM/500)*(100));
	if((percentage<=100) && (percentage>=90)) {
		System.out.println("Excellent");
	}
	else if((percentage<=90) && (percentage>=80)) {
		System.out.println("very good");
	}
	else if((percentage<=80) && (percentage>=70)) {
		System.out.println("good");
	}
	else if((percentage<=70) && (percentage>=60)) {
		System.out.println("Can do better");
	}
	else if((percentage<=60) && (percentage>=50)) {
		System.out.println("Average");
	}
	else if((percentage<=50) && (percentage>=40)) {
		System.out.println("Below Average");
	}
	else if((percentage<40) ) {
		System.out.println("Fail");
	}
}
}
