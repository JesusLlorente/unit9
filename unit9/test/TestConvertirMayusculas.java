import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método convertirMayusculas de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestConvertirMayusculas{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void convertirMayusculasTestA(){
        
        cadena1 = "hola mundo";
        String resultadoEsperado = CadenaAlumno.convertirMayusculas(cadena1);
        String resultadoReal = cadena1.toUpperCase();
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}