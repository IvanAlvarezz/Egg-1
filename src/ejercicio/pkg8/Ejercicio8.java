/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
LISTO• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
LISTO• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
LISTO• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
LISTO• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
LISTO• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
LISTO• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
LISTO• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio.pkg8;

import Entidades.Cadena;
import Servis.ServisCadena;

public class Ejercicio8 {

    public static void main(String[] args) {
        ServisCadena sc = new ServisCadena();
        Cadena c1 = sc.crearCadena();
        //Llamamos a los demas metodos

        sc.mostrarVocales(c1);
        sc.invertirFrase(c1);
        sc.vecesRepetido(c1);
        sc.compararLongitud(c1);
        sc.unirFrases(c1);
        sc.reemplazar(c1);
        sc.contiene(c1);
    }
}
