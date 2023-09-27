package com.company.day010_FOR;

public class For004 {
    public static void main(String[] args) {
        //FOR004 FOR01~10 까지의 합
        //FOR 문을 이용하여 1~10까지의 합을 구하는 프로그램을 작성하시오.
        // ver0 1~10까지의 합 55
    	// ver1 int box=0;   box[0]
    	//		int box+1;   box[0+1]
    	//		int box+2;   box[0+2]
    	//		int box+3;   box[0+1+2+3]

    	// int box=0;
        // box에 1 담기 box+=1;
        // box에 2 담기 box+=1;
        // box에 3 담기 box+=1;
        // box에 4 담기 box+=1;
        // box에 5 담기 box+=1;

        //변수
        int box =0;

        //입력

        //처리
        for(int i = 1; i<=10; i++ ){
            box += i;
            System.out.println(box);
        }

        //추가
    }
}
