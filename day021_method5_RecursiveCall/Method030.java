package com.company.day021_method5_RecursiveCall;

public class Method030 {
	public static void main(String[] args) {
		// public statci 리턴값 메서드명(파라미터){}
		/*
		 * String name [] = {"아이언맨", "헐크", "캡틴", "토르", "호크아이"};
		 * int size = name.length;
		 * 
		 * int [] kor = {100,20,90,70,35};
		 * int [] eng = {100,50,95,80,100};
		 * int [] mat = {100,30,90,60,100};
   		 * int avg[] = new int[5];			int rank[] = {1,1,1,1};
   		 * String pass[] = new String[5];
   		 * String jang [] = {"","","","",""};
 		 * String star [] = {"","","","",""};
		 * 
		 * 
		 * #1)	process_aver - 평균 구하는 메서드를 작성하시오.
		 * for(int i=0; i<name.length; i++) {avg[i] = process_avg(kor[i], eng[i], mat[i]);}
		 * 
		 *  #2) process_rank 	- 등수 구하는 메서드를 작성하시오.
		 *  process_rank(size, avg, rank);
		 *  
		 *  #3 ) process_scholar - 장학생 95점이상으로 처리하는 메서드를 작성하시오.
		 *  process_scholar(avg, jang);
		 *  
		 *  #4) process_pass - 합격, 불합격, 재시험을 처리하는 메서드를 작성하시오.
		 *  - 평균이 60 이상이라면 합격, 아니면 불합격
		 *  - 합격중에서도 각 과목 국어, 영어, 수학 과목중에 한개라도 40점미만인게 있다면 재시험
		 *  process_pass(avg, kor, eng, mat, pass);
		 *  
		 *  #5 ) process_star - 평균점수대로 별을 처리하시오.
		 *  - ... 70점대이면 별 7 개, 80점대이면 별 8개, 90점대이면 별 9개, 100점이면 별 10개
		 *  process_star(avg, star);
		 *  
		 *  #6) process_show - 출력예시와 같이 출력하는 메서드를 작성하시오.
		 *  procsess_show(name, kor, eng, mat, avg, rank, pass, jang, star);
		 * 
		 * */
	
		String name [] = {"아이언맨", "헐크", "캡틴", "토르", "호크아이"};
		int size = name.length;
		int [] kor = {100,20,90,70,35};
		int [] eng = {100,50,95,80,100};
		int [] mat = {100,30,90,60,100};
  		int avg[] = new int[5];			int rank[] = {1,1,1,1};
  		String pass[] = new String[5];
  		String jang [] = {"","","","",""};
		String star [] = {"","","","",""};
	
	}
	public static void process_aver(int avg) {
//		for(int i=0; i<name.length; i++) {avg[i] = process_avg(kor[i], eng[i], mat[i]);
//		}
	}
	
	 public static void process_rank(int size, int avg, int rank) {};
	 
	 
	 public static void  process_scholar(int avg, int jang) {};
	 
	 
	 public static void process_pass(int avg,int kor, int eng, int mat, int pass) {};
	 
	 
	 public static void process_star(int avg,int  star) {};
	 
	 
	 public static void procsess_show(String name, int kor, int eng,
			 																				int mat,int avg,int rank,
			 																				String  pass,String  jang, String star) {};
}



