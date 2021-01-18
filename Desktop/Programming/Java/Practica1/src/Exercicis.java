/*
1. Prepara un menú que seleccione la ejecución de los diferentes ejercicios que se piden a 
continuación. Este menú se debe realizar con un switch.
2. Crea un método para todos y cada uno de los siguientes ejercicios. El método debe incorporar el 
calificador de acceso public static y tener un nombre adecuado a lo que se solicita. La llamada al 
método se debe realizar desde el switch codificado en el ejercicio anterior. Los métodos a codificar 
deben realizar lo siguiente:
- Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo 
  orden introducido. Lo 5 números se deben almacenar en un array.
- Leer 5 números y mostrarlos en orden inverso al introducido.
- Leer 5 números por teclado y a continuación realizar la media de los números positivos, 
  la media de los negativos y contar el número de ceros que se han introducido por teclado.
- Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
- Reciba como parámetro un texto y devuelva el texto invertido.
- Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
- Reciba como parámetro dos cadenas y las devuelva concatenadas.
- Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales de la cadena 
  por la vocal que se ha pasado como parámetro (no devuelve nada).
- Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la 
  cadena (no devuelve nada el método).
*/

import java.util.Scanner;


public class Exercicis {
	
	static Scanner scanner = new Scanner(System.in); //Variable global para leer datos del usuario.
	
	//MAIN
		public static void main(String[] args) {
			boolean repetir = true;
			int [] nums;
			while(repetir == true) {//Para que se pueda repetir la operacion
				mostrarMenu();
				System.out.print("> ");
				int valorMenu = scanner.nextInt();
				switch(valorMenu) {//Switch amb l'opcio de l'usuari
					case 1:
						nums = leer5num();
						numsEnOrden(nums);
						break;
						
					case 2:
						nums = leer5num();
						numsAlReves(nums);
						break;
					case 3:
						nums = leer5num();
						mediaYRecuento0(nums);
						break;
						
					case 4:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String txt1 = scanner.nextLine();
						txt1 = scanner.nextLine();
						int largo = contarLetras(txt1);
						System.out.println("El texto " + txt1 + " tiene un total de " 
						+ largo + " caracteres (contando los espacios)");
						break;
						
					case 5:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String txt2 = scanner.nextLine();
						txt2 = scanner.nextLine();
						txt2 = textoReves(txt2);
						System.out.println(txt2);
						break;
						
					case 6:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String txt3 = scanner.nextLine();
						txt3 = scanner.nextLine();
						txt3 = sinEspacios(txt3);
						System.out.println(txt3);
						break;
						
					case 7:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String cadena1 = scanner.nextLine();
						cadena1 = scanner.nextLine();
						System.out.println("Introduce otro texto: ");
						System.out.print("> ");
						String cadena2 = scanner.nextLine();
						String cadena3 = juntarCadenas(cadena1, cadena2);
						System.out.println(cadena3);
						
					case 8:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String txt4 = scanner.nextLine();
						txt4 = scanner.nextLine();
						System.out.println("Introduce una letra: ");
						System.out.print("> ");
						String letra = scanner.nextLine();
						cambiarVocales(txt4, letra);
						
					case 9:
						System.out.println("Introduce texto: ");
						System.out.print("> ");
						String txt5 = scanner.nextLine();
						txt5 = scanner.nextLine();
						mostrarCodigosASCII(txt5);
					default:
						repetir = false;
						System.out.println("Finalizacion de programa");
					
				}
			}
		}
	
	
	//Funcion para mostrar menu
	public static void mostrarMenu() {
		System.out.println(" ");
		System.out.println("----------------------------");
		System.out.println("Elije una de las siguientes opciones o una distinta"
				+ " para salir del programa:");
		System.out.println("1. Leer 5 números y mostrarlos en el mismo orden introducido. ");
		System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido.");
		System.out.println("3. Leer 5 números por teclado y a continuación realizar la media de los números positivos,\n  "
				+ " la media de los negativos y contar el número de ceros que se han introducido por teclado.");
		System.out.println("4. Reciba como parámetro un texto y devuelva la can"
				+ "tidad de caracteres que incorpora el texto.");
		System.out.println("5. Reciba como parámetro un texto y devuelva el texto invertido.");
		System.out.println("6. Reciba como parámetro un texto y lo devuelva sin espacios en blanco.\n"
				+ "7. Reciba como parámetro dos cadenas y las devuelva concatenadas.\n"
				+ "8. Reciba como parámetro una cadena y una vocal, el método "
				+ "sustituye todas las vocales\n  "
				+ " de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).\n"
				+ "9. Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los\n  "
				+ " caracteres de la cadena (no devuelve nada el método).");
		System.out.println("----------------------------");
		System.out.println(" ");
	}
	
	
	//Funcion para leer 5 numeros
	public static int[] leer5num() {
		//Declarar variables
		int [] nums;
		nums = new int[5];
		//Pedir al usuario los 5 numeros
		System.out.println("Escribe 5 numeros:");
		for(int i = 0; i<5; i++) {
			System.out.print("> ");
			nums[i] = scanner.nextInt();//Guardar los 5 numeros
		}
		return nums;
	}
	
