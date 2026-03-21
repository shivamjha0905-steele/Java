import java.util.Scanner;
public class Q11ComputeDIagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and cols of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter elements of matrix");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
           arr[i][j] = sc.nextInt();
            }
        }
        int p_sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j)
             p_sum+=arr[i][j];
            }
        }
        int S_sum =0;
        for(int i=0; i<arr.length; i++){
           S_sum+=arr[i][arr.length-i-1];
            }
        
        System.out.println(p_sum );
        System.out.println(S_sum);
        if(p_sum == S_sum)
            System.out.println("Diagonals are equal");
        else 
            System.out.println("Diagonals are not equal");
    }
}
