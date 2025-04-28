package POOTerEva.Palindroma;

import java.util.ArrayList;

public class Palindroma {
    private String frase;

    public Palindroma(String frase) {
        this.frase = frase.replaceAll("\\s+", "").toLowerCase(); // Elimina los espacios ylas pasamos a minusculas 
    }

    public boolean esPalindromo() {
        ArrayList<Character> caracteres = new ArrayList<>();
        
        // Llenamos el ArrayList con los caracteres de la frase
        for (char c : frase.toCharArray()) {
            caracteres.add(c);
        }

        int inicio = 0;
        int fin = caracteres.size() - 1;

        // da un booleano para validar si es palindroma o no
        while (inicio < fin) {
            if (caracteres.get(inicio) != caracteres.get(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
