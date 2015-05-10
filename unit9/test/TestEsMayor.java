import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método esMayor de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestEsMayor {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    String cadena2;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void esMayorTestA(){
        
        cadena1 = "entornos";
        cadena2 = "ento";
        boolean resultadoEsperado = CadenaAlumno.esMayor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) > 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void esMayorTestB(){
        
        cadena1 = "ento";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.esMayor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) > 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void esMayorTestC(){
        
        cadena1 = "entornos";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.esMayor(cadena1, cadena2);
        boolean resultadoReal = cadena1.compareTo(cadena2) > 0;
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}