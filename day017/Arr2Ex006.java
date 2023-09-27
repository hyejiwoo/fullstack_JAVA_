package com.company.day017;

import java.util.Arrays;

public class Arr2Ex006 {
	public static void main(String[] args) {
		// 성적처리

		// 1. users 2차원 배열에
		// name, kor, eng, mat 1차원 배열을 for+lenght 를 이용하여 데이터를 입력한다.

		String[][] users = new String[5][9];

		String name[] = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		int[] kor = { 100, 20, 90, 70, 35 };
		int[] eng = { 100, 50, 95, 80, 100 };
		int[] mat = { 100, 30, 90, 60, 100 };
		int[] avg = new int[5];
		int[] sun = { 1, 1, 1, 1, 1 };
		String[] pass = new String[5];
		String[] jang = new String[5];
		String[] rank = new String[5];
		int cnt = 0;
		// 0칸 1칸 2칸 3칸 4칸 5칸 6칸 7칸 8칸
		// 이름 국어 영어 수학 평균 등수 합격여부 장학생 랭킹
		// users[0]의 데이터 순서대로 > 아이언맨 100 100 100 100 1 합격 장학생 **********
		// users[1]의 데이터 순서대로 > 헐크 20 50 30 33 5 불합격 ***
		// users[2]의 데이터 순서대로 > 캡틴 90 95 90 91 2 합격 *********
		// users[3]의 데이터 순서대로 > 토르 70 80 60 70 4 합격 *******
		// users[4]의 데이터 순서대로 > 호크아이 35 100 100 78 3 재시험 *******
		// 입력 : 이름, 국어, 영어, 수학
		// 칸 고정
		// 칸5 1로 초기화, 칸8 null 싫어서 ""로 초기화
		for (int ch = 0; ch < 5; ch++) {
			users[ch][0] = name[ch];
			users[ch][1] = String.valueOf(kor[ch]);
			users[ch][2] = String.valueOf(eng[ch]);
			users[ch][3] = String.valueOf(mat[ch]);
			users[ch][5] = String.valueOf(1);
			users[ch][8] = "";
		}

		// 2. 각 층의 4칸에는 평균을 구하시오
		// 평균
		for (int ch = 0; ch < 5; ch++) {
			users[ch][4] = String.valueOf(
					(Integer.parseInt(users[ch][1]) + Integer.parseInt(users[ch][2]) + Integer.parseInt(users[ch][3]))
							/ 3);
		}

		// 3. 각 층의 5칸에는 등수를 구하시오
		// 등수
		for (int ch = 0; ch < 5; ch++) {
			// 칸5 랭킹 계산
			for (int kan = 0; kan < 5; kan++) {
				if (Integer.parseInt(users[ch][4]) < Integer.parseInt(users[kan][4])) {
					users[ch][5] = String.valueOf(Integer.parseInt(users[ch][5]) + 1);
				}
			}

			// 4. 각 층의 6칸에는 합격/불합격을 구하시오
			// 합격 불합격
			// 칸6 합격 여부
			users[ch][6] = (Integer.parseInt(users[ch][4]) < 60) ? "불합격"
					: (Integer.parseInt(users[ch][1]) < 40 || Integer.parseInt(users[ch][2]) < 40
							|| Integer.parseInt(users[ch][3]) < 40) ? "재시험" : "합격";

			// 60점 이상 합격, 아니라면 불합격 - 합격중에서도 각과목이 40점 미만이면 재시험

			// 5. 각 층의 7칸에는 장학생을 구하시오. 95점 이상이면 장학생
				//	장학생
			users[ch][7] = (Integer.parseInt(users[ch][4]) >= 95) ? "장학생" : "";

			// 6. 각 층의 8칸에는 별을 구하시오
				//	별
			for (int star = 0; star < Integer.parseInt(users[ch][4]) / 10; star++) {
				if (star == 0) {
					users[ch][8] += "";
				}
				users[ch][8] += "*";
			}

		}
			//	출력
		System.out.println("이름\t\t\t국어\t\t영어\t\t수학\t\t평균\t\t등수\t\t합격여부\t\t장학생\t\t랭킹");
		for (int ch = 0; ch < users.length; ch++) {
			for (int kan = 0; kan < users[ch].length; kan++) {
				System.out.print(users[ch][kan] + "\t");
			}
			System.out.println();
		}

	}
}
