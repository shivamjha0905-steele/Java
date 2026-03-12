import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
    int[] arr = new int[10];
    int n  = arr.length;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<10;i++){
        System.out.println("enter no");
        arr[i]=sc.nextInt();
    }
     for(int p=0;p<n-1;p++){
        for(int q=p+1;q<n;q++){
            if(arr[p]>arr[q]){
                int temp = arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
            }
        }
     }
     System.out.println("Sorted array is ");
     for(int num : arr){
        System.out.print(num+ "  ");
     }
    }
}
