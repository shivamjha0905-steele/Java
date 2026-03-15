import java.util.Scanner;
public class insertion_Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int x = sc.nextInt();
    int a[] = new int[x];
    int n=a.length;
    for(int p=0; p<n; p++){
        System.out.println("enter the elements");
        a[p]=sc.nextInt();
    }
    for(int i =1; i<n; i++){
        int j = i;
        while(a[j] < a[j-1] && j>0){
            //swap a[j] & a[j-1]
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j--;
        }
    }
    System.out.println("Sorted array");
    for(int num : a){
        System.out.print(num+" ");
    }
  }  
}
