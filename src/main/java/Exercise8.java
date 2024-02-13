import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //Escribir un programa que declare un numero entero del 1 al 7 y muestre por pantalla
        //el dia de la semana correspondiente. Controlar que el numero se encuentre en el
        //rango correcto, si no es asi, informar un error. Si el numero es 2 el dia es martes.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 al 7: ");
        int number = scanner.nextInt();

        String day;
        switch (number) {
            case 1:  day = "Lunes";
                break;
            case 2:  day = "Martes";
                break;
            case 3:  day = "Miercoles";
                break;
            case 4:  day = "Jueves";
                break;
            case 5:  day = "Viernes";
                break;
            case 6:  day = "Sabado";
                break;
            case 7:  day = "Domingo";
                break;
            default: day = "Dia incorrecto";
                break;
        }
        System.out.println(day);
    }
}
