public class Ejemplo {
   
        public static void main(String[] args) {
            // Declaración e inicialización de un array de cadenas
            String[] nombres = {"Juan", "María", "Pedro", "Ana"};
            
            // Usando un bucle for-each para iterar sobre el array
            System.out.println("Iterando sobre el array de nombres:");
          
            // siempre  que nesesite controlar la iteracion  
           for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i]);
            }
           
            // siempre que yo nesesite recorrer un vertor o un array list 
            for (String nombre : nombres) {
               System.out.println(nombre);
           }
           int[] numeros = new int[5];
           numeros[0] = 10;
           numeros[1] = 20;
           numeros[2] = 30;
           numeros[3] = 40;
           numeros[4] = 50;
   
           for (int numero : numeros) {
               System.out.println(numero);
           }
        }
    }
    
  

