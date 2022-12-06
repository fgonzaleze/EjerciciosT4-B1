package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
	    Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
	    Diseña también una función main() que lea los dos números de teclado (los pida al usuario) y llame
	    a la función. Desde el método main() se debe recoger el valor devuelto por la función en una variable
	    y mostrar el valor de dicha variable por pantalla.
	     */


	        //Declaramos las varaibles
	        int num1, num2;

	        //Declaramos el scanner
	        Scanner sc = new Scanner(System.in);

	        //Le pedimos al usuario que introduzca dos numeros enteros y los guardamos en las variables previamente declaradas
	        System.out.println("Introduzca un numero entero: ");
	        num1=sc.nextInt();

	        System.out.println("Introduzca otro numero entero: ");
	        num2=sc.nextInt();

	        //Imprimimos el resultado del metodo max() por pantalla
	        System.out.println("El numero mayor es " + max(num1, num2));

	        //Cerramos el scanner
	        sc.close();
	    }

	    /**
	     * Metodo que va a comprobar que numero de los introducidos por el usuario es mayor, si el
	     * @param num1 , o bien el
	     * @param num2 . El método devuelve como resultado el
	     * @return maximo, es decir, la variable donde hemos guardado el numero mayor
	     */
	    private static int max(int num1, int num2) {

	        //Decalramos las variables
	        int maximo = num2; //Decalramos que el segundo numero es la varaible maximo

	        if (num1>num2){     //Si el primer numero introducido por el usuario es mayor que el segundo
	            maximo=num1;    //Guardamos el primer numero en la variable maximo
	        }

	        return maximo;      //Devolvemos la variable maximo
	    }
	}


