import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //3. Solicitar al usuario un número entre 1 y 5 hasta que lo ingrese correctamente,


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 5: ");
        int number = scanner.nextInt();

        while (number > 5 || number < 1){
            System.out.println("Ingrese un numero entre 1 y 5: ");
            number = scanner.nextInt();
        }


    }
}


