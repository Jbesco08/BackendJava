public class Casting {
    public static void main(String[] args) {
        // en el año 30 perritos
        // cuantos perritos ubique al mes

        double monhtlyDogs = 30.0/12.0;

        //extimacion
        int estimatedMonthtlyDogs = (int) monhtlyDogs;
        System.out.println(estimatedMonthtlyDogs);
        //exactitud
        int a = 3, b = 80;
        System.out.println((double) a/b);

        //casting
        int n = '1';
        System.out.println(n);

        //casting a tipo de dato SHORT
        short nS =(short) n;
        System.out.println(nS);
    }
}
