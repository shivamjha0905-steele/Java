import java.util.Scanner;
public class MaxMinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of element");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int s=0; s<x;s++){
            arr[s] = sc.nextInt();
        }
      //   int min = Integer.MIN_VALUE;
        int min = a[0];
        for(int i=0;i<x; i++){
            if(arr[i]<min)
            min = arr[i];
        }
        // int max = Integer.MAX_VALUE;
        int max = arr[0];
        for(int i=1; i<x; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("the maximum and minimum element is "+max+ " "+min);
        // int min = Integer.Min_Value;
        // int max = Integer Max_Value;
    }
}
