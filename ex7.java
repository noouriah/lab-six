import java.util.Scanner;

public class ex7 {

    public class three {
        public three() {
        }

        public static void main(String[] args) {
            System.out.println("enter weadth of rectangle:");
            Scanner in = new Scanner(System.in);
            int w = in.nextInt();
            System.out.println("enter length of rectangle:");
            int l = in.nextInt();
            System.out.println("area of rectangle:" + l * w);
            System.out.println("perimeter of rectangle:" + 2 * l * w);
        }
    }

}
