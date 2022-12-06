package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		 /*
	    Crear una función que devuelva un tipo booleano que indique si el carácter que se pasa como parámetro
	    de entrada corresponde con una vocal. Diseña un método main() que pruebe el funcionamiento de dicha función.
	     */


	    /**
	     * Precondición: el usuario debe introducir un solo carácter, y este debe ser una letra del alfabeto.
	     *               El usuario no puede introducir una cadena de texto ni ningún otro carácter que no sea una letra
	     */

		 //Declaramos las varaibles
        String letra;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una letra y la guardamos en la variable previamente declarada
        System.out.println("Introduzca una letra: ");
        letra=sc.next();

        //Mostramos por pantalla el metodo esVocal y le pasamos por parametros la variable letra
        System.out.println(esVocal(letra));

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Metodo que identifica si
     * @param letra la introducida es una vocal y devuelve
     * @return esVocal, una varaible booleana que es true si la letra es vocal y false si no lo es
     */
    private static boolean esVocal(String letra) {

        //Declaramos las varaibles
        boolean esVocal=false;

        //En un switch case le pasamos la letra introducida por el usuario por parámetros
        switch (letra){
            case "a", "e", "i", "o", "u" :              //En el caso de que la letra sea una vocal
                esVocal=true;                           //La varaible booleana se vuelve verdadera
                System.out.println("Es una vocal");     //Imprimimos que la letra introducida es una vocal
                break;                                  //Nos salimos del switch
            default:                                    //Si no es ninguna de las vocales
                System.out.println("No es una vocal");  //Imprimimos que la letra introducida no es una vocal
                break;                                  //Nos salimos del bucle
        }

        return esVocal;                                 //Devolvemos la variable booleana esVocal
    }
	}


