package fr.git.t2;

public class Affichage {

		public static void main(String[] args) {
			/*
			 * EXERCICE AFFICHAGEINVERSE � Cr�er une classe AffichageInverse � Soit le
			 * tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2,
			 * 3, 0, 14, -4} ;
			 * 
			 * 
			 * � Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans
			 * arrayCopy
			 */

			// � Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
			int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

			for (int x = 0; x < array.length; x++) {
				System.out.println(array[x] + " ");
			}
			System.out.println("----------------------------");

			// � Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau

			for (int y = (array.length - 1); y >= 0; y--) {

				System.out.println(array[y]);
			}

			System.out.println("----------------------------");

			// � Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans
			// arrayCopy

			/*
			 * int [] arrayCopy = new int [array.length];
			 * 
			 * int [] b = arrayCopy.clone(); System.out.println(b);
			 */

			int[] arrayCopy = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				arrayCopy[i] = array[i];
				System.out.println("Copie Elément : " + i + " : " + arrayCopy[i]);

			}

		}

	}
