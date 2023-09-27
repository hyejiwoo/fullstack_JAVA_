package com.company.day010_FOR;

public class For010 {
	public static void main(String[] args) {
		// ver0 소문자 a~z까지 모음의 갯수를 출력하시오.

		// ver1 'a'가 모음이라면('a','e','i','o','u')
		// ver1 'b'가 모음이라면('a','e','i','o','u')

		// ver2 if('a' == 'a' || 'a'=='e'||'a'=='i'||'a'=='o'||'a'=='u') {cnt++}
		// ver2 if('b' == 'a' || 'a'=='e'||'a'=='i'||'a'=='o'||'a'=='u') {cnt++}

		// ver3 {} {변수} for (시작; 종료; 변화)

		int cnt = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				cnt++;
			}
		}
		System.out.println("소문자 a~z까지 모음의 갯수를 출력하시오. :" + cnt);

	}

}
