import java.util.*;
public class ToggleSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle   PHysics -  phYSICS
        for(int i=0; i<str.length(); i++){
            // P - p
            // check - alphabet -  small , capital
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag = false;
            if(flag==true){
                asci += 32;
                char dh = (char)asci;  //a
                str.setCharAt(i, dh);
            }
            else {
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
