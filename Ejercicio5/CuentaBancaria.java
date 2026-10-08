package Ejercicio5;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    float tasaInteresMensual = 0;

    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta, float tasaInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.tasaInteresMensual = tasaInteresMensual;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Tasa de interés mensual = " + tasaInteresMensual + "%");
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }

    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    void calcularInteresMensual() {
        float interes = saldo * (tasaInteresMensual / 100);
        saldo = saldo + interes;
        System.out.println("Se aplicó un interés de $" + interes + ". El nuevo saldo con intereses es $" + saldo);
    }
}