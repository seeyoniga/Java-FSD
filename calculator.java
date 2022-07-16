package test;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
	
		System.out.println("ENTER TWO NUMBERS");
		@SuppressWarnings("resource")
		Scanner ie = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int n1 = ie.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int n2 = ie.nextInt();
		System.out.println("ENTER THE OPERATION YOU WISH TO DO");
		String oprt = ie.next();
		if(oprt.equals("add")|| oprt.equals("ADD")|| oprt.equals("+")) {
			int res=n1+n2;
			System.out.println("SUM OF THE TWO NUMBERS IS : "+res);
		}
		else if(oprt.equals("sub")|| oprt.equals("SUB") || oprt.equals("-")) {
			int res=n1-n2;
			System.out.println("DIFFERENCE OF THE TWO NUMBERS IS : "+res);
		}
		else if(oprt.equals("mul")|| oprt.equals("MUL") || oprt.equals("*")) {
			int res=n1*n2;
			System.out.println("PRODUCT OF THE TWO NUMBERS IS : "+res);
		}	
		else if(oprt.equals("div")|| oprt.equals("DIV") || oprt.equals("/")) {
			int res=n1/n2;
			System.out.println("QUOTIENT OF THE TWO NUMBERS IS : "+res);
		}
		else {
			System.out.println("ENTER only 4 operations ( add,sub,mul,div ) either in all small or all caps or use the appropriate symbols(+,-,*,/)");
		}
	}

}
