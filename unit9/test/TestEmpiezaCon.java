import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método empiezaCon de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestEmpiezaCon{
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void empiezaConTestA(){
        
        cadena1 = "hola mundo";
        boolean resultadoEsperado = CadenaAlumno.empiezaCon(cadena1, "hola");
        boolean resultadoReal = cadena1.startsWith("hola");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void empiezaConTestB(){
        
        cadena1 = "hola mundo";
        boolean resultadoEsperado = CadenaAlumno.empiezaCon(cadena1, "mundo");
        boolean resultadoReal = cadena1.startsWith("mundo");
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
}