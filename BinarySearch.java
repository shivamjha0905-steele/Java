import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int low = 0;
        int high  = arr.length-1;
       // int mid = (low+high)/2;
        int target = 30;
        int result = -1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                result = mid;
                break;
            }
            else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        if(result != -1){
            System.out.println("The index of searched element is "+result);}
            else
                System.out.println("element not found");
        
    }
}
