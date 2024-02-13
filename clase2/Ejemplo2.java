import java.util.Scanner;
public class Ejemplo2 {
   

        public static void main(String[] args) {
           
    // dato de entrada 
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            int number = scanner.nextInt();
            System.out.println("Ingrese otro numero: ");
            int number2 = scanner.nextInt();
    // proseso
    
            if (number < number2) {
                 // salida
                System.out.println("El primer numero es menor al segundo numero");
            } else if (number2 < number) {
                 // salida
                System.out.println("El segundo numero es menor al primero numero");
            } else{
                 // salida
                System.out.println("Ambos numeros son iguales");
            }
    
        }
    
        //
    }
    
    
    // dato de entrada 
    
    // proseso
    
     // salida 
    
