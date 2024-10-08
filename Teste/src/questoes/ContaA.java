package questoes;

public class ContaA {
	public static int calcula(String frase) {
        int contador = 0;


        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
