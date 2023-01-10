package PrimeiraLista;

//5. Usando indução, elabore um algoritmo recursivo para calcular o menor elemento de
//um vetor X de n elementos.

public class Exercise_5 {

	// Base case: n = 1, the least element is the unique element of the list.
	// Induction hypothesis: assume that you know how to solve that problem for n -
	// 1 elements.
	// Induction step: create a way using your hypothesis to find the least element
	// on the list X.

	public static void main(String[] args) {

		int[] list = { 2,1, 3, -12,45, 5, -2};

		int min = min(list, list[0], 1);

		System.out.println("The minimum value of the list is: " + min);

	}

	public static int min(int[] list, int element, int pointer) {

		if (pointer == list.length) {
			return element;
		}

		if (list[pointer] < element) {
			element = list[pointer];
		}

		return min(list, element, pointer + 1);

	}

}
