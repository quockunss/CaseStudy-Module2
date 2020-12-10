package com.company;

public class Main {
    public static void hay(){
        int i = 1;
        int j = 0;
        int r = i / j;
        System.out.println(r);
    }


    public static void main(String[] args) {

        try {
            hay();
        } catch (Exception e) {
            System.out.println("cc");
        }
    }
//        } catch (Exception e) {
//            int i = 1;
//            int j = 0;
//            int m = i / j;
//        } finally {
//            System.out.println("ngu");
//        }
}

