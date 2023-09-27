package com.company.day006;

public class A003 {
	public static void main(String[] args) {
		// 먼저 ()
		// 값을 구하고(++, --, *, /, %, <<, >>)
		// 비교 (< > <= >= != ==)
		// 조건 후 (&&(n% ) 같아야 true || ! 반대면 true ^ 반대면 true)
		// 대입 (=)

		/*
		 * 조건 연산자 1. 논리 연산자 AND A && B - dead code 존재함. => 처음부터 false가 나왔다면 뒤(true)는 안
		 * 봐도 됨. A와 B가 조건 모두 맞아야 true
		 */
		System.out.println(false && true); // false - dead code
		System.out.println(true && false); // false
		System.out.println(true && (10 < 3)); // false
		System.out.println((10 <= 10) && (10 > 3)); // true

		System.out.println("1. 논리 연산자 AND=======================================");
		/*
		 * 2. 논리 연산자 OR || A || B -dead code 존재함 A 또는 B가 조건 하나라도 맞으면 true
		 */
		System.out.println(true || true); // true - dead code
		System.out.println(true || false); // true - dead code
		System.out.println(false || (10 > 3)); // true
		System.out.println((10 <= 10) || (10 > 3)); // true - dead code
		System.out.println((10 < 10) || (10 > 3)); // true
		System.out.println();

		System.out.println("2. 논리 연산자 OR=======================================");

		// 3. NOT ! TRUE
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(false || !(10 < 3)); // true
		System.out.println((10 <= 10) || !(10 > 3)); // true - dead code

		System.out.println("3. NOT         !		 TRUE=======================================");

		// 4. XOR 다르면 TRUE
		// & (and) 두 값이 '모두' true
		/*
		 * | (or) 두 값 중에 '하나라도' true ^ (xor) true ^ false 면 true (='다르면' true) false ^
		 * true 면 true (='다르면' true)
		 */
		System.out.println(true ^ true);
		// true^true = false
		System.out.println(true ^ false); // true
		System.out.println(false ^ 10 < 3);
		// false^false=false
		System.out.println(10 <= 3 ^ !(10 > 3));
		// false^false = false

		System.out.println("=======================================");

		System.out.println(false & true); // false
		System.out.println(true & false); // false
		System.out.println(true & 10 < 3); // true
		System.out.println((10 <= 3) & !(10 > 3)); // true

		System.out.println("=======================================");

		System.out.println(false | true); // true
		System.out.println(true | false); // true
		System.out.println(true | 10 < 3); // true
		System.out.println((10 <= 3) | !(10 > 3)); // true

		System.out.println("=======================================");
		// 5. || |의 차이점 (&&, || dead code)
		// #6. ++ --
		// 먼저 () 값을 구하고 (++ -- ! ~ ) 비교(< >) 조건 후 대입

		int v1 = 3, v2 = 3;
		System.out.println(false && ++v1 > 10); // ++은 <~~~(계산 순서)
		// false - dead code(뒤에있는 ++v1 읽지 않음.)
		System.out.println(false & ++v2 > 10);
		// false
		System.out.println(v1 + "/" + v2); // 3/4

		System.out.println("=======================================");

		int v3 = 3, v4 = 4;
		System.out.println(true || ++v3 > 10); // true
		System.out.println(true | ++v4 > 10); // true
		// ++3 <~~~
		System.out.println(v3 + "/" + v4); // 3/4

		System.out.println("=======================================");

		int a = 1, b = 1, c = 1, d = 1;
		System.out.println(++a); // 2 <~~ 변수 기준으로 ++a ++1
		System.out.println(b++); // <~~ 변수 기준으로 b출력후 1++ (=b출력후 1증가)
		System.out.println(a + "/" + b); // 2/2

		System.out.println(--c); // 0 --1
		System.out.println(d--); // 1 1--
		System.out.println(c + "/" + d); // 0/0

	}
}
