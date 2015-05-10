import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método convertirMinusculas de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestConvertirMinusculas{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void convertirMinusculasTestA(){
        
        cadena1 = "HOLA MUNDO";
        String resultadoEsperado = CadenaAlumno.convertirMinusculas(cadena1);
        String resultadoReal = cadena1.toLowerCase();
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}