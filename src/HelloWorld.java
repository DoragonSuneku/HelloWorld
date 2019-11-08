
public class HelloWorld {
	 

	public static void main(String[] args) {
int number=0;
		for (int a = 3; a <= 1000; a++) {
			number++;
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(number) && isPrime; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(number + " ");

			}

		}

	}
}
