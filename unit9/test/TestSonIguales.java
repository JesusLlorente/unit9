import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método sonIguales de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestSonIguales {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    String cadena2;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void sonIgualesTestA(){
        
        cadena1 = "entornos";
        cadena2 = "ento";
        boolean resultadoEsperado = CadenaAlumno.sonIguales(cadena1, cadena2);
        boolean resultadoReal = cadena1.equals(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void sonIgualesTestB(){
        
        cadena1 = "ento";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.sonIguales(cadena1, cadena2);
        boolean resultadoReal = cadena1.equals(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void sonIgualesTestC(){
        
        cadena1 = "entornos";
        cadena2 = "sonrotne";
        boolean resultadoEsperado = CadenaAlumno.sonIguales(cadena1, cadena2);
        boolean resultadoReal = cadena1.equals(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void sonIgualesTestD(){
        
        cadena1 = "entornos";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.sonIguales(cadena1, cadena2);
        boolean resultadoReal = cadena1.equals(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
