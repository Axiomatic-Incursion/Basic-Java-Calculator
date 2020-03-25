import java.util.*;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class calculator {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void calculator1() {
		int operator, choice;
		double num1, num2;
		System.out.println("Calculator");
	System.out.println();
		
		//Selection
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("Enter Selection from Above: ");
		//Creating new input
		Scanner inp1 = new Scanner(System.in);
		//Assigning input to variable
		operator = inp1.nextInt();
		
	System.out.println();
		
		System.out.println("Enter First Number: ");
		//Creating new input
		Scanner inp2 = new Scanner(System.in);
		//Assigning input to variable
		num1 = inp2.nextDouble();
		
		System.out.println("Enter Second Number: ");
		//Creating new input
		Scanner inp3 = new Scanner(System.in);
		//Assigning input to variable
		num2 = inp3.nextDouble();
		
	System.out.println();
		//Output
		if (operator == 1) {
			System.out.println("Your answer is: " + df2.format(num1 + num2));
		} else if (operator == 2){
			System.out.println("Your answer is: " + df2.format(num1 - num2));
		} else if (operator == 3) {
			System.out.println("Your answer is: " + df2.format(num1 * num2));
		} else if (operator == 4) {
			System.out.println("Your answer is: " + df2.format(num1 / num2));
		} else {
			System.out.println("Illegal Entry");
		}
	
	//Repeat or Exit
	System.out.println();
	
		System.out.println("1) Exit");
		System.out.println("2) Make Another Calculation");
		
		System.out.println("Enter Choice: ");
		Scanner inp4 = new Scanner(System.in);
		choice = inp4.nextInt();
		
	System.out.println();
		
		if (choice == 1) {
			System.exit(0);
		} else if (choice == 2) {
			calculator.calculator1();
		} else {
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator.calculator1();
	}

}
