import java.util.*;
public class CommonPrefix{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      String strs[] =  new String[n];
     for(int i=0; i<n; i++){
        strs[i] = sc.nextLine();
     }
     Arrays.sort(strs);
     String firstword = strs[0];
     String lastword = strs[n-1];
     int minlength = Math.min(firstword.length(),lastword.length());
     int i =0; 
     while(i<minlength && firstword.charAt(i)==lastword.charAt(i)){

        i++;}
    System.out.println(firstword.substring(0,i));
    }
}