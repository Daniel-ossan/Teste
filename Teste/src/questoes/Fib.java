package questoes;

public class Fib {

	    public static boolean calcula(int num) {
	        if (num == 0 || num == 1) {
	            return true; 
	        }

	        int a = 0, b = 1;
	        while (b < num) {
	            int next = a + b;
	            a = b;
	            b = next;
	        }

	        return b == num;
	    }
}
