package com.company.day017;

public class Arr2Ex005 {
	public static void main(String[] args) {
		// Wrapper 클래스
		// Type mismatch : cannot convert from int to String
		// 문제 발생 : String str = 10;

		// 해결 방안 : (1) :
		String str = "" + 10;
		// 스트링을 보완한 스트링 버퍼??? 문자열은 수정이 안되는 자료형이다. 위에 처럼 적으면 주소값이 변한다.
		// 1000번지 "", 1001번 ""+10

		// 해결 방안 : (2)
		String str2 = String.valueOf(10);

		// STEP2 부품객체(class )인지 값(value)인지 구분.
		// Wrapper클래스 : 부품객체를 사용할 수 있도록 하는 것.
		Integer i1 = 100; // just 값. i0.은 기능 안 나와요.
		int i0 = 100; // 부품객class. 기능을 사용할 수 있다. i1.은 기능들이 쫘르륵 나와요.

		// boxing vs unboxing(collection framework에서 나옴.)
		int i2 = i1; // 값이랑 부품객체 클래스를 왔다갔다 할 수 있다는 뜻. = unboxing 값
		int i3 = i1 + 10; // unboxing 값
		Integer i4 = 10; // boxing 부품객체
		Integer i5 = new Integer(100); // 안 써서 생성자가 사라진 것. == 할배코드.
		int i6 = Integer.parseInt("10") + 3;
		double d1 = Double.parseDouble("3.14");

		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.parseInt("10") - 3);

		// 문자열 비교
		// 문자열 .equals(문자열)
		String test1 = "abc";
		String test2 = new String("abc");
		System.out.println(System.identityHashCode(test1));
		System.out.println(System.identityHashCode(test2));
		System.out.println(test1 == test2);
		System.out.println(test1.equals(test2));

	}
}
