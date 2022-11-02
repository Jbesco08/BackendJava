public class PracticeFuntion {
    public static void main(String[] args) {
        /**
         * Convertir pesos MXC & COP a UDS
         * */

        System.out.println(PesosDollars(35200,"COP"));



    }
    /**
     * Descripcion de lo que hace la funcion.
     * Convierte una cantidad de pesos a DOLLARS.
     *
     * @param  pesos cantidad de dinero.
     * @param moneda solo esta para pesos COP and MXC.
     * @return devuelve la cantidad de pesos a Dollars.
     *
     * */
    public static double PesosDollars(double pesos, String moneda){
        switch (moneda){
            case "MXC":
                pesos *= 0.050;
                break;
            case "COP":
                pesos *= 0.00020;
                break;
        }
        return pesos;
    }
}
