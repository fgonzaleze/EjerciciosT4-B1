package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio08 {
	
	  /*
    Diseñar la función calculadora(), a la que se le pasan dos números reales (operandos) y qué operación
    se desea realizar con ellos. Las operaciones disponibles son sumar, restar, multiplicar o dividir.
    Estas se especifican mediante un número: 1 para la suma, 2 para la resta, 3 para la multiplicación y 4
    para la división. La función devolverá el resultado de la operación mediante un número real. Diseña
    un método main() que pruebe el funcionamiento de dicha función.
     */

	public static void main(String[] args) {
	    double num1, num2;
	    
	    Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca dos numeros enteros y los guardamos en las variables previamente declaradas
        System.out.println("Introduzca un numero: ");
        num1=sc.nextDouble();

        System.out.println("Introduzca otro numero: ");
        num2=sc.nextDouble();

        System.out.println(calculadora(num1, num2));

        //Cerramos el scanner
        sc.close();
    }

    private static double calculadora(double num1, double num2) {

        int opc;
        double resultado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            Indique qué operacion desea realizar:
                            [1] Suma
                            [2] Resta
                            [3] Multiplicacion
                            [4] Division
                            """);
        opc= sc.nextInt();

        switch (opc){
            case 1:
                resultado=num1+num2;
                break;
            case 2:
                if (num1>num2){
                    resultado=num1-num2;
                }else {
                    resultado=num2-num1;
                }
                break;
            case 3:
                resultado=num1*num2;
                break;
            case 4:
                if (num1>num2){
                    resultado=num1/num2;
                }else {
                    resultado=num2/num1;
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                

        }

        return resultado;
        
    }
	

}
