import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //1. Dado a un numero n de entrada mostrar sus consecutivos en pantalla. ejemplo:
        // si el numero de entrada es 30 mostrar del 1 al 30.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            System.out.println(i);
        }
    }
}
