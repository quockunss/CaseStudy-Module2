public class Main extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Main t1 = new Main();
        t1.start();
    }

}
