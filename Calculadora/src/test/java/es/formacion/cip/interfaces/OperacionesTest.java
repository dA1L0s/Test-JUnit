package es.formacion.cip.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class OperacionesTest {

    Double valor1;
    Double valor2;

    @Test
    public void sumaSimpleTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        Double resultado;
        resultado = Operaciones.suma(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(6.0));
    }
    @Test
    public void restaSimpleTest() {
        valor1 = 5.0;
        valor2 = 4.0;
        Double resultado;
        resultado = Operaciones.resta(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(1.0));
    }
    @Test
    public void restaSimpleNegativaTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        Double resultado;
        resultado = Operaciones.resta(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(-2.0));
    }
    public void restaResultadoCero() {
        valor1 = 3.0;
        valor2 = 3.0;
        Double resultado;
        resultado = Operaciones.resta(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(0.0));
    }
    @Test
    public void multiplicacionSimpleTest() {
        valor1 = 5.0;
        valor2 = 5.0;
        Double resultado;
        resultado = Operaciones.multiplicar(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(25.0));
    }
    @Test
    public void multiplicacionSimpleNegativaTest() {
        valor1 = 5.0;
        valor2 = -5.0;
        Double resultado;
        resultado = Operaciones.multiplicar(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(-25.0));
    }
    @Test
    public void dividirSimpleTest() {
        valor1 = 4.0;
        valor2 = 2.0;
        dividirTest(valor1,valor2, 2.0);
    }

    @Test
    public void dividirDecimalesTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        dividirTest(valor1,valor2, 0.5);
    }

    @Test
    public void dividirNumeroNegativosTest() {
        valor1 = 2.0;
        valor2 = -4.0;
        dividirTest(valor1,valor2, -0.5);
    }

    @Test
    public void dividirPorCeroTest() {
        valor1 = 2.0;
        valor2 = 0.0;
        try {
            dividirTest(valor1,valor2, 0.5);
        }catch (Exception e) {
            Assert.assertTrue("El mensaje no es el esperado", e.getMessage().contains("igual o menor a 0") );
        }
    }

    private void dividirTest(Double valor1, Double valor2, Double resultado) {
        Double result = Operaciones.dividir(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", result);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(result) );
    }




}
