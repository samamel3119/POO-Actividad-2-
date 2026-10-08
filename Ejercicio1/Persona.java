package Ejercicio1;

public class Persona {
    String nombre;
    String apellidos;
    String NumeroDocumentoIdentidad;
    char Genero;
    String PaisNacimiento;
    int AñoNacimiento;
    Persona(String nombre, String apellidos, String NumeroDocumentoIdentidad,
            String PaisNacimiento, int AñoNaciemiento, char Genero){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Genero = Genero;
        this.NumeroDocumentoIdentidad = NumeroDocumentoIdentidad;
        this.PaisNacimiento = PaisNacimiento;
        this.AñoNacimiento = AñoNaciemiento;
    }
void imprimir(){
    System.out.println("nombre = " +nombre);
    System.out.println("apellidos = " +apellidos);
    System.out.println("Numero de documento de identidad = " +NumeroDocumentoIdentidad);
    System.out.println("Género = " +Genero);
    System.out.println("Año de nacimiento = " +AñoNacimiento);
    System.out.println("Pais de nacimiento = " +PaisNacimiento);
    System.out.println();
}

}
