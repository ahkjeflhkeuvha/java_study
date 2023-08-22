package java_project;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위 - 1 | 바위 - 2 | 보 - 3
		Scanner sc = new Scanner(System.in);
		String ans;
		
		while(true) {
			int com = (int)(Math.random()* 3) + 1;
			int my = sc.nextInt();
				
			if(com == 1) {
				if(my == 1) System.out.println("비겼당");
				else if(my == 2) System.out.println("이겼당");
				else System.out.println("졌당");
			}
			if(com == 2) {
				if(my == 1) System.out.println("졌당");
				else if(my == 2) System.out.println("비겼당");
				else System.out.println("이겼당");
			}
			if(com == 3) {
				if(my == 1) System.out.println("졌당");
				else if(my == 2) System.out.println("이겼당");
				else System.out.println("비겼당");
			}
			
			System.out.print("계속하시겠습니까?   :     ");
			ans = sc.next();
			if(ans.equals("N")||ans.equals("n")) break;

		}


	}

}
