package com.company.day010_FOR;

public class For004_2 { // For004_2로 이름 변경하기. (For004의 또 다른 코드.)
	public static void main(String[] args) {
		// FOR004 FOR01~10 까지의 합
		// FOR 문을 이용하여 1~10까지의 합을 구하는 프로그램을 작성하시오.
		// ver0 1~10까지의 합 55
		// ver1 int box=0; box[0]
		// int box+1; box[0+1]
		// int box+2; box[0+2]
		// int box+3; box[0+1+2+3]

		// ver2 총합을 담을 변수
		int box = 0;

//    	{} {변수}  for(시작; 종료; 변환;)
		for (int i = 1; i <= 10; i++) {
			box = box + i;
		}
		System.out.println("1~10까지의 합" + box);

		// upgrade
		box = 0;
		String result = "";
		for (int i = 1; i <= 10; i++) {
			result = (i == 1 ? "" : "+") + i;
			box = box + i;

		}
		System.out.println("=" + box);

	}
}
