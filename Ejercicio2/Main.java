package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,
                1.08321E12,12742,150000000, Planeta.tipoPlaneta.TERRESTRE,true,
                1,1);
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.CalcularDensidad());
        System.out.println("Es planeta exterior = " + p1.EsPlanetaExterior());
        System.out.println();
        Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,
                750000000,Planeta.tipoPlaneta.GASEOSO,true,12,0);
        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.CalcularDensidad());
        System.out.println("Es planeta exterior = " + p2.EsPlanetaExterior());
        System.out.println();
    }
}
