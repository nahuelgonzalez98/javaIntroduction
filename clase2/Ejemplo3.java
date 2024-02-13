import java.util.Scanner;
public class Ejemplo3 {
    public static void main(String[] args) {
       
//entrada 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        String mensaje;
        String salida;
//proseso 
        if ((number % 2) == 0) {
            mensaje = "El numero " + number + " es par";
            salida = mensaje;
        } else {
            mensaje = "El numero " + number + " no es par";
            salida = mensaje;
        }
// salida
        System.out.println(salida);
    }
}