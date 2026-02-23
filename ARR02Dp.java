package Arrays;
import java.util.Scanner;
public class ARR02Dp {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("No of Subjects: ");
	int n = sc.nextInt();
	int tot=0;
	int[] marks = new int[n];
	for(int i =0;i<n;i++) {
		System.out.println("Enter Marks: ");
		marks[i] = sc.nextInt();
		tot += marks[i];
	}
	
//	for(int i = 0;i<n;i++)
	
	System.out.println("Total marks="+tot);
	double percent = tot/n;
	System.out.println("Percentage = "+percent);
	}

}
