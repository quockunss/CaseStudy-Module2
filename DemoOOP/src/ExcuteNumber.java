import java.util.Scanner;


public class ExcuteNumber extends Object {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number num = new Number();


        System.out.print("Input first number: ");
        int fn = sc.nextInt();
        num.setFirstNumber(fn);
        System.out.print("Input second number: ");
        int sn = sc.nextInt();
        num.setSecondNumber(sn);
        num.sum();
        num.divide();


    }
}
