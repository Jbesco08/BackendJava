public class EjerPractice {
    public static void main(String[] args) {

        // ejercicio 1

        final String HERMANA_MAYOR= "Carmen, Edad: ";
        System.out.println(HERMANA_MAYOR+23);
        final String TERCER_HERMANO =  "Vitor, Edad: ";
        System.out.println(TERCER_HERMANO+19);
        final String TERCERA_HERMANA = "Viviana, Edad: ";
        System.out.println(TERCERA_HERMANA+17);
        final String CUARTO_HERMANO = "Carlos, Edad: ";
        System.out.println(CUARTO_HERMANO+13);
        final String ULTIMA_HERMANA = "Shirlys, Edad: ";
        System.out.println(ULTIMA_HERMANA+8);

        // ejercicio 2
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        int i = 250;
        long iL = i;
        short iS =(short) iL;
        System.out.println("long: "+iL+" short: "+iS);

        double d = 301.020;
        long dL =(long) d;
        System.out.println(dL);

        int b = 100;
        b += 5000.66;

        float bF= (float) b;
        System.out.println(bF);

        double n = 298.234 / 35;
        long nL =(long) n;
        System.out.println(nL);

        // ejercicio 3
        //Explica cómo distribuirías y crearías un ambiente de producción para un programa compilado con la versión 9 de Java.
        //Incluye al menos dos Sistemas Operativos.

        /*
        1. instalar el JDK v9 y java asi.
        2. revisar que este en la version 9 del jdk, luego se procede
        a sacar el archivo .jar para realizar la ejecucion del programa.
        3. este paso se realizaria desde windows cabe resaltar que tabien funcionaria
        para mac en dado caso que sea para linux el procediemto es el mismo lo que cambia
        es la instalacion del paquete JDK.
         */
    }
}
