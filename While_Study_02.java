package java_project;
import java.util.Scanner;

public class While_Study_02 {
	public static void main(String[] args) {
		// QUIZ - while문을 이용해 1부터 누적합계가 100이 넘는 수와 합을 출력하시오.
//		int i = 0,  sum = 0;
//		while(sum < 100) { // while문은 조건식이 참일 때 실행, 거짓이면 탈출~
//				sum += ++i;
//		}
//		System.out.println("누적 합계가 100이 넘는 수 : "+i+"\n총합 : "+sum);
		
		// QUIZ - while문을 이용해 약수를 구하시오. 단 사용자로부터 정수를 입력 ㅂ다아서, 약수를 구할 것 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("약수가 궁금한 숫자를 입력해주세요 :  ");
//		int num = sc.nextInt();
//		
//		System.out.print(num+"의 약수 :  ");
//		for(int i = 1; i<=num; i++) {
//			for(int j = 1; j<=num; j++) {
//				if(i*j == num) System.out.print(i+"\t");
//			}
//		}
//		int i = 1;
//		while(i<=num) {
//			if(num%i==0) System.out.print(i+"\t");
//			i++;
//		}
		
		// QUIZ - 0에서 100 사이의 정수를 여러개 입력받아서, 합, 평균, 입력 갯수를 출력하는 프로그램을 작성하시오.
		// 단 0보다 작은 값이 입력되면 프로그램 종료, 100보다 큰 수는 갯수, 합, 평균에서 제외하고 다음 값 입력
		Scanner sc = new Scanner(System.in);
		int count = 0, sum = 0;

		while(true){
			System.out.print("정수를 입력해주세요 : ");
			int num = sc.nextInt();
			if(num>100) continue;
			if(num<0) break;
			count++;
			sum += num;
		}
		System.out.println("입력한 횟수 : "+count+"\t합계 : "+sum+"\t평균 : "+(float)sum/count);
		
	}

}
