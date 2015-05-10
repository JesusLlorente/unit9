import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método reemplazaTodos de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestReemplazaTodos {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void reemplazaTodosTestA(){
        
        cadena1 = "hola mundo";
        String resultadoEsperado = CadenaAlumno.reemplazaTodos(cadena1, "o", "e");
        String resultadoReal = cadena1.replaceAll("o", "e");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
