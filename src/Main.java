import java.io.*;
import java.util.Scanner;

/* inputs should be bigger than 0
* the program asks if u should continue
* */


public class Main {

    public static int lcm(int a, int b){
        int max; int min; int lcm;
        if (a>b){
            max = a; min = b;
        } else {
            max = b; min = a;
        }
        lcm = max;
        while (lcm % min != 0){
            lcm += max;
        }
        return lcm;
    }

    public static void myMethod(){
        Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter your first integer: ");
            int num1 = myScanner.nextInt();
            if (num1<=0){
                System.out.println("Invalid input");

            }
            System.out.println("Enter your second integer: ");
            int num2 = myScanner.nextInt();
            if (num2<=0){
                System.out.println("Invalid input");
            }
        System.out.println(lcm(num1, num2));
    }

    public static void main(String[] args) {

        myMethod();
        Scanner answerScanner = new Scanner(System.in);
        System.out.println("If you want to continue type Y, otherwise N");
        /*String myAnswer = answerScanner.next();*/
        while (answerScanner.next() == "Y"){
            myMethod();
            System.out.println("If you want to continue type Y, otherwise N");
            answerScanner.next();
        }

    }
}
