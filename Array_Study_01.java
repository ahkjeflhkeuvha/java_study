class Array_Study_01 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		float average = 0.0f;
		int score[] = {100, 88, 100, 100, 90};

		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		average = (float)sum / score.length;
		System.out.println("점수의 총합은 : "+sum+"\n점수의 평균은 : "+(double)sum/score.length);
		System.out.println("점수의 총합은 : "+sum+"\n점수의 평균은 : "+average);
	}
}