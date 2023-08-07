import java.util.Scanner;

class For_Study_03 
{
	public static void main(String[] args) 
	{
		// 문제 1.  두 개의 주사위를 던졌을 때 합이 6이 되는 모든 경우의 수를 출력하시오.
		// 단, for문을 이용할 것
//
//		int i, j, count = 0;
//
//		for(i= 1; i<=6; i++){
//			for(j = 1; j<=6; j++){
//				if(i+j == 6) {
//					System.out.println("("+i+","+j+")");
//					count++;
//				} // if
//			} // for j	
//		} // for i
//
//		System.out.println();
//		System.out.println("경우의 수 : "+count);
		

		// 문제 2.  문자형 숫자를 입력받아 각 자리의 합을 구하시오. 

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int sum = 0;
		int num_int = Integer.parseInt(num);
		
		for(int i = 0; i<num.length(); i++){
			sum += num_int%10;
			num_int/=10;
		}
		System.out.println(sum);
	}
}
