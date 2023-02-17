//El codigo recibe mediante consola un numero y analiza si dicho numero es afortunado o no
//Se logro hacer que recibiera dato y que mostrara los numeros, pero numeros multiplos de los elegidos
//No se lograron detectar como afortunados
import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) { // Todo el codigo se inserto en el main
		Scanner s = new Scanner(System.in); // Se importo libreria Scanner y se agrego
											// el parametro para la entrada desde consola
		System.out.print("Introduzca un número: ");// Se cambio ` por "
		int  ni = (int) s.nextFloat();// Se actualizo el tipo de dato y la funcion nextFloat()
								//Permitiendo el recibir datos float y convertirlos a enteros
		int c = ni;

		int afo = 0;
		int noAfo = 0;

		while (c > 0) {//Se cambio a utilizar la variable declara de c en vez de la que recibe el dato de consola
			
			int digito = (int) (c % 10);
			
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
				
			} else {
				noAfo++;
				System.out.println(c);
				c /= 10;
			}

			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado.");// Se agrego t en prinln -> println
				break;
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}

		}
	}

}