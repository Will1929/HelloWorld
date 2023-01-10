package PrimeiraLista;

public class HornersMethod {

	public static void main(String[] args) {

		int[] p = {1,3,81};
		
		int r = hornersM(p, 3, 0);
		
		System.out.println(r);
		
	}

	public static int hornersM(int[] P, int x, int n) {

		if (n == P.length - 1) {
			return P[n];
		}

		int result = P[n] + x * hornersM(P, x, n + 1);

		return result;

	}

}
