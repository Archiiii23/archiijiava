import java.util.Scanner;

public class equal {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
        String str = new String ("hello");
        String str1 = new String("hello" );

        System.out.println(str==str1);
        System.out.println(str.equals(str1));
    }
}
