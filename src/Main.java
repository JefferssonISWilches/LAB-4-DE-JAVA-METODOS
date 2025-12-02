package LAB4_METODOS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso;

        // Validar peso
        do {
            System.out.print("Ingresa el peso del paquete kG: ");
            peso = sc.nextDouble();

            if (!Envios.validarPeso(peso)) {
                System.out.println("El peso invalido. Debe ser mayor a 0 y maximo 50 kG.");
            }

        } while (!Envios.validarPeso(peso));

        // Distancia
        System.out.print("Ingresa la distancia del envio (km): ");
        int km = sc.nextInt();
        sc.nextLine();

        // validación del tipo de envio
        String tipo;
        int recargoTipo;
        do {
            System.out.print("Tipo de envio (normal / express / prioritario): ");
            tipo = sc.nextLine();
            recargoTipo = Envios.calcularRecargoTipo(tipo);

            if (recargoTipo == -1) {
                System.out.println("Tipo invalido.");
            }

        } while (recargoTipo == -1);


        int tarifaBase = Envios.calcularTarifaBase(peso);
        int recargoDistancia = Envios.calcularRecargoDistancia(km);

        String resumen = Envios.generarResumen(tarifaBase, recargoDistancia, recargoTipo);
        System.out.println("\n" + resumen);
    }
}
