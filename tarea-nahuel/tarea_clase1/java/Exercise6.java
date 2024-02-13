import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Declarar dos variables enteras (con cualquier valor) e informar por pantalla cual es
        //menor de las dos, si son iguales, indicarlo por separado. Cambiar el orden de los
        //valores para comprobar el funcionamiento.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int number2 = scanner.nextInt();

        if (number < number2) {
            System.out.println("El primer numero es menor al segundo numero");
        } else if (number2 < number) {
            System.out.println("El segundo numero es menor al primero numero");
        } else{
            System.out.println("Ambos numeros son iguales");
        }

    }
}
