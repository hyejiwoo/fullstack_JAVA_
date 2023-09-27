package com.company.day010_FOR;

import java.util.Scanner;

public class RepeatIF {
    public static void main(String[] args) {
        //변수
        int num1 = 0;
        int num2 = 0;
        char op ='\u0000';   String result =" ";
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("1. 정수를 하나 입력해주세요. >");
        num1 = scanner.nextInt();
        System.out.print("2. 정수를 하나 입력해주세요. >");
        num2 = scanner.nextInt();
        System.out.print("3. 연산자를 입력해주세요.(+,-,*,/)>");
        op = scanner.next().charAt(0);

        //처리
        //출력
        if(num1 != (int)num1 || num2 != (int)num2){
        }
        else{
            result = " " + num1 + op + num2 + "=";
            if(op == '+') {result += num1 + num2;}
            else if(op == '-') {result += num1 - num2;}
            else if(op == '*') {result += num1 * num2;}
            else if(op == '/') {result += String.format("%2.f", (float)num1/num2);}
        }
        System.out.println(result);
    }
}
