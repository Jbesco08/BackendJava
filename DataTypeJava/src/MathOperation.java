public class MathOperation {
    public static void main(String[] args) {
        double x = 2.1, y = 3;
        System.out.println(Math.ceil(x)); // metodo ceil redondeo hacia arriba
        System.out.println(Math.floor(x));// floor redondeo hacia abajo

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        // devuelve el numero mayor
        System.out.println(Math.max(x,y));

        // raiz cuadrada
        System.out.println(Math.sqrt(x));

        // area de un circulo
        // PI * r°2
        System.out.println(Math.pow(y,2));

        //area de una esfera
        // 4*PI*r°2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //volumen de una esfera
        // (4/3)*PI * 3
        System.out.println((4/3)*Math.PI* Math.pow(y,3));
    }
}
