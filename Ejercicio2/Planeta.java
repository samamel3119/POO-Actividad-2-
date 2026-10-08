package Ejercicio2;

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int PeriodoOrbital = 0;
    int PeriodoRotacion = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean esObservable = false;

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
            int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable,int PeriodoOrbital, int PeriodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.PeriodoOrbital = PeriodoOrbital;
        this.PeriodoRotacion = PeriodoRotacion;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }
    void imprimir(){
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Periodo orbital = " + PeriodoOrbital + " años");
        System.out.println("Periodo Rotacion = " + PeriodoRotacion + " días");
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }
    double CalcularDensidad(){
        return masa/volumen;
    }
    boolean EsPlanetaExterior(){
        float limite = (float)(149597870 * 3.4);
        if (distanciaSol > limite){
            return true;
        }else{
            return false;
        }
    }
}
