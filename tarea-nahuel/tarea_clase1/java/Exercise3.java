import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Escribir un programa que cree dos variables enteras y muestre por pantalla, la suma,
        //la resta, la multiplicación, la división entera y el resto de la división entera.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int number2 = scanner.nextInt();

        int addition = number + number2;
        int subtraction = number - number2;
        int multiplication = number * number2;
        int split = number / number2;
        int rest = number % number2;

        System.out.println("La suma es: " + addition);
        System.out.println(("La resta es: " + subtraction));
        System.out.println("La multiplicacion es: " + multiplication);
        System.out.println("La division es: " + split);
        System.out.println("El resto de la divison es: " + rest);
    }
}
