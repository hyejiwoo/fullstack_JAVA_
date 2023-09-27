package com.company.day019;

import java.util.Scanner;

public class Method013 {  
	
	public static void main(String[] args) {
		/////////////////////(1)  변수
		String name  = ""; 
		int kor, eng, math, total ;
		float avg = 0.0f; 
		String pass = "";
		String jang = "";
		String star= ""; 
		String level_kor="" , level_eng="" , level_math="";
		String re = ""; 
		
		/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
		/*
		System.out.println("이름입력 > ");  name = scanner.next();
		System.out.println("국어입력 > ");   kor = scanner.nextInt();
		System.out.println("영어입력 > ");   eng = scanner.nextInt();
		System.out.println("수학입력 > ");  math = scanner.nextInt();
		*/
		System.out.println("이름입력 > ");  name = inputName();
		System.out.println("국어입력 > ");   kor = inputNum();
		System.out.println("영어입력 > ");   eng = inputNum();
		System.out.println("수학입력 > ");  math = inputNum();
		
		/////////////////////(3) 처리 : 
		total = process_total(kor , eng, math); 
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static int process_total(int kor , int eng, int math){ 총점 } 
		
		avg = process_avg(total); 
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static float process_avg(int total){ 합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  } 
		 
		pass = process_pass(avg , kor, eng, math);  
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static String process_pass(float avg ,int kor,int eng,int  math,String pass){ 해야할일 } 
		 // 합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  } 
		
		
		//////// 평균이 95점이상이면 장학생
		jang = process_scholar(  avg  );
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static String process_scholar(float avg){ 평균이 95점이상이면 장학생 } 
		
		
		//////// 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		star = process_star(avg);
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static String process_star(float avg){ 평균점수대로 별표 붙이기 } 
		  
		level_kor     = process_level( kor );    
		level_eng     = process_level( eng );
		level_math    = process_level( math );
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static String process_level(int data){ 해야할일 } 
		
		
		re = process_re( kor ,  eng , math );  
		//public static 리턴값 메서드명(파라미터){ 해야할일 } 
		//public static String process_re(int kor , int  eng ,int math ){ 재시험	-	O	- } 
		 
		/////////////////////(4) 출력 : 
		/*
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
		이름		국어	영어	수학	총점  평균	 합격여부	장학생	랭킹
		--------------------------------------------------------------------------------------------
		아이언맨	100	100	100	300    100.0	 합격		장학생	**********
		--------------------------------------------------------------------------------------------
				수	수	수
		--------------------------------------------------------------------------------------------
		재시험	-	-	-
		--------------------------------------------------------------------------------------------		
		*/
		line1();     //::::::  public static void line1(){:::::: }
		process_show(name, kor, eng, math, total, avg, pass, jang, star);
		line2();     //------  public static void line2(){------ }
		process_show2(level_kor ,level_eng , level_math );   
		line2();     //---------
		process_show3(re );    
		line2();     //---------  
		
		
	}// end main
	
	
	public static void line1(){ 
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); 
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		line2();
	}
	public static void line2(){ System.out.println("-------------------------------------------------------------------------------------------"); }
	
	public static void process_show(String name,int kor,int eng,int  math,int  total, float avg,String pass,String  jang, String star) {
		System.out.println(name +"\t" + kor +"\t" + eng+"\t" + math +"\t"+ total + "\t" +String.format("%.2f" ,avg) +"\t" + pass+"\t"+jang +"\t"+star)  ;
	}
	
	public static void process_show2(String  level_kor ,String level_eng , String  level_math ){
		System.out.println("\t" + level_kor + "\t" + level_eng+"\t"+level_math);
	}
	public static  void process_show3(String re ){
		System.out.println(re);
	}
	
	public static int process_total(int kor , int eng, int math){ 
		return kor + eng + math;
	} 

	public static float process_avg(int total){ 
		return total/3f; 
	} 
	public static String process_pass(float avg ,int kor,int eng,int  math ){ 
		return avg<70?"불합격" : 
			   kor<40 || eng<40 ||math<40?"재시험" :"합격";
	}  // pass 파라미터 불필요함!
	 
	public static String process_scholar(float avg){ 
		return avg>=95?"장학생":""; 
	} 
	public static String process_star(float avg){ 
		String result="";
		for(int i=0; i<(int)avg/10; i++) { result+="★"; }
		return result;
	} 
	public static String process_level(int data){ 
		return data>=90?"수":data>=80?"우":
			   data>=70?"미":data>=60?"양":"가"; 
	} 
	public static String process_re(int kor , int  eng ,int math ){ 
		String result ="재시험\t";
			   result += (kor <40? "O":"-") + "\t";	
			   result += (eng <40? "O":"-") + "\t";	
			   result += (math<40? "O":"-") + "\t";	
		return result;
	}
	
	public static int inputNum(){ 
		Scanner scanner = new Scanner(System.in); 
		return scanner.nextInt();
	}  
	public static String inputName(){ 
		Scanner scanner = new Scanner(System.in); 
		return scanner.next();
	} 

}// end class


