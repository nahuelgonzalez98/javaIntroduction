public class Exercise10 {
    public static void main(String[] args) {
        //Mostrar por pantalla todos los numeros enteros entre 1 y 100 divisibles por dos y por
        //tres.
        int number = 0;
        while(number < 100){
            number++;
            if((number % 2 == 0)&&(number % 3 == 0)){
                System.out.println(number + " es divisible por 2 y 3");
            }else{
                System.out.println(number);
            }
        }
    }
}
