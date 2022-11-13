import java.util.Scanner;

public class ex6 {

    public class five {
        public five() {
        }

        public static void main(String[] args) {
            System.out.println("enter two number:");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            x *= y;
            y = x / y;
            x /= y;
            System.out.println("After swapping \n " + x + "\n " + y);
        }
    }

}
