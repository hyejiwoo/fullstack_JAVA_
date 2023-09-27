package com.company.day014_arr1;

public class Arr1Ex001 {
	public static void main(String[] args) {
		// ver 0 'B'가 a라면 카운트증가
		// 'a'가 a라면 카운트 증가

		// ver1 if('B'가 a라면) {카운트 증가}
		// if('a'가 a라면) {카운트 증가}

		// ver2
		// if('B'가 a라면) {카운트 증가}
		// if('a'가 a라면) {카운트 증가}s
		// -> 'B'가 ch배열 0 ch[0]
		// -> 'a'가 ch배열 1 ch[1] {cnt++;}

		// ver3 if(ch[0]== 'a'){ch++;}
		// if(ch[1]== 'a'){ch++;}
//
//		char ch[] = {'B','a','n','a','n','a'};
//		ch  = new char[5];
//		char datas = ' ';
//
//			ch [0] = datas++;
//			ch [1] = datas++;
//			ch [2] = datas++;
//			ch [3] = datas++;
//			ch [4] = datas++;
//
//			for(int i=0; i<ch.length; i++) {
//				if(ch[0]== 'a'){datas++;}
//				else if(ch[1]== 'a'){datas++;}
//				System.out.println(ch[i]);
//			}
//			System.out.println("a의 갯수 :" + datas);
//

		// System.out.println("*********************");
//
//
//			char ch1[] = {'B', 'a', 'n', 'a', 'n', 'a'};
//			System.out.println("a의 갯수 : " + 3);
//
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("테스트 배열의 크기 : ");
//		int length = sc.nextInt();
//
//		String[] test = new String[length];
//
//		for (int i = 0; i < test.length; i++) {
//			System.out.print("테스트 배열 : ");
//			test[i] = sc.next();
//		}
//
//		System.out.print("테스트 배열 : " + Arrays.toString(test));
//
//		test(test);
//	}

		// private static void test(String[] test) {

//		int count = 0;
//		for (int i = 0; i < test.length; i++) {
//
//			System.out.println("테스트 배열 " + i + test[i]);
//			if (test[i].equals("a")) {
//				// equals : 참조타입 중 String인 경우 값을 비교.
//				System.out.println("if 문 들어옴");
//				count++;
//			}
//			System.out.println("count : " + count);
//		}
//
//		System.out.println("a의 갯수 : " + count);
//	}
//
//}

		char ch[] = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				cnt++;
			}
		}
		System.out.println("a의 갯수 : " + cnt);

	}
}
