package java_project;

public class While_Study_02 {

	public static void main(String[] args) {
		// QUIZ - while문을 이용해 1부터 누적합계가 100이 넘는 수와 합을 출력하시오.
		int i = 1,  sum = 0;
		while(true) {
			sum += i;
			if(sum>=100) break;
			i++;
		}
		System.out.println("누적 합계가 100이 넘는 수 : "+i+"\n총합 : "+sum);

	}

}