	//Mostrar los numeros en el orden introducido al usuario.
	public static void numsEnOrden(int [] nums) {
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
	}
	
	//Mostrar los numeros en el orden inverso a los introducidos por el usuario.
	public static void numsAlReves(int [] nums) {
		for(int i = nums.length-1; i >= 0; i--){
			System.out.print(nums[i] + " ");
		}
	}
	
	
	//Hacer media de numeros positivos, negativos y contar los 0
	public static void mediaYRecuento0(int [] nums) {
		//Declrar variables
		int positivos = 0;
		int cuentaPos = 0;
		int negativos = 0;
		int cuentaNeg = 0;
		int zero = 0;
		double mediaPos;
		double mediaNeg;
		//Recorrer los numeros
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > 0){
				cuentaPos++;
				positivos+=nums[i];
			}else if(nums[i] < 0){
				cuentaNeg++;
				negativos+=nums[i];
			}else {
				zero++;
			}
		}
		//Hacer media y enseñar resultados
		mediaPos = (double)positivos/cuentaPos;
		mediaNeg = (double)negativos/cuentaNeg;
		System.out.println("La media de los numeros positivos es: " + mediaPos);
		System.out.println("La media de los numeros negativos es: " + mediaNeg);
		System.out.println("Hay un total de: " + zero + " zeros");
	}
	
	
	//Funcion para ver la cantidad de caracteres que tiene un texto.
	public static int contarLetras(String txt) {
		int largo;
		largo = txt.length();
		return(largo);
	}
	
	//Funcion que pone el texto al reves
	public static String textoReves(String txt) {
		String reves = "";
		for(int i = txt.length()-1; i >= 0; i--) {
			reves = reves + txt.charAt(i);
		}
		return(reves);
	}
	
	//Funcion que pone la cadena sin espacios
	public static String sinEspacios(String txt) {
		txt = txt.replace(" ", "");
		return(txt);
	}
	
	//Funcion para juntar 2 cadenas
	public static String juntarCadenas(String cad1, String cad2) {
		return (cad1.concat(cad2));
	}
	
	//Esta funcion cambia todas las vocales de un texto por una letra distinta
	public static void cambiarVocales(String txt, String letra) {
		txt = txt.replace("a", letra);
		txt = txt.replace("e", letra);
		txt = txt.replace("i", letra);
		txt = txt.replace("o", letra);
		txt = txt.replace("u", letra);
		System.out.println(txt);
	}
	 
	//Mostar un texto en ASCII
	public static void mostrarCodigosASCII(String txt) {
		for(int i = 0; i < txt.length(); i++) {
			System.out.print(txt.codePointAt(i) + " ");
		}
	}
	
	
	

}

