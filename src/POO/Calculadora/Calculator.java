package POO.Calculadora;

import java.util.Scanner;

public class Calculator {
    private float num, acum;
    private char simbol;
    private Scanner input = new Scanner(System.in);

    public Calculator(float num, float acum) {
        this.num = num;
        this.acum = acum;
    }

    public void setNumFromInput() {
        while (true) {
            System.out.print("Introduce un numero: ");
            String inputStr = input.nextLine();  // Usamos nextLine para leer toda la entrada
            try {
                this.num = Float.parseFloat(inputStr);  // Convertimos el input a float
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Por favor, introduce un numero.");
            }
        }
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
    }

    public void resetCalculator() {
        this.num = 0;
        this.acum = 0;
        System.out.println("0");
    }

    public void startCalculator() {
        setNumFromInput();  // Inicializa el primer número
        acum = num;  // Asigna el primer número a "acum"
        
        while (true) {
            System.out.print("Introduce una operacion (+, -, *, /, r reiniciar y c total, e para cerrar): ");
            String operation = input.nextLine();  // Usamos nextLine para leer toda la entrada de la operación
            if (operation.length() == 1) {
                simbol = operation.charAt(0);  // Asignamos solo el primer carácter ingresado
            } else {
                System.out.println("Operación no válida.");
                continue;
            }
            
            if (simbol == 'c') {
                System.out.println("Total: " + acum);
                System.out.println("Gracias por usar la calculadora guapo.");
                continue;
            }
            
            else if (simbol == 'r') {
                resetCalculator();
                continue;
            }
            
            else if (simbol == 'e') {
            	System.out.println("Saliste de la calculadora");
            	break;
            }

            setNumFromInput();  // Pide un nuevo número después de cada operación

            switch (simbol) {
                case '+':
                    suma();
                    break;
                case '-':
                    resta();
                    break;
                case '*':
                    multiplicar();
                    break;
                case '/':
                    dividir();
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    continue;
            }
        }
    }

    public void suma() {
        this.acum += this.num;
        System.out.println("Resultado: " + this.acum);
    }

    public void resta() {
        this.acum -= this.num;
        System.out.println("Resultado: " + this.acum);
    }

    public void multiplicar() {
        this.acum *= this.num;
        System.out.println("Resultado: " + this.acum);
    }

    public void dividir() {
        if (this.num != 0) {
            this.acum /= this.num;
            System.out.println("Resultado: " + this.acum);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }
}
