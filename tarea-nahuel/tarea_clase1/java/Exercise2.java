import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Escribir un programa que cargue en una variable un número entero e imprima por
        //pantalla su tabla de multiplicar (del 1 al 12).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        for(int i=1; i<=12; i++){
            int multiplicación = number * i;
            System.out.println("El numero " + number + " por " + i +" es igual: " + multiplicación);
        }
    }
}
