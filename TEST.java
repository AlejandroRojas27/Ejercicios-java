public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        System.out.println("Ejercicio 3.32");

        double x0 = 1;
        double y0 = 1;
        double x1 = 2;
        double y1 = 2;
        double x2 = 1.5;
        double y2 = 1.5;

        double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));

        System.out.println(ecuacion);

        if (ecuacion > 0)
            System.out.println("p2 is on the left side of the line");
        else if (ecuacion == 0)
            System.out.println("p2 is on the same line");
        else if (ecuacion < 0)
            System.out.println("p2 is on the right side of the line");

    }


}
