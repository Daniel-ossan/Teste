package questoes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.print("Informe um número: ");
	        int number = scanner.nextInt();
	        

	        if (Fib.calcula(number)) {
	            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
	        }

	
	        
	        System.out.print("Informe uma frase: ");
	        String frase = scanner.nextLine();


	        int quantidade = ContaA.calcula(frase);


	        if (quantidade > 0) {
	            System.out.println("A letra 'a' aparece " + quantidade + " vezes na frase.");
	        } else {
	            System.out.println("Não tem letra 'a' nesta frase.");
	        }

	        scanner.close();
	    }  
}
