package com.company.day007_operator;

public class Q014 {
    public static void main(String[] args) {
        int num = -10;

        // 삼항 연산자를 사용하여 양수, 음수, 0을 체크
        String message = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
        System.out.println("num은 " + message + "입니다.");
    }
}