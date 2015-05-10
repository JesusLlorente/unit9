import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método acabaEn de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestAcabaEn{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void acabaEnTestA(){
        
        cadena1 = "hola mundo";
        boolean resultadoEsperado = CadenaAlumno.acabaEn(cadena1, "hola");
        boolean resultadoReal = cadena1.endsWith("hola");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void acabaEnTestB(){
        
        cadena1 = "hola mundo";
        boolean resultadoEsperado = CadenaAlumno.acabaEn(cadena1, "mundo");
        boolean resultadoReal = cadena1.endsWith("mundo");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
