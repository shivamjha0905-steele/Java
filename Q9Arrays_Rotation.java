import java.util.Arrays;
import java.util.Scanner;
public class Q9Arrays_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no by which rotaion occurs");
        int k = sc.nextInt();
        System.out.println("enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        int n = arr.length;
        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        k = k%n;
        int result[] = new int[n];
        for(int i=0; i<k; i++){
            result[i] = arr[n-k+i];
        }
        for(int i=k; i<n; i++){
            result[i] = arr[i-k];
        }
      System.out.println("The rotated array is ");
      for(int nums : result){
        System.out.print(nums +" ");
      }
       }
    }

