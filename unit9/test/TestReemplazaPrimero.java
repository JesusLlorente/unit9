import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método reemplazaPrimero de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestReemplazaPrimero {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void reemplazaPrimeroTestA(){
        
        cadena1 = "hola mundo";
        String resultadoEsperado = CadenaAlumno.reemplazaPrimero(cadena1, "o", "e");
        String resultadoReal = cadena1.replaceFirst("o", "e");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}