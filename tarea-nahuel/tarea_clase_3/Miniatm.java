import java.sql.SQLOutput;
import java.util.Scanner;

public class Miniatm {
    public static void main(String[] args) {
        //tarea : un mini cajero automantico que tenga 3 funcionalidades . ver el estado
        // de la cuenta. ingresar dinero y hacer una transferencia . y que se devite el dinero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese su usuario: ");
        String user = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        System.out.println("Bienvenido " + user);
        System.out.println("Elija una opcion del 1 al 4");
        System.out.println("1_Estado de su cuenta");
        System.out.println("2_Ingresar dinero a su cuenta");
        System.out.println("3_Realizar una transferencia");
        System.out.println("4_Cerrar sesion");
        int option = scanner.nextInt();

        float money = 0.0f;
        while(option >=1 && option <=4) {
            do {
                int optionYesOrNo;
                if (option == 1) {
                    System.out.println("Su estado de cuenta es: $" + money);
                    System.out.println("1_Desea volver al menu");
                    System.out.println("2_Cerrar sesion");
                    optionYesOrNo = scanner.nextInt();
                        if (optionYesOrNo == 1) {
                            option = 1;
                            break;
                        } else {
                            option = 4;
                            break;
                        }
                } else if (option == 2) {
                    System.out.println("¿Cuantos dinero va a ingresar?");
                    float moneyReceived = scanner.nextFloat();
                    System.out.println("El dinero ingresado es de $" + moneyReceived);
                    money += moneyReceived;
                    System.out.println("1_Desea volver al menu");
                    System.out.println("2_Cerrar sesion");
                    optionYesOrNo = scanner.nextInt();
                        if (optionYesOrNo == 1) {
                            option = 2;
                            break;
                        } else {
                            option = 4;
                            break;
                        }
                } else if (option == 3) {
                    System.out.println("Ingrese el alias del destinatario: ");
                    String name = scanner.next();
                    System.out.println("¿Cuanto dinero va a trasferir?");
                    float moneyTransferred = scanner.nextFloat();
                    while (true){
                            if(money >= moneyTransferred) {
                                System.out.println("Se ha transferido $" + moneyTransferred + " al usuario " + name);
                                money -= moneyTransferred;
                                break;
                            }else{
                                System.out.println("No posee fondos necesarios para transferir");
                                break;
                            }
                        }
                    System.out.println("1_Desea volver al menu");
                    System.out.println("2_Cerrar sesion");
                    optionYesOrNo = scanner.nextInt();
                    if (optionYesOrNo == 1) {
                        option = 2;
                        break;
                    } else {
                        option = 4;
                        break;
                    }

                } else {
                    break;
                }
            } while (option != 4);

            if(option == 4){
                break;
            }
            System.out.println("Bienvenido " + user);
            System.out.println("Elija una opcion del 1 al 4");
            System.out.println("1_Estado de su cuenta");
            System.out.println("2_Ingresar dinero a su cuenta");
            System.out.println("3_Realizar una transferencia");
            System.out.println("4_Cerrar sesion");
            option = scanner.nextInt();
        }

        System.out.println("Su sesion a sido cerrada");

        }


}
















