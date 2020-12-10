import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i< list.length;i++){
            list[i] = sc.nextInt();
        }
        System.out.print("your input list: ");
        for (int i = 0;i < list.length;i++){
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for(int h = 0 ; h < list.length && needNextPass ; h++){
            needNextPass = false;
            for(int i = 0;i < list.length - h;i++){
                if(list[i] > list[i + 1]){
                    System.out.println("Swap " + list[i] + " with " + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }

            if (!needNextPass){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.print("List after the " + h + " sort: ");
            for (int j = 0;j <list.length;j++){
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }


}
