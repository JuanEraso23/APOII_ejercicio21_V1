package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        //Menú
        while (opcion != 3) {

            System.out.println("\nMENU");
            System.out.println("1. Suma");
            System.out.println("2. Promedio");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            //Switch
            switch (opcion) {

            case 1:

                int adicion = 0;
                int num = 1;

                while (num != 0) {
                    System.out.print(
                            "Ingrese un número entero "
                            + "(0 para salir): "
                    );
                    num = sc.nextInt();
                    adicion += num;
                }
                System.out.println("Resultado: " + adicion);
                break;

            case 2:
                System.out.println("Ingrese 10 números:");

                int n = 10;
                adicion = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.print("Número " + i + ": ");
                    num = sc.nextInt();
                    adicion += num;
                }

                double prom = (double) adicion / n;
                System.out.println("Promedio: " + prom);
                break;

            case 3:
                System.out.println("Salir");
                break;

            default:
                System.out.println("¡ERROR!");
                System.out.println("No existe dicha opción");
                break;
            }
        }

        //Cierre Scanner
        sc.close();
    }
}