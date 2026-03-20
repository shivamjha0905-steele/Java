import java.util.Scanner;
public class Q5TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt(); 
          int arr[][] = new int[r][c];
          for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.println("enter the elements of matrix");
                arr[i][j]=sc.nextInt();
            }
          }   
          int transpose[][] = new int[r][c];  
          System.out.println("Transpose of matrix is");     
          for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transpose[i][j] = arr[j][i];
               System.out.print(transpose[i][j]+" ");
            }
            System.out.println(" ");
          }                                                                                                
    }
}
