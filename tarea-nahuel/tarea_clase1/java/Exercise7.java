import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //Escribir un programa que declare un numero entero con cualquier valor e indique si
        //dicho número es par o impar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        if((number % 2) == 0){
            System.out.println("El numero " + number + " es par");
        }else {
            System.out.println("El numero " + number + " no es par");
        }
    }
}
