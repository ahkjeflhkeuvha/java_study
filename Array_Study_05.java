import java.util.Scanner;

class Array_Study_05
{
	public static void main(String[] args) 
	{
//		int scores[] = new int[5];
//		int sum = 0; // 총점, 초기화를 하지 않으면 Error!!!
////		int average = 0; // 평균
//		float average = 0.0f;
//
//		Scanner sc = new Scanner(System.in);
//
//		for(int i = 0; i<scores.length; i++){
//			System.out.print((i+1)+"번째 학생의 점수를 입력해주세요  ");
//			scores[i] = sc.nextInt();
//			sum += scores[i];
//		}
//		for(int i = 0; i<scores.length; i++){
//			System.out.print(scores[i]+"  ");                        
//		}
//		average = (float)sum/scores.length;
//		System.out.println();
//		System.out.println("> 총점 : "+sum+"\n> 평균 : "+average);

//		int scores[][];

		int totalSUM = 0, totalAVG = 0;
		Scanner sc = new Scanner(System.in, "EUCKR");	
		
		System.out.print("> 학생 수를 입력하세요  ");
		int su = sc.nextInt();
		String students[] = new String[su];
		int scores[][] = new int[su][5];

		for(int i = 0; i<students.length; i++){ // scores.length, su 가능 -> 가변형 배열
			System.out.print((i+1)+"번째 학생의 이름 입력 > ");
			students[i] = sc.next();
			
			System.out.print("국어 입력 > ");
			scores[i][0] = sc.nextInt(); // 국어 점수
			System.out.print("영어 입력 > ");
			scores[i][1] = sc.nextInt(); // 영어 점수
			System.out.print("수학 입력 > ");
			scores[i][2] = sc.nextInt(); // 수학 점수
		
			scores[i][3] = scores[i][0] + scores[i][1] + scores[i][2];
			scores[i][4] = (int)(scores[i][3]/3);

			System.out.println();
		}

		System.out.println("----------------------------------------------------");
		System.out.println("       국어    영어    수학    총점    평균");
		System.out.println("----------------------------------------------------");

		// su는 학생 수, students는 학생 이름이 들어있는 스트링 배열, scores는 학생 수에 맞게 점수가 들어있는 배열
		// su = students.length = scores

		for(int i = 0; i<scores.length; i++){
			System.out.print(students[i]+"\t");
			for(int j = 0; j<scores[i].length; j++){
				System.out.print(scores[i][j]+"\t");
			}
			totalSUM += scores[i][3];
			totalAVG += scores[i][4];
			System.out.println();
		}
		System.out.print("전체 총점 : "+totalSUM+"\n전체 평균 : "+totalAVG/students.length+"\n");
		
	}
}
