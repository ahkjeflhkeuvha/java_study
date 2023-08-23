import java.util.Scanner;

public class RSPGame {

	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
	public static void main(String[] args) {
		// 가위 - 1 | 바위 - 2 | 보 - 3
		Scanner sc = new Scanner(System.in);
		String ans;
		
		while(true) {
			int com = (int)(Math.random()* 3) + 1;
			System.out.print("1: 가위 , 2 : 바위, 3 : 보   >   ");
			int my = sc.nextInt();
				
			// 초보 개발자
//			
//			if(com == 1) {
//				switch(my) {
//					case 1: System.out.println("컴 - 가위 | 나 - 가위   :   비겼땅"); break;
//					case 2: System.out.println("컴 - 가위 | 나 - 바위   :   이겼당"); break;
//					case 3: System.out.println("컴 - 가위 } 나 - 보      :   졌땅"); break;
//					default: System.out.println("1~3 사이의 숫자를 입력해주세요"); break;
//				}
//			}
//			if(com == 2) {
//				switch(my) {
//				case 1: System.out.println("컴 - 바위 | 나 - 가위   :   졌땅"); break;
//				case 2: System.out.println("컴 - 바위 | 나 - 바위   :   비겼땅"); break;
//				case 3: System.out.println("컴 - 바위 | 나 - 보      :   이겼땅"); break;
//				default: System.out.println("1~3 사이의 숫자를 입력해주세요"); break;
//				}
//			}
//			if(com == 3) {
//				switch(my) {
//				case 1: System.out.println("컴 - 보 | 나 - 가위   :   이겼땅"); break;
//				case 2: System.out.println("컴 - 보 | 나 - 바위   :   졌당"); break;
//				case 3: System.out.println("컴 - 보 | 나 - 보      :   비겼당"); break;
//				default: System.out.println("1~3 사이의 숫자를 입력해주세요"); break;
//				}
			
			
				
			// 중급 개발자 - 메소드 이용
//			switch(com) {
//			case 1 : System.out.print("com : 가위\t"); break;
//			case 2: System.out.print("com : 바위\t"); break;
//			case 3: System.out.print("com : 보\t"); break;
//			}
//			
//			switch(my) {
//			case 1 : System.out.print("my : 가위\t"); break;
//			case 2: System.out.print("my : 바위\t"); break;
//			case 3: System.out.print("my : 보\t"); break;
//			default: System.out.println("1~3 사이의 숫자만 입력해주세요\n"); break;
//			}
			
			
			// 중급 개발자 2 - static 메소드 사용
//			System.out.print("com : " + print(com) + "my : "+ print(my));
			
			// 중급 개발자 3 - static 사용
//			if((my == 가위 && com == 보) || (my == 바위 && com == 가위) || (my == 보 && com == 바위)) System.out.println("이겼땅~!");
//			else if((my == com) || (my ==  com) || (my == com) ) System.out.println("비겼당");
//			else System.out.println("졌당");
			
			
			
			// 상급 개발자
			
			System.out.print("com : " + print(com) + "my : "+ print(my));
			
//			switch(my - com) {
//			case -2: case 1: System.out.println("이겼당"); break;
//			case -1: case 2: System.out.println("졌땅"); break;
//			case 0: System.out.println("비겼당"); break;
//			}
			
			// 최상급 개발자 - 서큘러 알고리즘
			switch((my-com + 3)%3) {
			case 1:  System.out.println("이겼당"); break;
			case 2:  System.out.println("졌땅"); break;
			case 0: System.out.println("비겼당"); break;
			}
			
			
			System.out.print("계속하시겠습니까?   :     ");
			ans = sc.next();
			if(ans.equals("N")||ans.equals("n")) {
				System.out.println();
				System.out.println("- 게임을 종료합니다 - ");
				break;
			}

		}


	} // main
	
	static public String print(int su) {
		String choice = "";
		if(su == 1) choice = "가위\t";
		else if(su == 2) choice = "바위\t";
		else if(su == 3) choice = "보\t";
		else choice = "다시 입력해주세요\n";
		
		return choice;
	}

}
