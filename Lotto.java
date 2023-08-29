public class Lotto {

	public static void main(String[] args) {
		
		int count = 1000000; // 100만원
		int lotto[] = new int[7]; // 당첨번호 6개 + 보너스 번호
		int human[] = new int[6]; // 당첨번호 6개
		int lucky; // 맞힌 숫자의 개수
		int lucky_b; // 보너스 번호 1 : 맞음, 0 : 아님
		int rank1 = 0, rank2 = 0, rank3 = 0, rank4 = 0, rank5 = 0;
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					} // if
			} // for j
		} // for i
		
		for(int k = 1; k<=count; k++) {
			System.out.printf("[제%5d회]\t",k );
			
			for(int i = 0; i<human.length; i++) {
				human[i] = (int)(Math.random() * 45) + 1;
				for(int j = 0; j<i; j++) {
						if(human[i] == human[j]) {
							i--;
							break;
						} // if
				} // for j
			} // for i
			
			for(int i = 0; i<lotto.length - 1; i++) {
				System.out.printf("%2d ", lotto[i]);
			}
			System.out.printf("[%2d]\t", lotto[6]);
			
			lucky = 0;
			
			for(int i = 0; i<human.length; i++) {
				for(int j = 0; j<6; j++) {
					if(human[i] == lotto[j]) {
						System.out.printf("%5d", human[i]);
						lucky++;
						break;
					} // if
					else if((human[i] != lotto[j]) && (j == 5)){
						System.out.printf("%5d", human[i]);
					} // else if
				} // for j
			}// for i
			
			int i1;
			for(i1=0,lucky_b = 0; i1<human.length; i1++) {
				if(human[i1] == lotto[6]) {
					 lucky_b = 1;
					 break;
				}
			}
		

			switch(lucky) {
			case 6: System.out.print("\t***** 축하합니다! 1등에 당첨 되심요*****"); rank1++; break;
			case 5: 
				if(lucky_b == 1){
					System.out.print("\t***** 축하합니당~~ 2등에 당첨! *****"); rank2++;
				}
				else {
					System.out.print("\t***** 축축 3등입니다~ *****"); rank3++;
				}
				break;
			case 3: System.out.print("\t***** 축축 4등입니다. *****"); rank4++; break;
			case 2: System.out.print("\t***** 축축 5등이빈다. *****"); rank5++; break;
			default: System.out.print("\t꽝"); break;
			}
			System.out.println();
			
		} // for k

		System.out.println("총 도전횟수는 - "+count+"회\n1등 -> "+rank1+"\n2등 -> "+rank2+"\n3등 -> "+rank3+"\n4등 -> "+rank4 + "\n5등 -> "+rank5);
		
		

	} // static
} // class
