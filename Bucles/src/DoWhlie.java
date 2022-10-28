import java.util.Scanner;
public class DoWhlie {
    public static void main(String[] args) {
        int response = 0;
        do{

            System.out.println("secciona el numero de la Opcion deseada: ");
            System.out.println("1. Peliculas");
            System.out.println("2. series");
            System.out.println("0. salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 0:
                    System.out.println("Gracias por la visita.");
                    break;
                case 1:
                    System.out.println("Peliculas");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Error vuelve a intentarlo");

            }
            // la condicion de while debe
        }while (response != 0);
    }
}
