public class Exercise9 {
    public static void main(String[] args) {
        //Mostrar por pantalla todos los numeros enteros entre 1 y 100, hacerlo con usando un
        //bucle while y tambien con un bucle for.

        System.out.println("Bucle while");
        int number = 0;
        while(number < 100){
            number++;
            System.out.println(number);
        }

        System.out.println("Bucle for");
        for(int i=1; i<101; i++){
            System.out.println(i);
        }
    }
}
