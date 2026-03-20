import java.util.Scanner;
public class Matrix_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns of matrix");
        int r = sc.nextInt();
        int c= sc.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.println("enter the elements of 1st array");
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.println("enter the elements of 2nd array");
                arr2[i][j] = sc.nextInt();
            }
        }
        boolean isEqual = true;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr1[i][j]!=arr2[i][j]){
                 isEqual = false;
                    break; 
                }

            }
        }
         if(isEqual)
            System.out.println("Both matrices are equal");
        else
            System.out.println("Both matrices are unequal");

    }
}
