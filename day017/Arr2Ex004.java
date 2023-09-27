package com.company.day017;

public class Arr2Ex004 {
	public static void main(String[] args) {
		int[][] datas = { { 10, 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30, 30, 30 } };
		int[][] result = new int[datas.length + 1][datas[0].length + 1];

		// 아래와 같이 출력 되도록 datas 배열의 데이터를 result에 대입하고 코드를 작성하시오.
		// int [][] datas = {{10,10,10,10},{20,20,20,20},{30,30,30,30}};
		// int [][] result = new int[datas.length+1][datas[0].length+1];

		/*
		 * 10 10 10 10 40 20 20 20 20 80 30 30 30 30 120 60 60 60 60 240
		 */

		// hint
		// 10101040 => 00 01 02 03
		// 20202080 => 10 11 12 13
		// 303030120 => 20 21 22 23
		// 606060240 => 30 31 32 33

		// 1. result 에 datas 데이터 복사

//			result[0][0] = datas[0][0];
//			result[0][1] = datas[0][1];
//			result[0][2] = datas[0][2];
//			result[1][0] = datas[1][0];
//			result[1][1] = datas[1][1];
//			result[1][2] = datas[1][2];

//			for (int kan = 0; kan < datas[0].length; kan++) {
//				result[0][kan] = datas[0][kan];
//			}
//			for (int kan = 0; kan < datas[1].length; kan++) {
//				result[1][kan] = datas[1][kan];
//			}

		// 2. 가로방향의 데이터누적 [40 80 120 240] 만들기.

//			result[0][4] += result[0][0];
//			result[0][4] += result[0][1];
//			result[0][4] += result[0][2];
//			result[0][4] += result[0][3];

//			for (int kan = 0; kan < datas[ch].length; kan++) {
//				result[0][3] = datas[0][kan];
//			}
//			for (int kan = 0; kan < datas[ch].length; kan++) {
//				result[1][3] = datas[1][kan];
//			}
//
//			for (int ch1 = 0; ch1 < datas.length; ch1++) {
//				for (int kan = 0; kan < datas[ch1].length; kan++) {
//
//				}
//			}
//		for (int ch = 0; ch < 4; ch++) {
//		result[3][0] = datas[ch][0];
//	}
//	for (int ch = 0; ch < 4; ch++) {
//		result[3][1] = datas[ch][1];
//	}
//
//		for (int kan = 0; kan < result.length; kan++) { // result[0].length-1
//			result[0][4] += result[0][kan];
//		}
//		for (int kan = 0; kan < result.length; kan++) { // result[0].length-1
//			result[1][4] += result[1][kan];
//		}
//		for (int kan = 0; kan < result.length; kan++) { // result[0].length-1
//			result[2][4] += result[2][kan];
//		}
//
//		for (int ch = 0; ch < 3; ch++) { // result.length-1 // datas.lenght
//			for (int kan = 0; kan < 4; kan++) { // result[0].length-1 // datas[0].lenght
//				result[ch][4] = result[ch][kan];
//			}
//		}
//
//		// 3. 세로방향의 데이터누적
//
//		// ver1
//		result[3][0] += result[0][0];
//		result[3][0] += result[1][0];
//		result[3][0] += result[2][0];
//		result[3][0] += result[3][0];
//
//		// ver2
//
//		for (int ch = 0; ch < 4; ch++) {
//			result[3][0] = result[ch][0];
//		}
//
//		for (int ch = 0; ch < 4; ch++) {
//			result[3][0] = result[ch][1];
//		}
//
//		for (int ch = 0; ch < 4; ch++) {
//			result[3][0] = result[ch][2];
//		}
//
//		for (int ch = 0; ch < 4; ch++) {
//			result[3][0] = result[ch][3];
//		}
//
//		// (2)
//
//		for (int ch = 0; ch < 3; ch++) {
//			for (int kan = 0; kan < 4; kan++) {
//				result[ch][4] = result[ch][kan];
//			}
//		}


		//3층 4칸
//
		for (int ch = 0; ch < datas.length; ch++) {
			for (int kan = 0; kan < datas[ch].length; kan++) {
				result[ch][kan] = datas[ch][kan];
				result[ch][datas[ch].length] += datas[ch][kan];
				result[datas.length][kan]  += datas[ch][kan];
				result[datas.length] [datas[ch].length] += result[ch][kan];
			}
		}

		// 4. 전체 데이터 누적
		for (int ch = 0; ch < result.length; ch++, System.out.println()) {
			for (int kan = 0; kan < result[ch].length; kan++) {
				System.out.print(result[ch][kan] + "\t");
			}
		}


//		for(int ch=0; ch<datas.length; ch++) {  //3 result.length-1도 가능
//	         for(int kan=0; kan<datas[ch].length; kan++) {  //4 result[0].length-1
//	            //datas 자리 입력
//	            result[ch][kan] = datas[ch][kan];
//	            //가로 합
//	            result[ch][datas[ch].length] += datas[ch][kan];
//	            //세로 합
//	            result[datas.length][kan] += datas[ch][kan];
//	            //3, 4 부분
//	            result[datas.length][datas[ch].length] += result[ch][kan];
//	         }
//	      }
//
//
//	      for(int ch=0; ch<result.length; ch++, System.out.println()) {
//	         for(int kan=0; kan<result[ch].length; kan++) {
//	            System.out.print(result[ch][kan] + "\t");
//	         }
//	      }

	}

}
