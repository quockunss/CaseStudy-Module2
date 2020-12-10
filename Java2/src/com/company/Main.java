package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int choice;
    	Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Print the rectangle");
		System.out.println("2. Print the square triangle");
		System.out.println("3. Print isosceles triangle");
		System.out.println("4. Exit");
		System.out.println("enter your choice: ");
		choice = sc.nextInt();

		switch(choice){
			case 1:
				System.out.println("Print the rectangle");
				for (int i = 0; i <= 2; i++){
					for (int j = 0; j <= 5; j++) {
						System.out.print("*");
					}
					System.out.println();
				} break;


			case 2:
				System.out.println("Print the square triangle");
				for (int i = 0; i <= 4 ;i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				for (int i = 0; )

			case 3:
				System.out.println("Draw the rectangle");

				break;

			case 0:
				System.exit(0);

			default:
				System.out.println("Make a right choice dude!");

		}



	}}
