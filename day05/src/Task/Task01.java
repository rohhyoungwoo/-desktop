package Task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//로직구성필수!
		//다양항 방법
		
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다

		//1. 입력클래스
		//2. 변수 선언 int 1개
		//3. 출력 메시지 "입력 : "
		//4. 입력 메소드 sc.nextInt();
		//5. 조건1 - 변수%2 == 0 (짝수) 조건2 - 변수%2 == 1 (홀수)
		//6. 출력 메시지 "출력 : 입니다 "
		
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("입력 : ");
//		num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("출력 : 짝수입니다");
//		}else
//		System.out.println("출력 : 홀수입니다");
				
		
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다

		//1. 변수 선언 int 1개
		//2. 출력 메시지 "입력 : "
		//3. 입력 메소드 sc.nextInt();
		//4. 조건 3개 if~else if~else문 사용
		//조건 1 (변수 > 0) 조건 2 (변수 < 0) 조건 3 (변수 = 0)
		//출력
		
//		int num1 = 0;
//		System.out.print("입력 : ");
//		num1 = sc.nextInt();
//		if(num1 > 0) {
//			System.out.println("출력 : 양수입니다");
//		}else if(num1 < 0){
//			System.out.println("출력 : 음수입니다");
//		}else {
//			System.out.println("출력 : 0입니다");
//		}
			
		
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다

		//1.변수 int 1개 선언
		//2. 출력 메시지 "나이입력 : "
		//3. 입력 메소드 sc.nextInt();
		//4. if~else if~else문으로 출력
		
		int age = 0;
		System.out.println("나이입력 : ");
		age = sc.nextInt();
		if(age <= 12) {
			System.out.println("어린이입니다");
		}else if(age <= 19) {
			System.out.println("청소년입니다");
		}else {
			System.out.println("성인입니다");
		}
		
		
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
//
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//
//
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
//
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");


   }
}