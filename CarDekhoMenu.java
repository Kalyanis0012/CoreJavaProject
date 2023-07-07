package com.jspiders.cardekho_case_study.main;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;


public class CarDekhoMenu extends CarOperation {

	public static void main(String[] args) {
		CarOperation carOper= new CarOperation();
		carOper.createList();
		menu();
	}
	public static void menu() {
		do {
			
		
		System.out.println("==============MENU============");
		System.out.println("1.Add Car Details.\n2.Search Car Details.\n3.update Car Details\n4.delete Car details\n5.Exit\n");
		System.out.println("Enter Choice");
		Scanner inp = new Scanner(System.in);
	
	int choice=inp.nextInt();
	CarOperation carOper= new CarOperation();
	switch (choice) {
	case 1:carOper.addCarDetails();
		  break;
	case 2:
		carOper.searchCarDetails();
		break;
	case 3:
		carOper.updateCarDetails();
		break;
	case 4:
	         	carOper.deleteCarDetails();
	       
		break;
	case 5:inp.close();
		System.exit(0);
		break;

	default:
		System.out.println("invalid choice");
		System.out.println("try again ");
		
	}
		} while (true);
	}

}
