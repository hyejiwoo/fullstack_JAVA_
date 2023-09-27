package com.company.day018;

public class Method005 {

	// 0. 코드 재활용
	// 1. 기본구조 메서드명()을 호출하면 {여기부터}여기까지 자동 처리
	// 리턴값 메서드명(파라미터 ){}
	public static void main(String[] args) {
		washer1(); // public static 리턴값 메서드명1 (파라미터) {}
		washer2(1); // public static 리턴값 메서드명2 (int a) {}

		System.out.println("세제 한 스푼 더 > " + washer3(1) + "스푼");
		// 세제 한 스푼 더 > 2 스푼
		// public static 2 washer3 (1 ) {}
		// public static 리턴값 washer3 (자료형 변수) {}
		// public static int washer3 (int a) { return a*2; }

//			System.out.println("현재 온도와 올릴 온도  >" + washer4(35, 1.5) + "도");
		// 현재 온도와 올릴 온도 > 36.6 도
		// public static 리턴값 washer4 (파라미터) {}
		// public static 36.6 washer4 (35,1.5) {}
		// public static double washer4 (int a, double b) { }

		
// =================================
		
		System.out.println("1. 내가 좋아하는 숫자    :" + return_num());
		// 결과물: 1. 내가 좋아하는 숫자 : 1

		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		// 결과물: 2. 10/3.0을 실수로 표현 : 3.3333
		// public static 리턴값 메서드명(파라미터)
		// public static 3.3333 return_float(){}
		// public static float return_float(){return 3.3333f;}

		System.out.println("3. BEST COLOR  :" + mycolor());
		// 결과물: 3. BEST COLOR : PURPLE
		// public static 리턴값 메서드명(파라미터)
		// public static PUPLE mycolor(){}
		// public static String mycolor(){return PURPLE;}

		System.out.println("4. 장수돌침대 별이 :" + jangsu());
		// 결과물: 4. 장수돌침대 별이 : ★★★★★
		// public static 리턴값 메서드명(파라미터)
		// public static ★★★★★ jangsu(){}
		// public static String jangsu(){return "★★★★★";}

		System.out.println("5. 10+20= " + myadd(10, 20));
		// 결과물: 5. 10+20= 30
		// public static 리턴값 메서드명(파라미터)
		// public static 30 myadd(){}
		// public static int myadd(){return a+b;}

		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));
		// 결과물: 6. 반(노랑조/주황조)= 나는 노랑조
		// public static 리턴값 메서드명(파라미터)
		// public static 노랑조 myban('B'){}
		// public static String myban(char ban){return == 'B'? 노랑조 : 주황조;}

		System.out.println("7. 당신의 학번은?" + stdId(1111));
		// 결과물: 당신의 학번은? G1111
		// public static 리턴값 메서드명(파라미터)
		// public static G1111 stdId(int a){}
		// public static String stdId(int a){return "G"+a;}

		System.out.println("8. 당신의 평균은?" + stdAvg(88));
		// 90~100사이면 A리턴 , 80~90미만 B리턴 , 70~80미만 C리턴 , 그이외 D
		// 결과물: 당신의 평균은? B
		// public static 리턴값 메서드명(파라미터)
		// public static B stdAvg(int a){}
		// public static char stdAvg(int avg){}

	}

	/*															*/
	public static void washer1() {
		System.out.println("세탁을 시작합니다.");
	}

	public static void washer2(int a) {
		System.out.println(a + "타입으로 세탁을 시작합니다.");
	}

	// <순서>
	// 결과물 먼저 체크.
	// public static 2 washer3(1) {}
	// public static 리턴값 washer3(자료형 변수) {}
	public static int washer3(int a) {
		return a * 2;
	}

//	public static void washer4(int i, double d) 
//	{System.out.println("현재 온도와 올릴 온도  >" + washer4(35, 1.5) + "도");}


	//======================================
	
	public static int return_num() {
		return 1;
	}

	public static float return_float() {
		return 3.3333f;
	}

	public static String mycolor() {
		return "PURPLE";
	}

	public static String jangsu() {
		return "★★★★★";
	}
	
	public static int myadd(int a, int b) {
		{
			return a + b;
		}
	}

	public static String myban(char ban) {
		{return(ban == 'B')? "노랑조" : "주황조";}
	}

	public static String stdId(int a) {
		{
			return "G" + a;
		}
	}

	public static char stdAvg(int avg) {
		char result = 'D';
		if (avg >= 90) {
			result = 'A';
		} else if (avg >= 80) {
			result = 'B';
		} else if (avg >= 70) {
			result = 'C';
		}
		return result;
		/* return ave>=90? 'A' : avg>=80? 'B'>=70? 'C'>=60; */
	}

}
