class Array_Study_04 
{
	public static void main(String[] args) 
	{
		// 이차원 배열
//		int  table[][] = new int[3][4];
//		table[0][0] = 10;
//		table[1][1] = 20;
//		table[2][3] = table[0][0] + table[1][1]; // 초기값이 들어가기 때문에 에러가 나지 않음!
//
//		System.out.println(table[0][0] +"  "+table[1][1]+"  "+table[2][3];

		int table[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}}; // 고정형 배열인 C는 처리 못 함
		
		for(int i = 0; i<table.length; i++){
			for(int j = 0; j<table[i].length; j++){
				System.out.print("table["+i+","+j+"] = "+table[i][j]+"\t  ");
			}
			System.out.println();
		}

	}
}
