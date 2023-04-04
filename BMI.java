import java.util.Scanner; //int나 println은 기본적으로 주는 변수, scanner는 추가해야하는 변수

public class BMI {
	public static void main(String args[]){
	
	//String name = "소방차";
	//System.out.println("내가 좋아하는 연예인은 "+name+"입니다.");
	
	/*String name;
	Scanner sc = new Scanner(System.in);
	System.out.print("당신이 좋아하는 연예인은 누구입니까? ");
	name = sc.next();

	System.out.println("당신이 좋아하는 연예인은 "+name+"입니다.");

	
	
	float height= 1.63f;
	float weight= 54.8f;

	float result;

	result = weight/(height*height);
	System.out.println("당신의 체질량 지수는 "+ result+ "입니다.");*/
	
	/* String name, BMI;
	Scanner sc = new Scanner(System.in);
	System.out.println("***** 지금부터 당신의 체질량 지수를 측정하겠습니다.*****");
	System.out.println();

	float height, weight;

	System.out.print("이름 입력 : ");
	name = sc.next();

	System.out.print("키 입력 : ");
	height = sc.nextFloat();
	System.out.print("몸무게 입력 : ");
	weight = sc.nextFloat();
	
	float result = weight/(height*height);*/

	/*if(result > 30.0){
		BMI = "비만";
	}
	else if(result > 25.0){
		BMI = "과체중";
	}
	else if(result > 18.5){
		BMI = "정상";
	}
	else{
		BMI = "저체중";
	}

	//switch ~ case문 : 정수, break, default가 필요
	int su = (int)result; // 실수인 result를 실수로 변환 강제형 변환, break가 없으면 case는 전부 출력 긍께 break 적으스즈메, default는 else와 마찬가지로 아무것도 아니면 default로 한번에 묶어서 처리할 수 있음

	switch(su){
			case 15: case 16: case 17:
					BMI = "저체중";
					break;
			case 18: case 19: case 20: case 21:
			case 22: case 23: case 24: case 25:
					BMI = "정상";
					break;
			case 26: case 27: case 28: case 29: case 30:
					BMI = "과체중";
					break;
			default:
					BMI = "비만";
					break;
	
	}*/

	// System.out.print(name+"님의 체질량 지수는 "+(int)result+"이고, 결과는 "+BMI+"입니다.");	//if와 switch는 제어문, 조건문, (int)result하면 실수가 강제로 정수로 변환됨 ㅋㅋ

//반복문에는 for과 while과 do~while이 있음 반복하라는거임, 모든 언어에 잇음 제어문이랑 똑같이 다 똑같이 있음 몇번 반복되는지 횟수가 고정되어있으면 for를 횟수 고정이 안 되ㅓㅇ 있으면 while과 do~while. while은 0또는 무한, do~while은 1 또는 무한임ㅋㅋ 잘 알아두셈 반복문끼리 변환도 가능ㅎ마 for랑 while이랑 어려우니까 계쏙하셈


		/*for(int i = 1; i<=5; i++) {   for(초기식;비교식;증감식)
		   System.out.println(i + "번째 반복중");
		   }

		int i = 1;                                     
		while(i<=5) {                                      
			System.out.println(i);              
			if(i ==5) break;   
			i++;
		} */

		
		Scanner sc = new Scanner(System.in);

		while(true){
				System.out.print("계속하시겠습니다? (y or n)");
				String choice = sc.next();

				if(choice.equals("n")) break; //문자는 ==가 아닌 equals("~") 꼴로 작성 ==는 숫자를 비교할 때 사용
				
		}

		 





	}
}
