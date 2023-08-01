import java.util.Scanner;

class Array_Study_06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in, "EUCKR");
		String name[] = new String[5];
		
		System.out.println("연예인 이름을 입력해주세요 > ");
		for(int i = 0; i<name.length; i++){
			name[i] = sc.next();
		}

//		for(int j = 1; j<name.length; j+=2){
//			System.out.println(name[j]);
//		}

		for(int i = 0; i<name.length; i++){
			if(i%2 == 1) System.out.println((i+1)+"번째 연예인은 "+name[i]);
		}


	}
}
