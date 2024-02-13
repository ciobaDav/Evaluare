package edu.step.math;

public class Calculator {
    public int adunare(int a, int b) {
        return a + b;
    }

    public double adunare(double a, double b) {
        return a + b;
    }

    public int scadere(int a, int b) {
        return a - b;
    }

    public double scadere(double a, double b) {
        return a - b;
    }

    public int inmultire(int a, int b) {
        return a * b;
    }

    public double inmultire(double a, double b) {
        return a * b;
    }

    public int impartire(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nu se poate împărți la 0.");
        }
        return Integer.MIN_VALUE;
    }


    public double impartire(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nu se poate împărți la 0.");
        }
        return Double.POSITIVE_INFINITY;
    }


    public void TablaInmultirii(int numar) {
        System.out.println("Tabla înmulțirii pentru " + numar + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numar + " x " + i + " = " + (numar * i));
        }
    }


    public int calculeazaSuma(int numar) {
        int suma = 0;
        for (int i = 0; i <= numar; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Rezultat adunare int: " + calculator.adunare(5, 3));
        System.out.println("Rezultat adunare double: " + calculator.adunare(5.5, 3.2));

        System.out.println("Rezultat scadere int: " + calculator.scadere(5, 3));
        System.out.println("Rezultat scadere double: " + calculator.scadere(5.5, 3.2));

        System.out.println("Rezultat inmultire int: " + calculator.inmultire(5, 3));
        System.out.println("Rezultat inmultire double: " + calculator.inmultire(5.5, 3.2));

        System.out.println("Rezultat impartire int: " + calculator.impartire(10, 2));
        System.out.println("Rezultat impartire double: " + calculator.impartire(10.5, 2.0));

        // Tabla inmultirii
        calculator.TablaInmultirii(7);
        // Calcularea Sumei
        System.out.println("Suma numerelor până la 5: " + calculator.calculeazaSuma(5));
    }
}







