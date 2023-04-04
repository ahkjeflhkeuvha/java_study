import java.util.Scanner;
public class Height{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        System.out.println("지금부터 당신의 미래 예상키를 알려드리겠습니다.");
        System.out.println();
        
        float mom_height, dad_height;
        System.out.print("어머니 키를 입력해주세요 - ");
        mom_height = sc.nextFloat();
        
        System.out.print("아버지 키를 입력해주세요 - ");
        dad_height = sc.nextFloat();
        
        String gender;
        System.out.print("성별을 입력해주세요(M/W)");
	gender = sc.next();
        
       float result1=((dad_height + 13)+mom_height)/2;
       float result2=((mom_height + 13)+dad_height)/2;
      
        if(gender.equals("M")){
        	System.out.print("당신의 예상키는 "+result1+"입니다");
        }else if(gender.equals("W")){
        	System.out.print("당신의 예상키는 "+result2+"입니다.");
        } else {
        	System.out.print("다시 입력해주세요.");
        }
        
    }
}