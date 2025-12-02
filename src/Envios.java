package LAB4_METODOS;

public class Envios {

    // 1. Validar peso
    public static boolean validarPeso(double peso) {
        return peso > 0 && peso <= 50;
    }

    // 2. Calcular tarifa
    public static int calcularTarifaBase(double peso) {
        if (peso > 0 && peso <= 1) {
            return 10000;   // $10.000
        } else if (peso > 1 && peso <= 5) {
            return 20000;   // $20.000
        } else if (peso > 5 && peso <= 20) {
            return 35000;   // $35.000
        } else {
            return 60000;   // $60.000
        }
    }

    // 3. Recargo por distancia
    public static int calcularRecargoDistancia(int km) {
        if (km < 10) {
            return 0;
        } else if (km <= 50) {
            return 5000;
        } else if (km <= 200) {
            return 12000;
        } else {
            return 25000;
        }
    }

    // 4. Recargo por tipo de envío
    public static int calcularRecargoTipo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "normal":
                return 0;
            case "express":
                return 10000;
            case "prioritario":
                return 20000;
            default:
                return -1; // invalido
        }
    }


    public static String generarResumen(int base, int distancia, int tipo) {

        int total = base + distancia + tipo;

        String separador = "";
        for (int i = 0; i < 40; i++) {
            separador += "-";
        }

        return separador + "\n"
                + "Tarifa base: $" + base + " COP\n"
                + "Recargo por distancia: $" + distancia + " COP\n"
                + "Recargo por tipo: $" + tipo + " COP\n"
                + separador + "\n"
                + "TOTAL A PAGAR: $" + total + " COP\n"
                + separador;
    }
}
