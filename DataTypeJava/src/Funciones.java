
public class Funciones {
    public static void main(String[] args) {
        int y = 3;
        // area de un circulo
        // PI * r°2

        System.out.println(pesosDollars(9000,"COP") +" UDS");

        double area = circleArea(y);
        System.out.println(area);

        //area de una esfera
        // 4*PI*r°2
        System.out.println(sphereArea(y));

        //volumen de una esfera
        // (4/3)*PI * 3
       System.out.println(volumeSphere(y));
    }

    public static double circleArea(double r){
        return Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double volumeSphere(double r){
        return (4/3)*Math.PI* Math.pow(r,3);
    }

    // covertir pesos a dollars

    public static double pesosDollars(double peso, String moneda){
        switch (moneda){
            case "PMX":
                peso *= 0.050;
                break;
            case "COP":
                peso *= 0.00021;
                break;
        }
        return peso;
    }
}
