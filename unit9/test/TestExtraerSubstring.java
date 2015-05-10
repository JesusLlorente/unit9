import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método extraersubstring (ambos) de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestExtraerSubstring{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true" (sólo toma el punto de inicio).
     */
    @Test
    public void extraerSubstringTestA(){
        
        cadena1 = "hola mundo";
        String resultadoEsperado = CadenaAlumno.extraerSubstring(cadena1, 4);
        String resultadoReal = cadena1.substring(4);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "true" (toma el punto de inicio y de fin).
     */
    @Test
    public void extraerSubstringTestB(){
        
        cadena1 = "hola mundo";
        String resultadoEsperado = CadenaAlumno.extraerSubstring(cadena1, 2, 5);
        String resultadoReal = cadena1.substring(2, 5);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
