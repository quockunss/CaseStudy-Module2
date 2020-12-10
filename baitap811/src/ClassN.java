
import java.util.Scanner;

public class ClassN {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int num = NumberN.enterN();
        int[] arr = new int[num];
        arr = enterArrayElement(arr, num);
        showArrayElements(arr);
        checkPrimeInArray(arr);
        checkNumberInArray(arr);
    }


    public static int[] enterArrayElement(int[] arr, int length) {
        System.out.printf("Nhap %d phan tu cua mang arr %n", length);
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhap phan tu thu %d %n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }


    public static void showArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void checkPrimeInArray(int[] arr) {
        System.out.println("cac so nguyen to trong mang : ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (NumberN.isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        if (count == 0) {
            System.out.println("Khong co so nguyen to trong mang");
        }
    }



    public static void checkNumberInArray(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.printf("%d o vi tri thu %d %n", number, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("%d khong nam trong mang %n", number);
        }
    }
}