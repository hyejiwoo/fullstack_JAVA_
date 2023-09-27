package com.company.day012_while_dowhile;

public class RepeatEx003 {
	public static void main(String[] args) {
		// ver0 1+(-2)+3+(-4)+...>=100
		// ver1 int box=0;

		// 1 1 + (-2) 1+(-2)+3 1+(-2)+3+(-4)
		// box +=1
		// box +=-2
		// box +=3
		// box +=-4
		// box +=5
		// 짝수마다 음수로 처리.

		// ver3 box의 값이 100이 넘는 순간은?
		// int box=0;
		// box+= (1%2==0)?-1:1;
		// box+= (2%2==0)?-2:2;
		// box+= (3%2==0)?-3:3;




				System.out.println("\n\n1. FOR");
				int box = 0;
				for (int i = 1; i < 100; i++) {
					box += (i % 2 == 0) ? -i : i;
					if (box >= 100) {
					}
					System.out.println(i);
				}

				System.out.println("\n\n2. WHILE");
				box = 0;
				int i = 1;
				while (box < 100) {
					box += (i % 2 == 0) ? -i : i;
					if (box >= 100) {
						System.out.println(i);
					}
					i++;
				}

				System.out.println("\n\n3. do WHILE");
				box = 0;
				i = 1;
				do {
					box += (i % 2 == 0) ? -i : i;
					if (box >= 100) {
						System.out.println(i);
					}
					i++;
				} while (box < 100);

	}
}
