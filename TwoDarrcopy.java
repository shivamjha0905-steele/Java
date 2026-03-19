import java.util.Scanner;
public class TwoDarrcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array");
        int r = sc.nextInt();
         int c = sc.nextInt();
         int arr[][] = new int[r][c];
         int copy[][] = new int[r][c];
         for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
            arr[i][j] = sc.nextInt();
            }
         }
         System.out.println("The copied array is");
         for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
                 copy[i][j] = arr[i][j];
                 System.out.print(copy[i][j] +" ");
            }
           System.out.println(" ");
         }
        
    }
}
