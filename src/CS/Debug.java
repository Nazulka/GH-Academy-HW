package CS;
import java.util.Scanner;

    public class Debug {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int result = a / 10;
            System.out.println(result % 10);
        }
    }
