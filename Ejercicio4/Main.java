package Ejercicio4;

public class Main {
    public static void main(String args[]) {
        Circul figura1 = new Circul(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(4, 6, 5);
        Trapecio figura6 = new Trapecio(8, 5, 4, 5, 5);

        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El área del rombo es = " + figura5.calcularArea());
        System.out.println("El perímetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();
        System.out.println("El área del trapecio es = " + figura6.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());
    }
}

class Circul {
    int radio;

    Circul(int radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {
    int base;
    int altura;

    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}

class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}

class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
}

class Rombo {
    double diagonalMayor;
    double diagonalMenor;
    double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}

class Trapecio {
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}