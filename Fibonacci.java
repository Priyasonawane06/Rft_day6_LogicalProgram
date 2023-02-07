package briglab4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        fibonacciSeries(n);
	    }
	    private static void fibonacciSeries(int n) {
	        int a = 0, b = 1, c = 0;
	        System.out.print(a + " " + b + " ");
	        for (int i = 2; i < n; i++) {
	            c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }
	    }
	

	}


