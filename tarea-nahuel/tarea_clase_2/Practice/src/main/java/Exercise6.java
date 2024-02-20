import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //6. Crear un mini loguin que hasta que escriba la contraseña correcta no te de la
        //bienvenida en pantalla

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String user = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        String originalPassword = "juanito123";

        while (!(password.equals(originalPassword))){
            System.out.println("La contraseña es incorrecta, vuelva a ingresarla: ");
            password = scanner.nextLine();
        }
        System.out.println("Bienvenido " + user);
    }
}
