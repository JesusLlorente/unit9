package unit9;

import static java.lang.System.*;

/**
 * Clase que implementa métodos básicos de Java de trabajo con Strings.
 * @author Jesús Llorente Gutiérrez
 */

public class CadenaAlumno {
    
    //-----METODOS-----//
    
    /**
     * Método que compara dos cadenas de texto y dice si son iguales o no.
     * @param cadena1 --> Primera cadena a comparar.
     * @param cadena2 --> Segunda cadena a comparar.
     * @return --> Devuelve "true" si son iguales o "false" si no lo son.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean sonIguales(String cadena1, String cadena2){
        
        //-----ATRIBUTOS-----//
        
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();
        
        //-----PROGRAMA-----//
        
        if(longitudCadena(cadena1) != longitudCadena(cadena2)){
            return false;
        }
        else{
            for(int i = 0; i < longitudCadena(cadena1); i++){
                if(array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }
    }
    
     /**
     * Método que dice si una cadena de texto es mayor (alfabéticamente) 
     * que otra.
     * @param cadena1 --> Primera cadena a comparar.
     * @param cadena2 --> Segunda cadena a comparar.
     * @return --> Devuelve "true" si la primera cadena es mayor que la segunda
     * o "false" si no lo es.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean esMayor(String cadena1, String cadena2){
    
        //-----ATRIBUTOS-----//
        
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();
        
        //-----PROGRAMA-----//
        
        if(longitudCadena(cadena1) > longitudCadena(cadena2)){
            return true;
        }
        else{
            if(longitudCadena(cadena1) < longitudCadena(cadena2)){
                return false;
            }
            else{
                for(int i = 0; i < longitudCadena(cadena1); i++){
                    if(array1[i] > array2[i]){
                        return true;
                    }
                }
                return false;
            }
        }
        
    }
    
    /**
     * Método que dice si una cadena de texto es menor (alfabéticamente) 
     * que otra.
     * @param cadena1 --> Primera cadena a comparar.
     * @param cadena2 --> Segunda cadena a comparar.
     * @return --> Devuelve "true" si la primera cadena es menor que la segunda
     * o "false" si no lo es.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean esMenor(String cadena1, String cadena2){
    
         //-----ATRIBUTOS-----//
        
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();
        
        //-----PROGRAMA-----//
        
        if(longitudCadena(cadena1) < longitudCadena(cadena2)){
            return true;
        }
        else{
            if(longitudCadena(cadena1) > longitudCadena(cadena2)){
                return false;
            }
            else{
                for(int i = 0; i < longitudCadena(cadena1); i++){
                    if(array1[i] < array2[i]){
                        return true;
                    }
                }
                return false;
            }
        }
    }
    
    /**
     * Método que dice si una cadena de texto es igual (alfabéticamente) 
     * que otra ignorando las mayúsculas.
     * @param cadena1 --> Primera cadena a comparar.
     * @param cadena2 --> Segunda cadena a comparar.
     * @return --> Devuelve "true" si las cadenas son iguales o "false" si no
     * lo son.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
    
        //-----ATRIBUTOS-----//
        
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();
        
        //-----PROGRAMA-----//
        
        if(longitudCadena(cadena1) != longitudCadena(cadena2)){
            return false;
        }
        else{
            for(int i = 0; i < longitudCadena(cadena1); i++){
                if(array1[i] != array2[i]){
                    if((array1[i] + 32) != array2[i] && (array1[i] - 32) != array2[i]
                       || (array1[i] == 164 && array2[i] != 165) && (array1[i] == 165 && array2[i] != 164)){
                        return false;
                    }
                }
            }
            return true;
        }
    }
    
    /**
     * Método que busca en una cadena un texto y lo sustituye por otro.
     * @param cadena --> Cadena de texto en la que se busca el texto/regla
     * @param regla --> Texto que buscamos en la cadena para sustituir 
     * @param cambio --> Texto que reemplazará al predefinido en la regla 
     * @return --> Devuelve la cadena con los cambios realizados.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String reemplazaTodos (String cadena, String regla, String cambio){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        char[] arrayRegla = regla.toCharArray();
        String cadenaFinal = "";
        boolean encontrado = false;
        int auxiliar; 
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] == arrayRegla[0]){
                auxiliar = i;
                for(int j = 0; j < longitudCadena(regla); j++){
                    if(arrayRegla[j] == arrayCadena[auxiliar]){
                        if(j == longitudCadena(regla) - 1){
                            encontrado = true;
                        }
                    }
                    else{
                        break;
                    }
                    auxiliar++;
                }
                if(encontrado){
                    cadenaFinal += cambio;
                    i += longitudCadena(regla) - 1;
                }
            }
            else{
                cadenaFinal += arrayCadena[i];
            }
            encontrado = false;
        }
        return cadenaFinal;
    }
    
    /**
     * Método que busca en una cadena un texto y lo sustituye por otro solamente 
     * la primera vez que lo encuentra.
     * @param cadena --> Cadena de texto en la que se busca el texto/regla
     * @param regla --> Texto que buscamos en la cadena para sustituir 
     * @param cambio --> Texto que reemplazará al predefinido en la regla 
     * @return --> Devuelve la cadena con los cambios realizados.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String reemplazaPrimero (String cadena, String regla, String cambio){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        char[] arrayRegla = regla.toCharArray();
        String cadenaFinal = "";
        boolean encontrado = false;
        int auxiliar; 
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(!encontrado){
                if(arrayCadena[i] == arrayRegla[0]){
                    auxiliar = i;
                    for(int j = 0; j < longitudCadena(regla); j++){
                        if(arrayRegla[j] == arrayCadena[auxiliar]){
                            if(j == longitudCadena(regla) - 1){
                                encontrado = true;
                            }
                        }
                        else{
                            break;
                        }
                        auxiliar++;
                    }
                    if(encontrado){
                        cadenaFinal += cambio;
                        i += longitudCadena(regla) - 1;
                    }
                }
                else{
                    cadenaFinal += arrayCadena[i];
                }
            }
            else{
                cadenaFinal += arrayCadena[i];
            }
        }
        return cadenaFinal;
    }
    
    /**
     * Método que muestra por pantalla una cadena dividida tantas veces como el 
     * usuario le diga mediante una regla y un número de veces máximo.
     * @param cadena --> Cadena de texto que se usará para realizar los cambios
     * @param regla --> Texto que se buscará en la cadena
     * @param limite --> Número de veces máximo en el que se dividirá la cadena
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static void muestraSplitLimite(String cadena, String regla, int limite){
    
        //-----ATRIBUTOS-----//
        
        String cadenaFinal = "";
        char[] arrayCadena = cadena.toCharArray();
        char[] arrayRegla = regla.toCharArray();
        boolean encontrado = false;
        int auxiliar;
        int contador = 0;
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] == arrayRegla[0]){
                auxiliar = i;
                for(int j = 0; j < longitudCadena(regla); j++){
                    if(arrayRegla[j] == arrayCadena[auxiliar]){
                        if(j == longitudCadena(regla) - 1){
                            encontrado = true;
                        }
                    }
                    else{
                        break;
                    }
                    auxiliar++;
                }
                if(encontrado){
                    cadenaFinal += " ";
                }
            }
            cadenaFinal += arrayCadena[i];
            encontrado = false;
        }
        out.println(cadenaFinal);
        
    }
    
    /**
     * Método que elimina los espacios en blanco de una cadena.
     * @param cadena --> Texto al que se le quitarán los espacios.
     * @return --> Cadena de texto sin los espacios en blanco.
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String quitaEspacios(String cadena){
        
        //-----ATRIBUTOS-----//
        
        String cadenaFinal = "";
        char[] arrayCadena = cadena.toCharArray();
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] != ' '){
                cadenaFinal += arrayCadena[i];
            }
        }
        return cadenaFinal;
    }
    
    /**
     * Método que recibe una cadena de texto y la devuelve en mayúscula
     * @param cadena --> Cadena de texto que se convertirá a mayúcula
     * @return --> Cadena de texto convertida a mayúcula
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String convertirMayusculas(String cadena){
    
        //-----ATRIBUTOS-----//
        
        String cadenaFinal = "";
        char[] arrayCadena = cadena.toCharArray();
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] >= 97 && arrayCadena[i] <= 122){
                cadenaFinal += (char)(arrayCadena[i] - 32);
            }
            else{
                if(arrayCadena[i] == 241){
                    cadenaFinal += (char)(arrayCadena[i] - 32);
                }
                else{
                    cadenaFinal += (char)arrayCadena[i];
                }
            }
        }
        return cadenaFinal;
    }
    
    /**
     * Método que recibe una cadena de texto y la devuelve en minúscula
     * @param cadena --> Cadena de texto que se convertirá a minúscula
     * @return --> Cadena de texto convertida a minúscula
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String convertirMinusculas(String cadena){
    
        //-----ATRIBUTOS-----//
        
        String cadenaFinal = "";
        char[] arrayCadena = cadena.toCharArray();
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] >= 65 && arrayCadena[i] <= 90){
                cadenaFinal += (char)(arrayCadena[i] + 32);
            }
            else{
                if(arrayCadena[i] == 209){
                    cadenaFinal += (char)(arrayCadena[i] + 32);
                }
                else{
                    cadenaFinal += (char)arrayCadena[i];
                }
            }
        }
        return cadenaFinal;
    }
    
    /**
     * Método que devuelve la longitud de una cadena
     * @param cadena --> Cadena de texto del que se quiere saber la longitud
     * @return --> Longitud de la cadena
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static long longitudCadena(String cadena){
        
        //-----ATRIBUTOS-----//
        
        char[] array = cadena.toCharArray();
        long contador = 0;
        
        //-----PROGRAMA-----//
        
        for(char letra:array){
            contador++;
        }
        return contador;
    }
    
    /**
     * Método que dice si una cadena empieza por un prefijo que el usuario le 
     * proporciona
     * @param cadena --> Texto principal que se comprobará
     * @param prefijo --> Prefijo con el que se comparará a cadena
     * @return --> Devuelve "true" si la "cadena" empieza por el "prefijo" o
     * "false" si no. 
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean empiezaCon(String cadena, String prefijo){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        char[] arrayPrefijo = prefijo.toCharArray();
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(prefijo); i++){
            if(arrayCadena[i] != arrayPrefijo[i]){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método que dice si una cadena acaba por un sufijo que el usuario le 
     * proporciona
     * @param cadena --> Texto principal que se comprobará
     * @param sufijo --> Prefijo con el que se comparará a cadena
     * @return --> Devuelve "true" si la "cadena" acaba por el "sufijo" o
     * "false" si no. 
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static boolean acabaEn(String cadena, String sufijo){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        char[] arraySufijo = sufijo.toCharArray();
        int auxiliar = (int)longitudCadena(sufijo) - 1;
        
        //-----PROGRAMA-----//
        
        for(int i = (int)longitudCadena(cadena) - 1; auxiliar >= 0 ; i--){
            if(arrayCadena[i] != arraySufijo[auxiliar]){
                return false;
            }
            auxiliar--;
        }
        return true;
    }
    
    /**
     * Método que devuelve la posicion en la que se encuentra un texto en una
     * cadena de texto
     * @param cadena --> Texto en el que se buscará la posición de la/s letra/s 
     * @param letra --> Letra/s que se buscara/n en la cadena de texto
     * @return --> Posición en la que se encuentra/n la/s letra/s
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static long posicionPrimeraCadena(String cadena, String letra){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        char[] arrayLetra = letra.toCharArray();
        int auxiliar; 
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena); i++){
            if(arrayCadena[i] == arrayLetra[0]){
                auxiliar = i;
                for(int j = 0; j < longitudCadena(letra); j++){
                    if(arrayLetra[j] == arrayCadena[auxiliar]){
                        if(j == longitudCadena(letra) - 1){
                            return i;
                        }
                    }
                    else{
                        break;
                    }
                    auxiliar++;
                }
            }
        }
        return -1;
    }
    
    /**
     * Método que devuelve una parte de la cadena de texto indicandole la 
     * posición de inicio
     * @param cadena --> Texto de donde se extraerá la subcadena
     * @param posicionInicio --> Posición desde la que se empezara a sustraer la
     * subcadena
     * @return --> Subcadena extraida de la cadena de texto
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String extraerSubstring(String cadena, int posicionInicio){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        String cadenaFinal = "";
        
        //-----PROGRAMA-----//
        
        for(int i = posicionInicio; i < longitudCadena(cadena); i++){
            cadenaFinal += arrayCadena[i];
        }
        return cadenaFinal;
    } 
    
    /**
     * Método que devuelve una parte de la cadena de texto indicandole la 
     * posición de inicio y la posición de fin
     * @param cadena --> Texto de donde se extraerá la subcadena
     * @param posicionInicio --> Posición desde la que se empezara a sustraer la
     * subcadena
     * @param posicionFinal --> Posición en la que acaba de extraer la subcadena
     * @return --> Subcadena extraida de la cadena de texto
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena = cadena.toCharArray();
        String cadenaFinal = "";
        
        //-----PROGRAMA-----//
        
        for(int i = posicionInicio; i != posicionFinal; i++){
            cadenaFinal += arrayCadena[i];
        }
        return cadenaFinal;
    }
    
    /**
     * Método que permite concatenar dos cadenas de texto mediante el operando +
     * @param cadena1 --> Primera cadena a concatenar
     * @param cadena2 --> Segunda cadena a concatenar
     * @return --> Resultado de concatenar "cadena1" y "cadena2"
     * @author Jesús Llorente Gutiérrez
     * @version 1.0
     */
    
    public static String concatenaCadenas(String cadena1, String cadena2){
    
        //-----ATRIBUTOS-----//
        
        char[] arrayCadena1 = cadena1.toCharArray();
        char[] arrayCadena2 = cadena2.toCharArray();
        String cadenaFinal = "";
        
        //-----PROGRAMA-----//
        
        for(int i = 0; i < longitudCadena(cadena1); i++){
            cadenaFinal += arrayCadena1[i];
        }
        for(int i = 0; i < longitudCadena(cadena2); i++){
            cadenaFinal += arrayCadena2[i];
        }
        return cadenaFinal;
    }  
    
    /**
     * Método principal de la clase CadenaAlumno
     * @param args --> Parámetros que recibe el método main
     */
    public static void main(String[] args){
    
    }
}


