import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método posicionPrimeraCadena de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestPosicionPrimeraCadena{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void primeraCadenaTestA(){
        
        cadena1 = "hola mundo";
        long resultadoEsperado = CadenaAlumno.posicionPrimeraCadena(cadena1, "m");
        int resultadoReal = cadena1.indexOf("m");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
