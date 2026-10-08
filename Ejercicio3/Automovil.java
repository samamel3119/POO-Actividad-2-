package Ejercicio3;

public class Automovil {
    String Marca;
    int modelo;
    int motor;
    enum tipoCom { GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL }
    tipoCom tipoCombustible;
    enum tipoA { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    tipoA tipoAutomovil;
    int NumPuertas;
    int CanAsientos;
    int VelMax;
    enum tipoColor { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }
    tipoColor color;
    int VelActual = 0;
    boolean esAutomatico;
    int cantidadMultas = 0;
    double valorTotalMultas = 0.0;

    Automovil(String Marca, int modelo, int motor, tipoCom tipoCombustible,
              tipoA tipoAutomovil, int NumPuertas, int CanAsientos, int velMax,
              tipoColor tipoColor, boolean esAutomatico) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.NumPuertas = NumPuertas;
        this.CanAsientos = CanAsientos;
        this.VelMax = velMax;
        this.color = tipoColor;
        this.esAutomatico = esAutomatico;
    }

    String getMarca() {
        return Marca;
    }

    int getModelo() {
        return modelo;
    }

    int getMotor() {
        return motor;
    }

    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNumPuertas() {
        return NumPuertas;
    }

    int getCanAsientos() {
        return CanAsientos;
    }

    int getVelMax() {
        return VelMax;
    }

    tipoColor getColor() {
        return color;
    }

    int getVelActual() {
        return VelActual;
    }

    boolean getEsAutomatico() {
        return esAutomatico;
    }

    void setMarca(String Marca) {
        this.Marca = Marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }

    void setCanAsientos(int CanAsientos) {
        this.CanAsientos = CanAsientos;
    }

    void setVelMax(int VelMax) {
        this.VelMax = VelMax;
    }

    void setColor(tipoColor color) {
        this.color = color;
    }

    void setVelActual(int velActual) {
        this.VelActual = velActual;
    }

    void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    void acelerar(int incrementoVelocidad) {
        int nuevaVelocidad = VelActual + incrementoVelocidad;
        if (nuevaVelocidad <= VelMax) {
            VelActual = nuevaVelocidad;
        } else {
            cantidadMultas++;
            valorTotalMultas += 150000.0;
            VelActual = VelMax;
            System.out.println("¡Multa generada! Se intentó superar la velocidad máxima permitida.");
        }
    }

    void desacelerar(int decrementoVel) {
        if ((VelActual - decrementoVel) > 0) {
            VelActual = VelActual - decrementoVel;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        VelActual = 0;
    }

    double calcularTempLlegada(int distancia) {
        if (VelActual == 0) {
            return 0;
        }
        return (double) distancia / VelActual;
    }

    boolean tieneMultas() {
        return cantidadMultas > 0;
    }

    double obtenerValorTotalMultas() {
        return valorTotalMultas;
    }

    void imprimir() {
        System.out.println("Marca = " + Marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + NumPuertas);
        System.out.println("Cantidad de asientos = " + CanAsientos);
        System.out.println("Velocidad máxima = " + VelMax);
        System.out.println("Color = " + color);
        System.out.println("Es automático = " + esAutomatico);
        System.out.println("Cantidad de multas = " + cantidadMultas);
        System.out.println("Valor total de multas = $" + valorTotalMultas);
        System.out.println();
    }
}