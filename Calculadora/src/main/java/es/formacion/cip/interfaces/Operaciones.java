package es.formacion.cip.interfaces;

public class Operaciones {
/**
 * Realiza la suma de dos números enteros. 
 * @param valor1
 * @param valor2
 * @return valor1+valor2
 */
    public static Double suma(Double valor1, Double valor2) {
        Double resultado;
        resultado = valor1+valor2;
        return resultado;
    }
/**
 * Realiza la división de dos números enteros. 
 * @param valor1
 * @param valor2
 * @return valor1 / valor2
 */
    public static Double dividir(Double valor1, Double valor2) {
        Double resultado;
        if (valor2 == null || valor2.equals(0.0)) {
            throw new NumberFormatException ("El divisor no puede ser igual o menor a 0");
        }
        resultado = valor1/valor2;
        return resultado;
    }
/**
 * Realiza la resta de dos números enteros. 
 * @param valor1
 * @param valor2
 * @return valor1-valor2
 */
     public static Double resta(Double valor1, Double valor2) {
        Double resultado;
        resultado = valor1-valor2;
        return resultado;
    }
/**
 * Realiza la multiplicación de dos números enteros. 
 * @param valor1
 * @param valor2
 * @return valor1*valor2
 */
    public static Double multiplicar(Double valor1, Double valor2) {
        Double resultado;
        resultado = valor1*valor2;
        return resultado;
    }
    
    
    
    
    
    
    
}
