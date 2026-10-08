package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3, Automovil.tipoCom.DIESEL,
                Automovil.tipoA.EJECUTIVO, 5, 6, 250, Automovil.tipoColor.NEGRO, true);

        auto1.imprimir();

        auto1.setVelActual(200);
        System.out.println("Velocidad actual = " + auto1.getVelActual());

        System.out.println("\nIntentando acelerar por encima del límite...");
        auto1.acelerar(80);
        System.out.println("Velocidad actual tras intento = " + auto1.getVelActual());

        auto1.acelerar(50);

        System.out.println("\n--- Estado de Multas ---");
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas());
        System.out.println("Valor total de multas = $" + auto1.obtenerValorTotalMultas());

        System.out.println();
        auto1.imprimir();
    }
}