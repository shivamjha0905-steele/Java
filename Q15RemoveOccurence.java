import java.util.Scanner;
public class Q15RemoveOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int key = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("enter elements of array");
        for(int i=0; i<arr.length; i++){
         arr[i] = sc.nextInt();
        }
        int index = 0; // position to place next valid element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Print only the valid portion of the array
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
            if (i < index - 1) System.out.print(", ");
        }
        System.out.println("]");

    }
}
