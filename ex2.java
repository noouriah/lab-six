import java.util.Scanner;

//Write programs with loops that compute  a. The sum of all even numbers between 2 and 100 (inclusive).
// b. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
// c. The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
public class ex2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            sum = sum + i;
            System.out.println(sum);
        }
        //c
        System.out.println("enter an number");
        Scanner in=new Scanner(System.in);
        String input=in.next();
        int length=input.length();
        int digits=0;
        for(int i=0;i<length;i++){
            if(length%2==1){
                digits+=1;
                sum=digits++;
            }
        }
        System.out.println(sum);
    }
}
