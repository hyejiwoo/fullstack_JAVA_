package com.company.day002_2;

public class A002 {
	public static void main(String[] args) {
		// 1. 자료형 변수이름;
		// 변수이름 =값;
		int v0;
		v0 = 1;
		System.out.println(v0);
		
		// 2. 자료형, 변수이름=값;
		int v1 = 1; // v1 사용 범위 시작
		{
					int v2 = 3; /* V1 사용 범위 시작 */
					System.out.println(v1);
					System.out.println(v2);
					/* v2 사용범위 시작 */

		}
		System.out.println(v1);
		// System.out.println(v2); // 오류))) 사용범위 밖이라 오류뜸
		/* V1 사용범위 시작 */

	}
	// System.out.println(v1);
	// system. out.println(v2); // 오류나는 이유인? v2 cannot be...
	/* v1 사용범위 끝 */
	//// 게시판 - A003~A007 변수 MISSION
}
