import java.util.Arrays;

public class PrimzahlenSieb {

	static int length = 100000;

	public static void main(String[] args) {
		long timer = System.nanoTime();
		boolean[] primzahlen = new boolean[length + 1];

		Arrays.fill(primzahlen, Boolean.TRUE);

		for (int i = 2; i <= length; i++) {

			// primzahlen[i] = true;

			if (primzahlen[i]) {
				for (int j = i; j <= length; j = j + i) {
					primzahlen[j] = false;

				}

				System.out.println(i);

			}

		}
				timer = System.nanoTime() - timer;
				System.out.println("Laufzeit " + timer / 1000000 + "ms");
	}

}
