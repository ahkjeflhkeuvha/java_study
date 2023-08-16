package java_project;

import java.util.Scanner;

public class java_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, sumOdd = 0, sumEven = 0;
		System.out.print("숫자를 입력하세요 : ");
		for(i=1; i<=5; i++) {
			int num = sc.nextInt();
			if(num%2 ==0) sumEven += num;
			else sumOdd += num;
		}
		System.out.println("짝수의 합 : "+sumEven+"\n홀수의 합 : "+sumOdd);
		
//		int num = sc.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		for(int i = 1; i<=100; i++) {
//			if(i%num == 0) System.out.println(i);
//		}
		
//		int num = sc.nextInt();
//		for(int i = 1; i<=num; i++) {
//			System.out.println("Daniel");
//		}
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			for(int i = b; i<=a; i++) {
//				System.out.print(i+"\t");
//			}
//		}
//		else {
//			for(int i = a; i<=b; i++) {
//				System.out.print(i + "\t");
//			}
//		}
		
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i<=num; i++) {
//			if(i%5 == 0) sum += i;
//		}
//		System.out.println("1부터 "+num+"까지의 5의 배수 합은  : "+sum);
		
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i<=num; i++) {
//			int a = sc.nextInt();
//			sum += a;
//		}
//		System.out.println("평균 : "+(float)sum/num);
		
		
//		int oddCount = 0, evenCount = 0;
//		for(int i = 1; i<=10; i++) {
//			int num = sc.nextInt();
//			if(num%2 == 0) oddCount++;
//			else evenCount++;
//		}
//		System.out.println("홀수의 개수 : "+evenCount+"\n짝수의 개수 : "+oddCount);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int sum = 0, count = 0;
//		
//		if(a>b) {
//			for(int i = b; i<=a; i++) {
//				if(i%3 == 0 || i%5 == 0) {
//					sum += i;
//					count++;
//				} // if
//			} // for
//		} // if
//		else {
//			for(int i = a; i<=b; i++) {
//				if(i%3 == 0 || i%5 == 0) {
//					sum += i;
//					count++;
//				} // if
//			} // for
//		} // else
//		
//		System.out.println("합 : "+sum+"\n 평균 : "+(float)sum/count);
		
//		int num = sc.nextInt();
//		for(int i = num; i<=num*10; i+=num) {
//			System.out.println(i);
//		}
		
		
		
		
		
		
	}

}
