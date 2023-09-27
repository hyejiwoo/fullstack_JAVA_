package com.company.day010_FOR;

public class For002 {
    public static void main(String[] args) {
        /* Q1 for 문을 이용해서 다음과 같이 출력하시오 : 1 2 3 4 5 */
        for(int i=1; i<=5; i++)
        {System.out.println(i);}
        /* Q2 for 문을 이용해서 다음과 같이 출력하시오 : 5 4 3 2 1*/
        for(int i=5; 1<=i; i=i-1)
        {System.out.println(i);}
        /* Q3 for 문을 이용해서 다음과 같이 출력하시오 : JAVA1 JAVA2 JAVA3 */
        for(int i=1; i<=3; i++)
        {System.out.println("JAVA" + i);}
        /* Q4 for 문을 이용해서 다음과 같이 출력하시오 : HAPPY3 HAPPY2 HAPPY1*/
        for(int i=3; 1<=i; i=i-1)
        {System.out.println("HAPPY" + i);}
        /* Q5
            다음의 결과가 나오게 안의 코드를 추가하시오.
            for( ## 코드추가 ) {
                System.out.print(i + " ");
            }  // 0, 1 , 2
        */
            for(int i=0; i<=2; i++){
                System.out.println(i + "\t");
            }

            /*Q6 다음의 결과가 나오게 안의 코드를 추가하시오.
             *   for(## 코드추가) {
             *      System.out.println(i + "");
             * }    // 0~99
            */
                for(int i=0; i<=99; i++){
                    System.out.println(i + "\t");
                }


            /*Q7  다음의 결과가 나오게 안의 코드를 추가하시오.
             *   for(## 코드추가) {
             *      System.out.println(i ++ "");
             * }    // 10,9 ... ,1
            */
                for(int i=10; 1<=i; i=i-1){
                    System.out.println(i + "\t");
                }

            /*Q8 다음의 결과가 나오게 안의 코드를 추가하시오.
             *     for(## 코드추가) {
             *      System.out.println(i ++ "");
             *     }  // 0,2,4,6,8
             */
                for(int i=0; i<=8; i=i+2){
                    System.out.println(i + "\t");
                }

            /*Q9    다음의 결과가 나오게 안의 코드를 추가하시오.
             * for(## 코드추가) {
             *      System.out.println(i ++ "");
             *     }  // 0,2,4,6,8 ... ,18
            */
                for(int i=0; i<=18; i=i+2){
                    System.out.println(i + "\t");
                }

                for(int i = 0,  j=0;  i<10; i++ , j++ ) {
                    //i=0, j=0
                    // i=1, j=1
                    // i=2, j=2
                    // i=, j=3

                System.out.println(i + j + "\t");   //0 2 4 6
          }
                System.out.println();
      }

    }

