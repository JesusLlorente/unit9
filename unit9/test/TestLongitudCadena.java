import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método longitudCadena de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestLongitudCadena{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void longitudCadenaTestA(){
        
        cadena1 = "hola mundo";
        long resultadoEsperado = CadenaAlumno.longitudCadena(cadena1);
        int resultadoReal = cadena1.length();
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
