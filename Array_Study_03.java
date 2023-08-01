import java.util.Random;
class Array_Exam_03 
{
	public static void main(String[] args) 
	{
		// 배열을 이용해서 랜덤 숫자 생성 
		// Random r = new Random();
		// int random = r.nextInt(10);

		int ballArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int ball3[] = new int[3];
		int temp = 0;
		
		for(int x=1; x<=10; x++){
			int i = (int)(Math.random() * ballArr.length);
			int j = (int)(Math.random() * ballArr.length);
//			System.out.println("["+i+","+j+"]");
			
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;
		}
		
//		for(int i = 0; i<ballArr.length; i++){
//			System.out.print(ballArr[i]+" ");
//		}

		// 방법 1
//		ball3[0] = ballArr[0];
//		ball3[1] = ballArr[1];
//		ball3[2] = ballArr[2];

		// 방법 2
//		for(int i = 0; i<ball3.length; i++){
//			ball3[i] = ballArr[i];
//		}

		// 방법 3 -> arraycopy 메소드 사용
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		// ballArr의 0번째부터 ball3의 0번째부터 3개씩 arraycopy

		for(int i =0; i<ball3.length; i++){
			System.out.println(ball3[i]);
		}

	}
}
