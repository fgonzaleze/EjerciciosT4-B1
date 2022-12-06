package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio06 {
	
	  /*
    Diseña una función con el siguiente prototipo:
        boolean esPrimo(int n)
        La función debe devolver true si n es primo y false en caso contrario. Diseña un método main() que
        pruebe el funcionamiento de dicha función.
     */

	public static void main(String[] args) {
		 //Declaramos las variables
        int num;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero ylo guardamos en la varaible num
        System.out.println("Introduzca un numero entero para averiguar si es o no primo: ");
        num = sc.nextInt();

        System.out.println(esPrimo(num));

        //Cerramos el scanner
        sc.close();
    }

    
    public static boolean esPrimo(int n) {
        //Declaramos las variables
        boolean esPrimo = true;

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
	}


