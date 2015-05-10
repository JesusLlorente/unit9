import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método esMenor de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestEsMenor {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    String cadena2;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void esMenorTestA(){
        
        cadena1 = "entornos";
        cadena2 = "ento";
        boolean resultadoEsperado = CadenaAlumno.esMenor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) < 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void esMayorTestB(){
        
        cadena1 = "ento";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.esMenor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) < 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void esMenorTestC(){
        
        cadena1 = "entornos";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.esMayor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) < 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}