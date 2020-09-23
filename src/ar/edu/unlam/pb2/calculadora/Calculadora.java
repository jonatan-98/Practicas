package ar.edu.unlam.pb2.calculadora;

import java.util.Scanner;

public class Calculadora {


	 public static void main(String[] args){
		 
	 Integer a;
	 Integer b;
	 Character opcion;
	 Integer resultado=0;
	 
	 Scanner teclado = new Scanner(System.in);
	 
	 do{
	 System.out.println("Ingrese su operación:");
	 System.out.println("1 para restar");
	 System.out.println("2 para sumar");
	 System.out.println("3 para divdir");
	 System.out.println("4 para multiplicar");
	 opcion = teclado.next().charAt(0);
	 }while(opcion < 1 || opcion > 4);
	 
	 System.out.println("Ingrese el primer numero");
	 a = teclado.nextInt();
	 
	 System.out.println("Ingrese el segundo numero");
	 b = teclado.nextInt();
	 
 switch(opcion) {
	 
	 case '1': resultado = a - b;
	 break;
	 
	 case '2': resultado = a + b;
	 break;
	 
	 case '3': resultado = a / b;
	 break;
	 
	 case'4':resultado = a * b;
	 break;
	 
	 default: 
	 break;
	 
 }
	 System.out.println("El resultado es " + resultado.toString());
	 }  
	 
	
	
}
