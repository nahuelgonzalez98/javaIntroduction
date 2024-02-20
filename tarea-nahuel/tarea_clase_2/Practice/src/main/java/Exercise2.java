import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //2. Dado a un numero n de entrada mostrar sus consecutivos al revez. ejemplo:
        // si el numero de entrada es 30 mostrar del 30 al 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();


        for(int i=number; i>=1; i--){
            System.out.println(i);
        }
    }
}
