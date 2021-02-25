package es.formacion.cip.interfaces;

public class Calculadora {

    public static void main(String[] args) {
    	System.out.println("Una operación de suma:");
    	System.out.println(Operaciones.suma(10.0, 30.0));
    	System.out.println("Una operación de resta:");
    	System.out.println(Operaciones.resta(25.0, 13.0));
    	System.out.println("Una operación de división");
    	System.out.println(Operaciones.dividir(20.0, 3.0));
    	System.out.println("Una operación de multiplicación:");
    	System.out.println(Operaciones.multiplicar(60.0, 5.0));
    }
}
