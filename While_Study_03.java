package java_project;

import java.nio.file.spi.FileSystemProvider;

public class While_Study_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// QUIZ - while문을 이용할 것, 출력값이 -1, 3, -5, 7, -9, 11 해서 쭉 99까지 숫자 및 합계를 출력하시요.
		
		
//		int i = 1, count = 0, sum = 0;
//		while(i<=99) {
//			count++;
//			if(count%2==1) {
//				System.out.print(-i + "\t");
//				sum += -i;
//			} // if
//			else {
//				System.out.print(i + "\t");
//				sum += i;
//			} // else
//			i+=2;
//		} //while
//		System.out.println();
//		System.out.println("합계  :  "+sum);
		
		
		int i = 1;
		while(i<=99) {
			if(i>0) i -= 4;
			else i+=4;
			System.out.println(i + "    ");
		} //while
	}

}
