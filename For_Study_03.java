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

//		Scanner sc = new Scanner(System.in);
//		String num = sc.next();
//		int sum_1 = 0;
//		int sum_2 = 0;
//		int num_int = Integer.parseInt(num);
//		
//		for(int i = 0; i<num.length(); i++){
//			sum_1 += num_int%10;
//			num_int/=10;
//		}
//
//		for(int i = 0; i<num.length(); i++){
//			sum_2 += num.charAt(i)-'0';
//		}
//		System.out.println("Integer.parseInt 사용 값 : "+sum_1+"\ncharAt() 사용 값 : "+sum_2);



		
		// 문제 3.  정수를 입력받아 각 자리의 합을 구하시오.

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		int num_1 = num;
//		int num_2 = num;
//		int sum_1 = 0;
//		int sum_2 = 0;
//
//		while(true){
//			sum_1 += num_1%10;
//			num_1/=10;
//			if(num_1== 0) break;
// 		}
//
//		while(num_2 != 0){ // true, num>0도 가능
//			sum_2 += num_2%10;
//			num_2/=10;
//		}
//		System.out.println();
//		System.out.println("조건문 자리에 (num != 0) : "+sum_1+"\n조건문 자리에 (num >  0) : "+sum_2);



		
		// 문제 4.  n번째 피보나치 수열 구하기
	
//		//내 방법
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		int ar[] = new int[num];
//		ar[0] = 1;
//		ar[1] = 1;
//
//		for(int i = 2; i<ar.length; i++){
//			ar[i] = ar[i-2]+ar[i-1];
//		}
//
//		for(int i = 0; i<ar.length; i++){
//			System.out.print((i+1)+"번째 수열 : "+ar[i]+"\n");
//		}
//		

//		// 규정쌤 방법
//
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1 + " " + num2);
//
//		for(int i = 0; i<num-2; i++){
//			num3 = num1 + num2;
//			num1 = num2;
//			num2 = num3;
//			System.out.print(" "+num3);
//		}




		// ** 향상된 for문 **

		// 일반적인 for문
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
//		for(int i = 0; i<arr.length; i++){
//			sum += arr[i];
//		}
//		System.out.println(sum);

		// 향상된 for문 - Collection(배열) 클래스와 함께 사용 for(배열의 데이터 타입 : 배열 이름)
		for( int a : arr ){
			sum += a;
		}
		System.out.println(sum);
		
	}
}
