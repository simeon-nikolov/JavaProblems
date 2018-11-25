package numbers.prime;

import java.util.Scanner;

public class SumPrimeNonPrime {
	public static void main(String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			long sumPrime = 0;
			long sumNonPrime = 0;

			while (true) {
				String input = scanner.nextLine();
				if (input.equals("stop")) {
					break;
				}

				int num = Integer.parseInt(input);
				boolean isPrime = num != 1;

				if (num < 0) {
					System.out.println("Number is negative.");
					continue;
				}

				for (int i = 2; i < Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
					}
				}

				if (isPrime) {
					sumPrime += num;
				} else {
					sumNonPrime += num;
				}
			}

			System.out.println("Sum of all prime numbers is: " + sumPrime);
			System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
		}
	}
}
