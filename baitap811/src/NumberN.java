import java.util.Scanner;


public class NumberN {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = enterN();
        boolean checkPrime = isPrime(n);
        if(checkPrime == true){
            System.out.println("N la so nguyen to");
        }else{
            System.out.println("N khong phai so nguyen to");
        }
        System.out.printf("day so nguyen to dau tien la : ", n);
        ListPrime(n);

    }

    public static int enterN(){
        int number;
        System.out.println("Nhap so N: ");
        do{
            number = Integer.parseInt(sc.nextLine());
            if(number % 2 == 0 || number <= 0){
                System.out.println("Nhap lai N: ");
            }
        }
        while (number % 2 == 0 || number <= 0);
        return number;

    }

    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }


    public static void ListPrime(int number){
        int count = 0;
        int i = 2;
        while(count < number){
            if(isPrime(i) == true){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}

