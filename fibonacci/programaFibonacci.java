package fibonacci;

import java.util.Scanner;

public class programaFibonacci {

		public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in); 
		
			System.out.print("Entre com um número: "); 
			int num = ler.nextInt();
			
			for (int i = 1; i <= num; i++) {
				long f = fib(i);
				System.out.println("fib(" + i + ") = " + f);
			}
		}	
			public static long fib(int num) {
				if (num <= 2) 
					return 1;
				
				else return fib(num - 1) + fib(num - 2);
			}
}

