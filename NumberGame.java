package java_project;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Random r = new Random();
		
		int c_num = (int)(Math.random()*100)+1;
		
		int num, count = 0;
		while(true) {
			count++;
			
			System.out.print("숫자를 입력하세요  :   ");
			num = sc.nextInt();
			if(num>c_num) System.out.println("DOWN!\n");
			else if(num<c_num) System.out.println("UP!\n");
			else {
				System.out.println("(★‿★)");
				break;
			}
 		} // while
		
		System.out.println(count);
		if(count>=1 && count<=4) System.out.println("Great!");
		else if(count>=5 && count<=8) System.out.println("Good!");
		else System.out.println("노력하세요");
		

	}

}
