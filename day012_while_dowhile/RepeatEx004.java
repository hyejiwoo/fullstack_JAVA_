package com.company.day012_while_dowhile;

public class RepeatEx004 {
	public static void main(String[] args) {
		int a = 12345;
		int box = 0;

		/*
		 * System.out.println(12345%10 + "/" +12345/10); System.out.println(1234%10 +
		 * "/" +1234/10); System.out.println(123%10 + "/" +123/10);
		 * System.out.println(12%10 + "/" +12/10);
		 */

					System.out.println("\n\n1. FOR");
					for (; a > 0;) {
						box += a % 10;
						a /= 10;
					}
					System.out.println(box);

					System.out.println("\n\n2. WHILE");
					a = 12345;
					box = 0;
					while (a > 0) {
						box += a % 10;
						a /= 10;
					}
					System.out.println(box);

					System.out.println("\n\n3. do WHILE");
					a = 12345;
					box = 0;
					do {
						box += a % 10;
						a /= 10;
					} while (a > 0);
					System.out.println(box);


	}
}
