package POOTerEva.ClassString;

import java.util.ArrayList;

public class MyString {
    private char[] cadena;

    // Constructor que recibe un String
    public MyString(String cadena) {
        this.cadena = cadena.toCharArray();
    }

    // Constructor que recibe un array de char
    public MyString(char[] cadena) {
        this.cadena = cadena.clone();
    }

    // Constructor que recibe un ArrayList<Character>
    public MyString(ArrayList<Character> cadena) {
        this.cadena = new char[cadena.size()];
        for (int i = 0; i < cadena.size(); i++) {
            this.cadena[i] = cadena.get(i);
        }
    }

    // Método para obtener el array de caracteres
    public char[] getCadena() {
        return cadena.clone();
    }

    // Método para obtener un carácter en una posición específica
    public char myCharAt(int i) throws Exception {
        if (i < 0 || i >= cadena.length) {
            throw new Exception("Índice fuera de rango");
        }
        return cadena[i];
    }

    // Método para obtener la longitud de la cadena
    public int myLength() {
        return cadena.length;
    }

    // Método para comparar dos MyString (sensible a mayúsculas)
    public int myCompareTo(MyString cadena2) {
        int minLength = Math.min(this.cadena.length, cadena2.myLength());
        for (int i = 0; i < minLength; i++) {
            if (this.cadena[i] != cadena2.cadena[i]) {
                return this.cadena[i] - cadena2.cadena[i];
            }
        }
        return this.cadena.length - cadena2.myLength();
    }

    // Método que reemplaza un carácter por otro
    public MyString myReplace(char antiguo, char nuevo) {
        char[] nuevaCadena = this.cadena.clone();
        for (int i = 0; i < nuevaCadena.length; i++) {
            if (nuevaCadena[i] == antiguo) {
                nuevaCadena[i] = nuevo;
            }
        }
        return new MyString(nuevaCadena);
    }

    // Método para imprimir la cadena
    public void imprimir() {
        for (char c : cadena) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Método para convertir MyString a String
    public String myToString() {
        return new String(cadena);
    }
}