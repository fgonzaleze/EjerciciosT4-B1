package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio03 {

	
		  /*
	    Realiza una función que calcule y muestre el área y el volumen de un cilindro, según se especifique.
	    Para distinguir un caso de otro se le pasará como opción un número: 1 (para el área) o 2 (para el volumen).
	    Además, hay que pasarle a la función el radio de la base y la altura del cilindro. Desde el método main(),
	    habrá que solicitarle al usuario la opción (1 ó 2), el radio de la base y la altura del cilindro.
	    A continuación, llamará a la función con estos parámetros.
	    Las funciones para calcular el área y el volumen de un cilindro son:
	                                área = 2 * radio * (altura + radio)
	                                volumen = pi * radio^2 * altura
	     */

	    //Declaramos el scanner para poder leer por consola
	    public static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        //Declaramos las variables
	        int opc;    //Varaible donde vamos a guardar la opción elegida por el usuario

	        //Le preguntamos al usuario que accion es la que desea realizar y guardamos la respuesta en la variable opc
	        System.out.println("""
	                ¿Que desea hacer?
	                [1] Saber el area del cilindro
	                [2] Saber el volumen del cilindro
	                """);
	        opc = sc.nextInt();

	        //Llamamos al metodo calculo y le pasamos por parametro la opción elegida por el usuario
	        calculo(opc);

	        //Cerramos el scanner
	        sc.close();
	    }

	    /**
	     * Metodo que según que opción lea que haya introducido el usuario en
	     * @param opc, calculará el area de un cilindro o su volumen
	     */
	    private static void calculo(int opc) {

	        //Declaramos las variables
	        double area;        //Variable donde vamos a guardar el calculo del area del cilindro
	        double volumen;     //Variale donde vamso a guardar el calculo del volumen del cilindro
	        int altura;         //Variable donde vamos a guardar la altura del cilindro introducida por el usuario
	        int radio;          //Variable donde vamos a guardar el radio de la base del cilindro introducido por el usuario

	        //Le pedimos al usuario que introduzca el radio de la base y la altura del cilindor y lo guardamos en sus variables correspondientes
	        System.out.println("Introduzca el radio de la base del cilindro: ");
	        radio = sc.nextInt();
	        System.out.println("Introduzca la altura del cilindro: ");
	        altura = sc.nextInt();

	        //Declaramos un switch y le pasamos por parametros opc. Gracias al switch podremos definir la accion que el usuario desea hacer
	        switch (opc) {
	            case 1: //Si escoge el usuario 1, calculamos el area del cilindro y lo mostramos por pantalla
	                area = (2*Math.PI) * radio * (altura + radio);
	                System.out.println("El area del cilindro es: " + area);
	                break;
	            case 2: //Si escoge el usuario 2, calculamos el volumen del cilindro y lo mostramos por pantalla
	                volumen = Math.PI * Math.pow(radio, 2) * altura;
	                System.out.println("El volumen del cilindro es: " + volumen);
	                break;
	            default: //Si no escoge ninguna de las otras dos oopciones lanzamos un mensaje de error
	                System.out.println("Opcion elgida no valida");
	                break;
	        }

	        //Cerramos el scanner
	        sc.close();
	    }

	}

