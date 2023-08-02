class For_Study_02 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis(); // 현제 시간을 넣어줌
		for(long i = 0; i<2000000000; i++){
			
		}
		long endTime = System.currentTimeMillis();

		System.out.println("시작 시간 : " + startTime);
		System.out.println("종료 시간 : " + endTime);
		System.out.println("소요 시간 : " + (endTime-startTime));
	}
}
