import java.util.Scanner;

class Array_Study_07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num[] = new int[7];
		for(int i = 0; i<num.length; i++){
			System.out.print((i+1)+"번째 수 > ");
			num[i] = sc.nextInt();
		}

		int max = num[0], min = num[0];

		for(int i = 1; i<num.length; i++){
			if(max < num[i]) max = num[i];
			else if (min > num[i]) min = num[i];
		}

		System.out.println("원본 데이터");
		for(int i = 0; i<num.length; i++){
			System.out.println((i+1)+"번째 수 "+num[i]);
		}
		System.out.println("최대값 : "+ max + "\n최소값 : " + min);
	}
}
