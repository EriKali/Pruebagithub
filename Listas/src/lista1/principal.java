package lista1;

import java.util.Scanner;


public class principal {
	
	public static void main(String[] args) {
		
		/* switch (dato){
		      case 1: Instrucciones 1;
		      		  break;
			  case 2: Instrucciones 2;
		      		  break;
		      case n: Instrucciones n;
		      		  break;
		      default: CasoContrario;
		      		  break;
		*/
		Scanner entrada = new Scanner(System.in);
		int dato; 
		
		System.out.println("Digite numero entre 1 y 3: ");
		dato = entrada.nextInt();
		
		
		switch(dato){
			case 1: System.out.println("Es el numero 1");
			
			case 2: System.out.println("Es el numero 2");
			break;
			case 3: System.out.println("Es el numero 3");
			break;
			default: System.out.println("El numero no esta en el rango 1 a 3");
		 
		}
		
		}
		
	}


