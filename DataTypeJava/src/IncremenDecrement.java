public class IncremenDecrement {
    public static void main(String[] args) {

        int lives = 5;

        lives--; // decremento
        System.out.println(lives);
        lives++; //cremento
        System.out.println(lives);

        int numero = 10 + lives++;// esta operacion se realizara si el cremento para que pueda tomar el valor se escribe ++lives
        System.out.println(lives);
        System.out.println(numero+" lives: "+lives);

        --lives; // prefijo
        System.out.println(lives);
        ++lives; // posfijo
        System.out.println(lives);
    }
}
