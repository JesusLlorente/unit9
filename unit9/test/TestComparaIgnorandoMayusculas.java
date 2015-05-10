import junit.framework.Assert;
import org.junit.Test;
import unit9.CadenaAlumno;

/**
 * Clase que probará el método comparaIgnorandoMayusculas de la clase CadenaAlumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestComparaIgnorandoMayusculas {
    
    //-----ATRIBUTOS-----//
    
    String cadena1;
    String cadena2;
    
    //-----METODOS-----//
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void comparaIgnorandoMayusculasTestA(){
        
        cadena1 = "entornos";
        cadena2 = "ento";
        boolean resultadoEsperado = CadenaAlumno.comparaIgnorandoMayusculas(cadena1, cadena2);
        boolean resultadoReal = cadena1.equalsIgnoreCase(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "false".
     */
    @Test
    public void comparaIgnorandoMayusculasTestB(){
        
        cadena1 = "ento";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.comparaIgnorandoMayusculas(cadena1, cadena2);
        boolean resultadoReal = cadena1.equalsIgnoreCase(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void comparaIgnorandoMayusculasTestC(){
        
        cadena1 = "entornos";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.comparaIgnorandoMayusculas(cadena1, cadena2);
        boolean resultadoReal = cadena1.equalsIgnoreCase(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que deberá de dar "true".
     */
    @Test
    public void comparaIgnorandoMayusculasTestD(){
        
        cadena1 = "enTornOs";
        cadena2 = "entornos";
        boolean resultadoEsperado = CadenaAlumno.comparaIgnorandoMayusculas(cadena1, cadena2);
        boolean resultadoReal = cadena1.equalsIgnoreCase(cadena2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}