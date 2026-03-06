package Arrays;
import java.util.Scanner;
public class TB01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
int marks[] = {50, 60, 70, 80, 90};

int marks1[] = new int[5];
for(int i=0;i<5;i++) {
	marks1[i] = Integer.bitCount(sc.nextInt());
	
}
System.out.println(marks1[]);
System.out.println(marks[3]);
	}

}
