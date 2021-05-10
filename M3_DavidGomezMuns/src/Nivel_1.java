import java.util.Arrays;

import javax.swing.JOptionPane;

public class Nivel_1 {
	// Campos de clase
	private static final int ciudades = 6;
	private static String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;
	private static String[] arrayCiudades = new String[ciudades];
	private static String[] arrayCiudadesModificadas = new String[arrayCiudades.length];
	private static char[] c1, c2, c3, c4, c5, c6;
	private static int cont = 1;

	// Método main
	public static void main(String[] args) {
		
		// LLamar métodos
		System.out.println("FASE 1: Imprimir ciudades\n*************************");
		fase_1();

		System.out.println("\n\nFASE 2: Ciudades por orden alfabético\n*************************************");
		fase_2();

		System.out.println("\n\nFASE 3: Ciudades modificadas por orden alfabético\n*************************************************");
		fase_3();

		System.out.println("\n\nFASE 4: Ciudades con el nombre invertido\n****************************************");
		fase_4(ciudad1, c1);
		fase_4(ciudad2, c2);
		fase_4(ciudad3, c3);
		fase_4(ciudad4, c4);
		fase_4(ciudad5, c5);
		fase_4(ciudad6, c6);

	}

	// Método para capturar nombre ciudad e imprimir en consola
	public static void fase_1() {

		while (cont <= ciudades) {

			// Capturar datos usuario y guradar en variable temporal
			String temp = JOptionPane.showInputDialog("Introduce ciudad " + cont);

			// Inicializar campos de clase según valor de contador
			if (cont == 1)
				ciudad1 = temp;
			if (cont == 2)
				ciudad2 = temp;
			if (cont == 3)
				ciudad3 = temp;
			if (cont == 4)
				ciudad4 = temp;
			if (cont == 5)
				ciudad5 = temp;
			if (cont == 6)
				ciudad6 = temp;

			cont++;
		}
		System.out.print(ciudad1 + ", " + ciudad2 + ", " + ciudad3 + ", " + ciudad4 + ", " + ciudad5 + ", " + ciudad6);
	}

	// Método para guardar nombres de ciudades en un array, ordenarlos
	// alfabéticamente e imprimir en consola
	public static void fase_2() {

		// Guardar ciudades en array
		arrayCiudades[0] = ciudad1;
		arrayCiudades[1] = ciudad2;
		arrayCiudades[2] = ciudad3;
		arrayCiudades[3] = ciudad4;
		arrayCiudades[4] = ciudad5;
		arrayCiudades[5] = ciudad6;

		// Ordenar array alfabéticamente
		Arrays.sort(arrayCiudades);

		// Imprimir array
		for (String c : arrayCiudades) {
			System.out.print(c + ", ");
		}
	}

	// Método para modificar nombre de ciudades e imprimir en consola
	public static void fase_3() {

		// Recorrer array ciudades
		for (int i = 0; i < arrayCiudades.length; i++) {

			// Modificar elementos array ciudades y guardar en un nuevo array
			arrayCiudadesModificadas[i] = arrayCiudades[i].replace('A', '4');

			// Imprimir nuevo array
			System.out.print(arrayCiudadesModificadas[i] + ", ");
		}
	}

	// Método para convertir de string a array de caracteres, invertir nombre ciudad
	// e imprimir en consola
	public static void fase_4(String ciudad, char[] ch) {

		// Convertir de string a array de caracteres
		ch = ciudad.toCharArray();

		// Recorrer array en orden inverso
		for (int i = ch.length - 1; i >= 0; i--) {
			// Imprimir array
			System.out.print(ch[i]);
		}
		System.out.print(", ");
	}

}
