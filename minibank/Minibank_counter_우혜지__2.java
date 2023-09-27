package com.company.minibank;

import java.util.Scanner;

public class Minibank_counter_우혜지__2 { // ##1. 클래스는 대문자
	public static void main(String[] args) {
		int plus = 0;
		char userid = ' '; // 사용자의 정보를 userid[]
		char userpw = ' '; // 사용자의 정보를 userpw[]
		int age = 0;
		int remain = 0;
		int money = 0;
		char del = ' ';
		boolean se = true;

		Scanner scanner = new Scanner(System.in);

		while (se) {
			System.out.println("Welcom! (주)CodeJohns Bank\n====BANK====");
			System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n");
			System.out.println("입력>>>");
			plus = scanner.nextInt();

			switch (plus) {
			case 1:
				System.out.println("아이디  입력:");
				userid = scanner.next().charAt(0); // 사용자의 정보를 userid[a]
				System.out.println("비밀번호 입력:");
				userpw = scanner.next().charAt(0); // 사용자의 정보를 userpw[]
				System.out.println("나이 입력:");
				age = scanner.nextInt();
				System.out.println("잔액 입력:");
				money = scanner.nextInt();
				break;
			case 2:
				System.out.println("id :");
				char t_userid = scanner.next().charAt(0);
				System.out.println("pass :");
				char t_userpw = scanner.next().charAt(0);
				// if ( !(userid == t_userid && userpw == t_userpw)) { // warning
				if (userid != t_userid || userpw != t_userpw) {
					System.out.println("다시 확인해주세요.");
					System.out.println("계좌가 없습니다."); // 해당 문구 출력 안됨
				} else if (userid == t_userid && userpw == t_userpw) { // warning
					System.out.println("==계좌조회"); // 해당 문구 정상 출력
					System.out.println("ID : " + userid);
					System.out.println("PASS : " + userpw);
					System.out.println("나이 : " + age);
					System.out.println("잔액 : " + money);
				}
				break;
			case 3:
				System.out.println("id :");
				char t_userid1 = scanner.next().charAt(0);
				System.out.println("pass :");
				char t_userpw1 = scanner.next().charAt(0);

				/// 유저가 맞다면 입금
				if (userid == t_userid1 && userpw == t_userpw1) {
					System.out.println("입금 :");
					money += scanner.nextInt();
					System.out.println("===입금완료");
					System.out.println("잔액 :" + money);
				} else if (userid != t_userid1 || userpw != t_userpw1) {
					System.out.println("사용자가 없습니다.");
				}
				break;
			case 4:
				System.out.println("id :");
				char t_userid2 = scanner.next().charAt(0);
				System.out.println("pass :");
				char t_userpw2 = scanner.next().charAt(0);

				/// 유저가 맞다면 출금
				if (userid == t_userid2 && userpw == t_userpw2) {
					System.out.println("출금 :");
					remain = scanner.nextInt();
					if (remain > money) {
						System.out.println("잔액이 부족해요.");
					}else if (remain < money) {
						System.out.println("===출금완료");
						System.out.println("잔액 :" + (money - remain));
						money = money - remain;
					}
				} else if (userid != t_userid2 || userpw != t_userpw2) {
					System.out.println("사용자가 없습니다.");
				}
				break;
			case 5:
				System.out.println("id :");
				char t_userid3 = scanner.next().charAt(0);
				System.out.println("pass :");
				char t_userpw3 = scanner.next().charAt(0);	

				if (userid == t_userid3 && userpw == t_userpw3) {
					System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
					del = scanner.next().charAt(0);
					if (del == 'Y' || del == 'y') {
						plus = 0;
						userid = ' '; 
						userpw = ' '; 
						age = 0;
						remain = 0;
						money = 0;
						System.out.println("삭제완료.잘 가세요...");
					} else if (del == 'N' || del == 'n') {
						System.out.println("삭제취소.어서 오세요...");
					}
				} else if(userid != t_userid3 || userpw != t_userpw3) {
					System.out.println("사용자가 없습니다.");
				}
				break;
			case 9:
				System.out.println("종료기능 입니다. BYE~ ");
			}
			
		}

		scanner.close();
	}
}
