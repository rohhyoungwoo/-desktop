package task01;
import java.util.Scanner;

public class TvController {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			BasicTv TvController = new BasicTv("Black", 32, 500000);
			int num = 0;
			while(num <= 3) {
			System.out.println("=== TV 컨트롤 메뉴 ===");
			System.out.printf("1. 전원 On/Off\n2. 채널 올리기\n3. 채널 내리기\n4. 종료\n");
			System.out.println("메뉴 번호 입력 : ");
			num = sc.nextInt();
		
			switch(num) {
			case 1 :
			TvController.powerOnOff();
			break;
			case 2 :
				TvController.channelUp();
				break;
			case 3 :
				TvController.channelDown();
				break;
				default:
					System.out.println("프로그램을 종료합니다");
			}
//			if(num==1) {
//				TvController.powerOnOff();
//			}else if(num==2){
//				TvController.channelUp();
//			}else if(num==3) {
//				TvController.channelDown();
//			}else
//				System.out.println("프로그램을 종료합니다");
//			}
//			break;
//			System.out.println("프로그램을 종료합니다");
			
			
			
			
			}
		}
}

