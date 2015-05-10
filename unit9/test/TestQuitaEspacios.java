import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método quitaEspacios de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestQuitaEspacios{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void quitaEspaciosTestA(){
        
        cadena1 = " hola_mundo";
        String resultadoEsperado = CadenaAlumno.quitaEspacios(cadena1);
        String resultadoReal = cadena1.trim();
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
