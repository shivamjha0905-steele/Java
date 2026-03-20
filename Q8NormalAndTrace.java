import java.util.Scanner;
public class Q8NormalAndTrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("ENter the rows and cols of matrix");
int r = sc.nextInt();
int c = sc.nextInt();
if (r!=c)
    System.exit(0);
int arr[][] = new int[r][c];
for(int i=0; i<arr.length; i++){
    for(int j=0; j<arr[0].length; j++){
        System.out.println("enter the elements of matrix");
        arr[i][j] = sc.nextInt();

    }
}
// for normal
int normal_sum = 0;
for(int i=0; i<r;i++){
    for(int j=0; j<c; j++)
{
normal_sum+=(int)Math.powExact(arr[i][j],2 );
}}
double normal =(double)Math.sqrt(normal_sum);
//Trace of matrix 
int Trace =0;
for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
        if(i==j)
            Trace = Trace+arr[i][j];
    }
}
System.out.println("The normal of matrix is "+normal+ "\n"+"The Trace of matrix is "+Trace);
    }
}
