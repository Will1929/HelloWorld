package PrimeiraLista;

//3. Seja Sn := <s1, s2, s3,... sn> uma sequência de tamanho n>0. Considere a existência de
//duas funções auxiliares head(S) e tail(S) que devolvem <s1> e <s2, s3,... sn>,
//respectivamente. Usando indução, construa um algoritmo para reverter os caracteres de
//S.

public class Exercicio_3 {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4, 5 };

		for (int e : reverse(list, list.length-1, new int[list.length])) {
			System.out.print(e + " ");
		}

	}

	// Base case: n = 1, if the list is equal to 1 then by definition the list is
	// already reverted.
	// Induction hypothesis: I know how to revert a list of n - 1 elements.
	// Induction step: devise a strategy of how to use your hypothesis to revert a
	// list o n elements.

	// We can see that or hypothesis n - 1 is the Tail function.

	// S = [S1, S2, S3, ... . Sn]
	// S' = [Sn, S_n-1, ... , S2, S1]

	public static int[] reverse(int[] list, int pointer, int[] newList) {

		if (list.length == 1) {
			newList[pointer] = list[0];
			return newList;
		}

		int head = head(list);
		newList[pointer] = head;
		
		int[] tail = tail(list, list.length-1, new int[list.length - 1]);
		
		return reverse(tail, pointer - 1, newList);

	}

	public static int head(int[] S) {
		return S[0];
	}

	public static int[] tail(int[] S, int count, int[] P) {

		if (count == 0) {
			return P;
		}

		P[count - 1] = S[count];
		return tail(S, count - 1, P);

	}

}
