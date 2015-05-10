import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método concatenaCadenas de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestConcatenaCadenas{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    String cadena2;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void extraerSubstringTestA(){
        
        cadena1 = "hola ";
        cadena2 = "mundo";
        String resultadoEsperado = CadenaAlumno.concatenaCadenas(cadena1, cadena2);
        String resultadoReal = cadena1.concat(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
