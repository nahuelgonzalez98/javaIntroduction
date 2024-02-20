import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //4. Dado el valor de entrada mostrar sumas con el valor de entrada : ejemplo: si
        // el valor es 5 , sumar 5+1 5+2 5+3 5+4 5+5 .

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            int add = number + i;
            System.out.println(number + " + " + i + " = " + add);
        }
    }
}
