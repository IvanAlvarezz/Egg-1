package Servis;

import Entidades.Cadena;
import java.util.Scanner;


public class ServisCadena {

    public Cadena crearCadena() {     //FUNCIONA BIEN
        Cadena c1 = new Cadena();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra");
        c1.setFrase(leer.nextLine());

        c1.setLongitudFrase(c1.getFrase().length());   //Calculamos la longitud de la frase
        System.out.println("Longitud de frase: " + c1.getLongitudFrase());

        return c1;
    }

    public void mostrarVocales(Cadena c1) {    //FUNCIONA BIEN

        int cont = 0; //CONTABILIZA LA CANTIDAD DE VOCALES
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if (c1.getFrase().charAt(i) == 'a' || c1.getFrase().charAt(i) == 'A'
                    || c1.getFrase().charAt(i) == 'e' || c1.getFrase().charAt(i) == 'E'
                    || c1.getFrase().charAt(i) == 'i' || c1.getFrase().charAt(i) == 'I'
                    || c1.getFrase().charAt(i) == 'o' || c1.getFrase().charAt(i) == 'O'
                    || c1.getFrase().charAt(i) == 'u' || c1.getFrase().charAt(i) == 'U') {
                cont++;
            }
        }
        System.out.println("Cantidad de vocales: " + cont);
    }

    public void invertirFrase(Cadena c1) {   //FUNCIONA BIEN
        System.out.print("Frase invertida: ");
        char[] invertir = c1.getFrase().toCharArray();  //Separamos la frase ingresada en letra por letra. Convierte la variable cadena a una char 
        int cont;
        for (cont = c1.getFrase().length() - 1; cont >= 0; cont--) {
            System.out.print(" " + invertir[cont]);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c1) {    //FUNCIONA BIEN
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        String frase = c1.getFrase();
        System.out.print("Ingrese una letra para saber cuantas veces se repite: ");
        String letra = leer.next();
        for (int i = 0;i < c1.getLongitudFrase();i++){
            if (letra.equalsIgnoreCase(String.valueOf(frase.charAt(i)))){
                cont++;
            }
        }
        System.out.println("La letra " +letra+ " se repite " +cont+ " veces.");
    }

    public void compararLongitud(Cadena c1) {    //FUNCIONA BIEN
        Scanner leer = new Scanner(System.in);
        boolean igualdad = false;
        System.out.println("Ingrese una nueva frase: ");
        String frase = leer.next();

        if (frase.equals(c1.getFrase())) {
            igualdad = true;
        }
        System.out.println(igualdad);
    }

    public void unirFrases(Cadena c1) {    //FUNCIONA BIEN
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para unir: ");
        String frase1 = leer.nextLine();

        String union = c1.getFrase().concat(", ".concat(frase1));
        System.out.println("Frases unidas: " + union);
    }

    public void reemplazar(Cadena c1) {    //FUNCIONA BIEN
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un caracter para remplazar las letras 'a': ");
        String carac = leer.next();

        String remplazo = c1.getFrase().replaceAll("a", carac);  //Indicamos primero el caracter a reemplazar y luego el ingresado
        System.out.println("" + remplazo);
    }

    public void contiene(Cadena c1) {    //FUNCIONA BIEN
        Scanner leer = new Scanner(System.in);
        boolean contiene = false;
        System.out.print("Ingrese una letra para saber si se encuentra o no en la frase: ");
        String letra = leer.next();
        
        String frase = c1.getFrase();
        for (int i = 0;i < c1.getLongitudFrase();i++){
            if (frase.charAt(i) == letra.charAt(0)){
                contiene = true;
            }
        }
        System.out.println(contiene);
    }
}
